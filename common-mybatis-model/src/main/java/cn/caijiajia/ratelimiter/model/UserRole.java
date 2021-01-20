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
 * user_role 用户角色
 *
 * @author xh
 * @since 2021/01/19
 */
@Table(name = "user_role")
public class UserRole extends BaseEntity<UserRole> {

    private static final long serialVersionUID = 1L;

	/**
	 * user_id
	 */
	@Column(name = "user_id") 
	protected Long userId;

	/**
	 * role_id
	 */
	@Column(name = "role_id") 
	protected Long roleId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

    @Override
    public String toString() {
        return "user_role{" +
                "id=" + id +
                ", userId=" + userId +
                ", roleId=" + roleId +
                ", delFlag=" + delFlag +
                ", createDate=" + createDate +
                ", creator=" + creator +
                ", modifier=" + modifier +
                ", modifyDate=" + modifyDate +
                '}';
    }

}
