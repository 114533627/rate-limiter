package cn.caijiajia.ratelimiter.mapper;

import cn.caijiajia.ratelimiter.core.mybatis.mapper.CommonDaoMapper;
import cn.caijiajia.ratelimiter.model.RolePermission;
import org.apache.ibatis.annotations.Mapper;

/**
 * role_permission 角色权限表
 *
 * @author xh
 * @since 2021/01/19
 */
@Mapper
public interface RolePermissionBaseMapper extends CommonDaoMapper<RolePermission> {
}
