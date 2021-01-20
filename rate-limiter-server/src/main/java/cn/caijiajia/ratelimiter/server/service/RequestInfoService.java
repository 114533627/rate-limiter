package cn.caijiajia.ratelimiter.server.service;

import cn.caijiajia.ratelimiter.core.common.util.JsonUtils;
import cn.caijiajia.ratelimiter.core.common.web.PageRequest;
import cn.caijiajia.ratelimiter.core.common.web.PageResult;
import cn.caijiajia.ratelimiter.core.mybatis.page.PageUtils;
import cn.caijiajia.ratelimiter.core.mybatis.service.CommonDaoService;
import cn.caijiajia.ratelimiter.core.mybatis.support.IdGen;
import cn.caijiajia.ratelimiter.example.RateLimiterInfoExample;
import cn.caijiajia.ratelimiter.example.RequestInfoExample;
import cn.caijiajia.ratelimiter.model.RateLimiterInfo;
import cn.caijiajia.ratelimiter.model.RequestInfo;
import cn.caijiajia.ratelimiter.model.SysConfig;
import cn.caijiajia.ratelimiter.server.mapper.RequestInfoMapper;
import cn.caijiajia.ratelimiter.server.util.IpUtil;
import cn.caijiajia.ratelimiter.server.vo.RequestInfoReq;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Slf4j
@Service
public class RequestInfoService {

    @Autowired
    @Qualifier("myRedisTemplate")
    private RedisTemplate redisTemplate;
    @Autowired(required = false)
    private CommonDaoService commonDaoService;
    @Autowired
    private SysConfigService sysConfigService;
    @Autowired(required = false)
    private RequestInfoMapper requestInfoMapper;
    @Autowired
    private ObjectMapper objectMapper;

    public static String REDIS_REQQUEST_RECORD_KEY = "req:";
    public static String REDIS_REQQUEST_RECORD_ID_KEY = "req:ids:";
    public static String REDIS_BLACKLIST_KEY = "blacklist";
    public static String REDIS_RECORD_HEADER_NAME_KEY = "record_header_names:";

    public void record(HttpServletRequest request, String context) {

        SysConfig sysConfig = getHeaderNamesConfig(context);

        List<String> recordHeaderNames = new ArrayList<>(); // 只有配置了的请求头才会被记录
        if (sysConfig != null) {
            if (sysConfig.getType() == 1) {
                recordHeaderNames.addAll(JsonUtils.toList(sysConfig.getJsonValue(), String.class));
            }
        }

        HashMap<String, String> headers = new HashMap<>();
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headName = headerNames.nextElement();
            if (recordHeaderNames.contains(headName)) {
                headers.put(headName, request.getHeader(headName));
            }
        }
        String ip = IpUtil.obtainIpFromHttpReq(request);

        Long id = getId();
        RequestInfoReq requestInfo = new RequestInfoReq();
        requestInfo.setId(id);
        requestInfo.setIp(ip);
        requestInfo.setParam(headers);
        requestInfo.setReqTime(System.currentTimeMillis());

        String key = getKey(context);
        redisTemplate.opsForHash().put(key, id.toString(), requestInfo);
        redisTemplate.opsForList().rightPush(REDIS_REQQUEST_RECORD_ID_KEY + context, id.toString());
    }

    private SysConfig getHeaderNamesConfig(String context) {
        Object o = redisTemplate.opsForValue().get(REDIS_RECORD_HEADER_NAME_KEY + context);
        SysConfig sysConfig = null;
        if (o == null) {
            sysConfig = sysConfigService.getByCode(context, "record_header_names");
            redisTemplate.opsForValue().set(REDIS_RECORD_HEADER_NAME_KEY + context, sysConfig, 60 * 60, TimeUnit.SECONDS);
        } else {
            sysConfig = (SysConfig) o;
        }
        return sysConfig;
    }

    private Long getId() {
        return IdGen.snowflakeId();
    }

    private String getKey(Serializable context) {
        return REDIS_REQQUEST_RECORD_KEY + context;
    }

    public PageResult getRequestInfoList(String apps, String startTime, String endTime, PageRequest pageRequest) throws Exception {

        redisToMysql(apps);

        Date startDateTime = null, endDateTime = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (StringUtils.isNotBlank(startTime)) {
            startDateTime = sdf.parse(startTime);
        }
        if (StringUtils.isNotBlank(endTime)) {
            endDateTime = sdf.parse(endTime);
        }

        RequestInfoExample requestInfoExample = new RequestInfoExample();
        requestInfoExample.and().andValid().andAppsEqualTo(apps).andReqTimeGreaterThanOrEqualTo(startDateTime)
                .andReqTimeLessThanOrEqualTo(endDateTime);
        if (StringUtils.isNotBlank(pageRequest.getOrderBy())) {
            Example.OrderBy orderBy = requestInfoExample.orderBy(pageRequest.getOrderBy());
            if (StringUtils.equalsIgnoreCase(pageRequest.getSortType(), "desc")) {
                orderBy.desc();
            } else {
                orderBy.asc();
            }
        }

        PageResult query = PageUtils.query(pageRequest, () -> commonDaoService.selectByExample(requestInfoExample));

        return query;
    }

    private void redisToMysql(String apps) {
        ListOperations listOperations = redisTemplate.opsForList();
        List<String> ids = listOperations.range(REDIS_REQQUEST_RECORD_ID_KEY + apps, 0,
                listOperations.size(REDIS_REQQUEST_RECORD_ID_KEY + apps));
        List<RequestInfoReq> collect = ids.stream().map(id -> {
            return (RequestInfoReq) redisTemplate.opsForHash().get(getKey(apps), id);
        }).collect(Collectors.toList());

        List<RequestInfo> requestInfos = new ArrayList<>();
        for (RequestInfoReq requestInfoReq : collect) {
            if (requestInfoReq != null) requestInfos.add(convert(requestInfoReq, apps));
        }

        if (requestInfos.size() > 0) {
            commonDaoService.insertList(requestInfos);
            ids.forEach(id -> {
                redisTemplate.opsForHash().delete(getKey(apps), id);
            });
        }
    }

    private RequestInfo convert(RequestInfoReq requestInfoReq, String context) {
        RequestInfo requestInfo = new RequestInfo();
        requestInfo.setId(requestInfoReq.getId());
        requestInfo.setApps(context);
        requestInfo.setIp(requestInfoReq.getIp());
        requestInfo.setReqTime(new Date(requestInfoReq.getReqTime()));
        try {
            requestInfo.setParam(objectMapper.writeValueAsString(requestInfoReq.getParam()));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return requestInfo;
    }

    public PageResult sumRequestInfoByIpList(String apps, String startTime, String endTime, PageRequest pageRequest) throws Exception {

        Date startDateTime = null, endDateTime = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (StringUtils.isNotBlank(startTime)) {
            startDateTime = sdf.parse(startTime);
        }
        if (StringUtils.isNotBlank(endTime)) {
            endDateTime = sdf.parse(endTime);
        }

        Date finalStartDateTime = startDateTime;
        Date finalEndDateTime = endDateTime;
        PageResult query = PageUtils.query(pageRequest, () -> requestInfoMapper.sumRequestInfoByIpList(apps, finalStartDateTime, finalEndDateTime, pageRequest));

        return query;

    }

    /**
     * @param request
     * @return boolean 返回true 表示限制访问，否则不限制
     */
    public boolean blacklistHandler(HttpServletRequest request) {
        boolean limit = false;
        String ip = IpUtil.obtainIpFromHttpReq(request);
        Object o = redisTemplate.opsForValue().get(REDIS_BLACKLIST_KEY);
        List<String> list = null;
        if (o == null) {
            list = new ArrayList<>();
        } else {
            list = (List<String>) o;
        }
        for (String blacklistIp : list) {
            limit = limit || ip.startsWith(blacklistIp);
            if (limit) break;
        }
        return limit;
    }

    @Scheduled(fixedDelay = 1000 * 60 * 60, initialDelay = 1000 * 10)
    public void updateBlackListRedis() throws Exception {
        try {
            log.info("updateBlackListRedis start.....");
            blacklistIpToRedis();
            log.info("updateBlackListRedis  end.....");
        } catch (Exception e) {
            log.error("updateBlackListRedis error.....", e);
        }
    }

    @Scheduled(fixedDelay = 1000 * 5 * 60, initialDelay = 1000 * 10)
    public void requestInfoFromRedisToMysql() throws Exception {
        try {
            log.info("requestInfoFromRedisToMysql redis -> mysql start.....");
            RateLimiterInfoExample rateLimiterInfoExample = new RateLimiterInfoExample();
            List<RateLimiterInfo> rateLimiterInfoList = commonDaoService.selectByExample(rateLimiterInfoExample);
            List<String> collect = rateLimiterInfoList.stream().map(RateLimiterInfo::getApps).collect(Collectors.toList());
            for (String context : collect) {
                redisToMysql(context);
            }
            log.info("requestInfoFromRedisToMysql redis -> mysql  end.....");
        } catch (Exception e) {
            log.error("requestInfoFromRedisToMysql redis -> mysql  error.....", e);
        }
    }

    public void blacklistIpToRedis() {
        SysConfig sysConfig = sysConfigService.getByCode(null, "ip_blacklist");
        String jsonValue = sysConfig.getJsonValue();
        ArrayList<String> blacklists = JsonUtils.toList(jsonValue, String.class);
        redisTemplate.opsForValue().set(REDIS_BLACKLIST_KEY, blacklists, 60 * 60 * 3, TimeUnit.SECONDS);
    }
}
