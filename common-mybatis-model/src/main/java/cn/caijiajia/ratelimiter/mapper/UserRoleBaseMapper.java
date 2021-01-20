package cn.caijiajia.ratelimiter.mapper;

import cn.caijiajia.ratelimiter.core.mybatis.mapper.CommonDaoMapper;
import cn.caijiajia.ratelimiter.model.UserRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * user_role 用户角色
 *
 * @author xh
 * @since 2021/01/19
 */
@Mapper
public interface UserRoleBaseMapper extends CommonDaoMapper<UserRole> {
}
