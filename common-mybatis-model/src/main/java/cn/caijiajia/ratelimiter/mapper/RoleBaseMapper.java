package cn.caijiajia.ratelimiter.mapper;

import cn.caijiajia.ratelimiter.core.mybatis.mapper.CommonDaoMapper;
import cn.caijiajia.ratelimiter.model.Role;
import org.apache.ibatis.annotations.Mapper;

/**
 * role 角色
 *
 * @author xh
 * @since 2021/01/19
 */
@Mapper
public interface RoleBaseMapper extends CommonDaoMapper<Role> {
}
