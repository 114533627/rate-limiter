package cn.caijiajia.ratelimiter.server.vo;

import lombok.Data;

@Data
public class LoginReq {
    private String username;
    private String password;
}
