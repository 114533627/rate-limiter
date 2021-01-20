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
 * permission 权限表
 *
 * @author xh
 * @since 2021/01/19
 */
@Table(name = "permission")
public class Permission extends BaseEntity<Permission> {

    private static final long serialVersionUID = 1L;

	/**
	 * permission_code
	 */
	@Column(name = "permission_code") 
	protected String permissionCode;

	/**
	 * permission_name
	 */
	@Column(name = "permission_name") 
	protected String permissionName;

	/**
	 * resource_level
	 */
	@Column(name = "resource_level") 
	protected Integer resourceLevel;

	/**
	 * description
	 */
	@Column(name = "description") 
	protected String description;

	/**
	 * parent_id
	 */
	@Column(name = "parent_id") 
	protected Long parentId;

	public String getPermissionCode() {
		return permissionCode;
	}

	public void setPermissionCode(String permissionCode) {
		this.permissionCode = permissionCode;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public Integer getResourceLevel() {
		return resourceLevel;
	}

	public void setResourceLevel(Integer resourceLevel) {
		this.resourceLevel = resourceLevel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

    @Override
    public String toString() {
        return "permission{" +
                "id=" + id +
                ", permissionCode=" + permissionCode +
                ", permissionName=" + permissionName +
                ", resourceLevel=" + resourceLevel +
                ", description=" + description +
                ", parentId=" + parentId +
                ", delFlag=" + delFlag +
                ", creator=" + creator +
                ", createDate=" + createDate +
                ", modifier=" + modifier +
                ", modifyDate=" + modifyDate +
                '}';
    }

}
