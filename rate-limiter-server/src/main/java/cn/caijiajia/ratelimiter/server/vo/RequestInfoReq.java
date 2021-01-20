package cn.caijiajia.ratelimiter.server.vo;

import java.io.Serializable;
import java.util.Map;

/**
 * 请求信息记录
 */
public class RequestInfoReq implements Serializable {


    private static final long serialVersionUID = -911243644898079375L;

    private Long id;

    private String ip;//ip
    private Long reqTime;//请求时间
    private Map<String, String> param;//其它需要记录的参数
    private String userId;//用户id

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Map<String, String> getParam() {
        return param;
    }

    public void setParam(Map<String, String> param) {
        this.param = param;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getReqTime() {
        return reqTime;
    }

    public void setReqTime(Long reqTime) {
        this.reqTime = reqTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
