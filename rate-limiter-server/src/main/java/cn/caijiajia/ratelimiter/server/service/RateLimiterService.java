package cn.caijiajia.ratelimiter.server.service;

import cn.caijiajia.ratelimiter.client.RateLimiterClient;
import cn.caijiajia.ratelimiter.client.RateLimiterConstants;
import cn.caijiajia.ratelimiter.core.mybatis.service.CommonDaoService;
import cn.caijiajia.ratelimiter.example.RateLimiterInfoExample;
import cn.caijiajia.ratelimiter.model.RateLimiterInfo;
import cn.caijiajia.ratelimiter.server.form.RateLimiterForm;
import cn.caijiajia.ratelimiter.server.vo.RateLimiterVo;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.StringRedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import redis.clients.util.JedisByteHashMap;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @author wukaiqiang
 */
@Slf4j
@Service
public class RateLimiterService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Resource(name = "rateLimiterLua")
    private RedisScript<Long> rateLimiterLua;

    @Autowired(required = false)
    private CommonDaoService commonDaoService;
    @Autowired
    private RateLimiterClient rateLimiterClient;

    private String getKey(String context, String key) {
        return RateLimiterConstants.RATE_LIMITER_KEY_PREFIX + context + ":" + key;
    }

    public List<RateLimiterVo> getRateLimiters(String apps, Long id) {
        RateLimiterInfoExample rateLimiterInfoExample = new RateLimiterInfoExample();
        RateLimiterInfoExample.Criteria c = rateLimiterInfoExample.and();
        if(StringUtils.isNotBlank(apps))c.andAppsEqualTo(apps);
        if(id!=null) c.andIdEqualTo(id);
        List<RateLimiterInfo> rateLimiterInfoList = commonDaoService.selectByExample(rateLimiterInfoExample);

        List<Object> rateLimiterListFromRedis = stringRedisTemplate.executePipelined((RedisCallback<Object>) connection -> {
            StringRedisConnection stringRedisConn = (StringRedisConnection) connection;
            for (RateLimiterInfo rateLimiterInfo : rateLimiterInfoList) {
                rateLimiterClient.acquire(rateLimiterInfo.getApps(), rateLimiterInfo.getName()); // 获取一个令牌，以触发令牌桶当前令牌数的刷新
                stringRedisConn.hGetAll(getKey(rateLimiterInfo.getApps(), rateLimiterInfo.getName()));
            }
            return null;
        });


        List<RateLimiterVo> rateLimiterRespList = Lists.newArrayListWithCapacity(rateLimiterInfoList.size());

        for (int i = 0; i < rateLimiterListFromRedis.size(); i++) {
            Object object = rateLimiterListFromRedis.get(i);
            if ((object instanceof JedisByteHashMap)) {
                continue;
            }
            RateLimiterInfo rateLimiterInfo = rateLimiterInfoList.get(i);
            HashMap<String, String> rateLimiterMap = (HashMap<String, String>) object;
            rateLimiterRespList.add(RateLimiterVo.builder()
                    .id(rateLimiterInfo.getId())
                    .name(rateLimiterInfo.getName())
                    .apps(rateLimiterMap.get("apps"))
                    .maxPermits(Integer.parseInt(rateLimiterMap.get("max_permits")))
                    .currPermits(Integer.parseInt(rateLimiterMap.get("curr_permits")))
                    .rate(Integer.parseInt(rateLimiterMap.get("rate")))
                    .lastPermitTimestamp(rateLimiterMap.get("last_mill_second"))
                    .build());
        }
        return rateLimiterRespList;
    }


    public void saveOrUpdateRateLimiter(RateLimiterForm form) {
        RateLimiterInfo rateLimiterInfo = getByContextAndName(form.getApps(), form.getName());
        String apps = form.getApps();
        if (rateLimiterInfo != null) {
            rateLimiterInfo.setApps(form.getApps());
            rateLimiterInfo.setMaxPermits(form.getMaxPermits());
            rateLimiterInfo.setName(form.getName());
            rateLimiterInfo.setRate(form.getRate());
            commonDaoService.update(rateLimiterInfo);
        } else {
            rateLimiterInfo = new RateLimiterInfo();
            rateLimiterInfo.setApps(form.getApps());
            rateLimiterInfo.setMaxPermits(form.getMaxPermits());
            rateLimiterInfo.setName(form.getName());
            rateLimiterInfo.setRate(form.getRate());
            commonDaoService.insert(rateLimiterInfo);
        }

        stringRedisTemplate.execute(rateLimiterLua,
                ImmutableList.of(getKey(form.getApps(), form.getName())),
                RateLimiterConstants.RATE_LIMITER_INIT_METHOD, form.getMaxPermits() + "", form.getRate() + "", apps);
    }

    private RateLimiterInfo getByContextAndName(String context, String name) {
        RateLimiterInfoExample rateLimiterInfoExample = new RateLimiterInfoExample();
        rateLimiterInfoExample.and().andNameEqualTo(name).andAppsEqualTo(context).andValid();
        return commonDaoService.selectOneByExample(rateLimiterInfoExample);
    }


    public void deleteRateLimiter(String context, String name) {
        RateLimiterInfo rateLimiterInfo = getByContextAndName(context, name);
        if (rateLimiterInfo != null) {
            commonDaoService.deletePhysically(rateLimiterInfo);
            stringRedisTemplate.execute(rateLimiterLua,
                    ImmutableList.of(getKey(context, name)),
                    RateLimiterConstants.RATE_LIMITER_DELETE_METHOD, rateLimiterInfo.getMaxPermits().toString(), rateLimiterInfo.getRate().toString(),context);
        }
    }



    @Scheduled(fixedDelay = 1000*3*60, initialDelay = 1000*10)
    public void afterPropertiesSet() throws Exception {
        try {
            log.info("diff db and redis job start.....");
            RateLimiterInfoExample rateLimiterInfoExample = new RateLimiterInfoExample();
            List<RateLimiterInfo> rateLimiterInfoList = commonDaoService.selectByExample(rateLimiterInfoExample);
            for (RateLimiterInfo rateLimiterInfo : rateLimiterInfoList) {
                stringRedisTemplate.execute(rateLimiterLua,
                        ImmutableList.of(getKey(rateLimiterInfo.getApps(), rateLimiterInfo.getName())),
                        RateLimiterConstants.RATE_LIMITER_INIT_METHOD, rateLimiterInfo.getMaxPermits().toString(), rateLimiterInfo.getRate().toString(), rateLimiterInfo.getApps());
            }
            log.info("diff db and redis job end.....");
        } catch (Exception e) {
            log.error("diff db and redis error.....", e);
        }
    }
}
