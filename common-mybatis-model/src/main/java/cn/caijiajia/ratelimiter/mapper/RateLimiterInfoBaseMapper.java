package cn.caijiajia.ratelimiter.mapper;

import cn.caijiajia.ratelimiter.core.mybatis.mapper.CommonDaoMapper;
import cn.caijiajia.ratelimiter.model.RateLimiterInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * rate_limiter_info 
 *
 * @author xh
 * @since 2021/01/18
 */
@Mapper
public interface RateLimiterInfoBaseMapper extends CommonDaoMapper<RateLimiterInfo> {
}
