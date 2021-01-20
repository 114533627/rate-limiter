package cn.caijiajia.ratelimiter.model;

import cn.caijiajia.ratelimiter.core.mybatis.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * rate_limiter_info 
 *
 * @author xh
 * @since 2021/01/18
 */
@Table(name = "rate_limiter_info")
public class RateLimiterInfo extends BaseEntity<RateLimiterInfo> {

    private static final long serialVersionUID = 1L;

	/**
	 * name
	 */
	@Column(name = "name") 
	protected String name;

	/**
	 * apps
	 */
	@Column(name = "apps") 
	protected String apps;

	/**
	 * max_permits
	 */
	@Column(name = "max_permits") 
	protected Integer maxPermits;

	/**
	 * rate
	 */
	@Column(name = "rate") 
	protected Integer rate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApps() {
		return apps;
	}

	public void setApps(String apps) {
		this.apps = apps;
	}

	public Integer getMaxPermits() {
		return maxPermits;
	}

	public void setMaxPermits(Integer maxPermits) {
		this.maxPermits = maxPermits;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

    @Override
    public String toString() {
        return "rate_limiter_info{" +
                "id=" + id +
                ", name=" + name +
                ", apps=" + apps +
                ", maxPermits=" + maxPermits +
                ", rate=" + rate +
                ", creator=" + creator +
                ", modifier=" + modifier +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", delFlag=" + delFlag +
                '}';
    }

}
