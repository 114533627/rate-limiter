package cn.caijiajia.ratelimiter.model;

import cn.caijiajia.ratelimiter.core.mybatis.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * request_info 日志记录
 *
 * @author xh
 * @since 2021/01/18
 */
@Table(name = "request_info")
public class RequestInfo extends BaseEntity<RequestInfo> {

    private static final long serialVersionUID = 1L;

	/**
	 * ip
	 */
	@Column(name = "ip") 
	protected String ip;

	/**
	 * apps
	 */
	@Column(name = "apps") 
	protected String apps;

	/**
	 * user_id
	 */
	@Column(name = "user_id") 
	protected String userId;

	/**
	 * req_time
	 */
	@Column(name = "req_time") 
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8") 
	protected Date reqTime;

	/**
	 * param
	 */
	@Column(name = "param") 
	protected String param;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getApps() {
		return apps;
	}

	public void setApps(String apps) {
		this.apps = apps;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getReqTime() {
		return reqTime;
	}

	public void setReqTime(Date reqTime) {
		this.reqTime = reqTime;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

    @Override
    public String toString() {
        return "request_info{" +
                "id=" + id +
                ", ip=" + ip +
                ", apps=" + apps +
                ", userId=" + userId +
                ", reqTime=" + reqTime +
                ", param=" + param +
                ", creator=" + creator +
                ", modifier=" + modifier +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", delFlag=" + delFlag +
                '}';
    }

}
