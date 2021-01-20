package cn.caijiajia.ratelimiter.server.mapper;

import cn.caijiajia.ratelimiter.core.common.web.PageRequest;
import cn.caijiajia.ratelimiter.server.vo.IpRequestSum;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface RequestInfoMapper {


    List<IpRequestSum> sumRequestInfoByIpList(@Param("apps") String apps,
                                              @Param("startDateTime") Date startDateTime,
                                              @Param("endDateTime") Date endDateTime,
                                              @Param("pageRequest") PageRequest pageRequest);
}
