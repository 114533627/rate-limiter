package cn.caijiajia.ratelimiter.mapper;

import cn.caijiajia.ratelimiter.core.mybatis.mapper.CommonDaoMapper;
import cn.caijiajia.ratelimiter.model.RequestInfo;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import tk.mybatis.mapper.provider.SpecialProvider;

import java.util.List;

/**
 * request_info 日志记录
 *
 * @author xh
 * @since 2021/01/18
 */
@Mapper
public interface RequestInfoBaseMapper extends CommonDaoMapper<RequestInfo> {
}
