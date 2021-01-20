package cn.caijiajia.ratelimiter.server.vo;

import lombok.Data;


@Data
public class IpRequestSum {
    private String ip;
    private String params;//请求参数记录
    private String times;//请求时间
    private int num = 0;
    private String apps;
}
