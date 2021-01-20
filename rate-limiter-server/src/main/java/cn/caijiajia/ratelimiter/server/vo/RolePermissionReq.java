package cn.caijiajia.ratelimiter.server.vo;

import lombok.Data;

import java.util.List;

@Data
public class RolePermissionReq {
    private Long roleId;
    private List<Long> ids;
}
