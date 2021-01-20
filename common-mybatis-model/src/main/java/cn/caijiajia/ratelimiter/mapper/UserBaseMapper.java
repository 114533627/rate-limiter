package cn.caijiajia.ratelimiter.mapper;

import cn.caijiajia.ratelimiter.core.mybatis.mapper.CommonDaoMapper;
import cn.caijiajia.ratelimiter.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * user 用户
 *
 * @author xh
 * @since 2021/01/19
 */
@Mapper
public interface UserBaseMapper extends CommonDaoMapper<User> {
}
