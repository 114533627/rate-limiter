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
 * role 角色
 *
 * @author xh
 * @since 2021/01/19
 */
@Table(name = "role")
public class Role extends BaseEntity<Role> {

    private static final long serialVersionUID = 1L;

	/**
	 * role_name
	 */
	@Column(name = "role_name") 
	protected String roleName;

	/**
	 * status
	 */
	@Column(name = "status") 
	protected Integer status;

	/**
	 * role_code
	 */
	@Column(name = "role_code") 
	protected String roleCode;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

    @Override
    public String toString() {
        return "role{" +
                "id=" + id +
                ", roleName=" + roleName +
                ", status=" + status +
                ", roleCode=" + roleCode +
                ", delFlag=" + delFlag +
                ", creator=" + creator +
                ", createDate=" + createDate +
                ", modifier=" + modifier +
                ", modifyDate=" + modifyDate +
                '}';
    }

}
