package cn.caijiajia.ratelimiter.server.vo;

import cn.caijiajia.ratelimiter.model.Permission;
import cn.caijiajia.ratelimiter.model.Role;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Data
public class RoleVo extends Role {
    private List<Permission> erpMemberPermissions;

    public RoleVo(Role role){
        BeanUtils.copyProperties(role,this);
    }
}
