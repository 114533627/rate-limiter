package cn.caijiajia.ratelimiter.mapper;

import cn.caijiajia.ratelimiter.core.mybatis.mapper.CommonDaoMapper;
import cn.caijiajia.ratelimiter.model.Permission;
import org.apache.ibatis.annotations.Mapper;

/**
 * permission 权限表
 *
 * @author xh
 * @since 2021/01/19
 */
@Mapper
public interface PermissionBaseMapper extends CommonDaoMapper<Permission> {
}
