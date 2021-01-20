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
 * role_permission 角色权限表
 *
 * @author xh
 * @since 2021/01/19
 */
@Table(name = "role_permission")
public class RolePermission extends BaseEntity<RolePermission> {

    private static final long serialVersionUID = 1L;

	/**
	 * role_id
	 */
	@Column(name = "role_id") 
	protected Long roleId;

	/**
	 * permission_id
	 */
	@Column(name = "permission_id") 
	protected Long permissionId;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
	}

    @Override
    public String toString() {
        return "role_permission{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", permissionId=" + permissionId +
                ", delFlag=" + delFlag +
                ", createDate=" + createDate +
                ", creator=" + creator +
                ", modifier=" + modifier +
                ", modifyDate=" + modifyDate +
                '}';
    }

}
