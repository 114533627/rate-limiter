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
 * user 用户
 *
 * @author xh
 * @since 2021/01/19
 */
@Table(name = "user")
public class User extends BaseEntity<User> {

    private static final long serialVersionUID = 1L;

	/**
	 * name
	 */
	@Column(name = "name") 
	protected String name;

	/**
	 * real_name
	 */
	@Column(name = "real_name") 
	protected String realName;

	/**
	 * mobile
	 */
	@Column(name = "mobile") 
	protected String mobile;

	/**
	 * login_name
	 */
	@Column(name = "login_name") 
	protected String loginName;

	/**
	 * address
	 */
	@Column(name = "address") 
	protected String address;

	/**
	 * email
	 */
	@Column(name = "email") 
	protected String email;

	/**
	 * last_login_time
	 */
	@Column(name = "last_login_time") 
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8") 
	protected Date lastLoginTime;

	/**
	 * password
	 */
	@Column(name = "password") 
	protected String password;

	/**
	 * avatar 头像
	 */
	@Column(name = "avatar") 
	protected String avatar;

	/**
	 * status 停用启用
	 */
	@Column(name = "status") 
	protected Integer status;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name=" + name +
                ", realName=" + realName +
                ", mobile=" + mobile +
                ", loginName=" + loginName +
                ", address=" + address +
                ", email=" + email +
                ", lastLoginTime=" + lastLoginTime +
                ", delFlag=" + delFlag +
                ", creator=" + creator +
                ", createDate=" + createDate +
                ", modifier=" + modifier +
                ", modifyDate=" + modifyDate +
                ", password=" + password +
                ", avatar=" + avatar +
                ", status=" + status +
                '}';
    }

}
