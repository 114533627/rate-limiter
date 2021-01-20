package cn.caijiajia.ratelimiter.server.vo;

import cn.caijiajia.ratelimiter.model.Role;
import cn.caijiajia.ratelimiter.model.User;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Data
public class UserVo extends User {

    private List<Role> erpMemberRoles;

    public UserVo(User user){
        BeanUtils.copyProperties(user,this);
    }
}
