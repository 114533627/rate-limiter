package cn.caijiajia.ratelimiter.server.vo;

import cn.caijiajia.ratelimiter.model.Permission;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Data
public class PermissionVo extends Permission {

    private List<PermissionVo> erpMemberPermissions;

    public PermissionVo(Permission permission){
        BeanUtils.copyProperties(permission,this);
    }
}
