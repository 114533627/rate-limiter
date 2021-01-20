package cn.caijiajia.ratelimiter.server.vo;

import lombok.Data;

import java.util.List;
@Data
public class UserInfoVo {

    private String avatar;
    private String name;
    private List<String> roles;
    private List<String> data;
}
