package cn.caijiajia.ratelimiter.mapper;

import cn.caijiajia.ratelimiter.core.mybatis.mapper.CommonDaoMapper;
import cn.caijiajia.ratelimiter.model.SysConfig;
import org.apache.ibatis.annotations.Mapper;

/**
 * sys_config 参数配置表
 *
 * @author xh
 * @since 2021/01/18
 */
@Mapper
public interface SysConfigBaseMapper extends CommonDaoMapper<SysConfig> {
}
