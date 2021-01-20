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
 * sys_config 参数配置表
 *
 * @author xh
 * @since 2021/01/18
 */
@Table(name = "sys_config")
public class SysConfig extends BaseEntity<SysConfig> {

    private static final long serialVersionUID = 1L;

	/**
	 * apps
	 */
	@Column(name = "apps") 
	protected String apps;

	/**
	 * code
	 */
	@Column(name = "code") 
	protected String code;

	/**
	 * type 类型 0 单值 1 json
	 */
	@Column(name = "type") 
	protected Integer type;

	/**
	 * value
	 */
	@Column(name = "value") 
	protected String value;

	/**
	 * json_value
	 */
	@Column(name = "json_value") 
	protected String jsonValue;

	/**
	 * remark
	 */
	@Column(name = "remark") 
	protected String remark;

	public String getApps() {
		return apps;
	}

	public void setApps(String apps) {
		this.apps = apps;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getJsonValue() {
		return jsonValue;
	}

	public void setJsonValue(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

    @Override
    public String toString() {
        return "sys_config{" +
                "id=" + id +
                ", apps=" + apps +
                ", code=" + code +
                ", type=" + type +
                ", value=" + value +
                ", jsonValue=" + jsonValue +
                ", remark=" + remark +
                ", creator=" + creator +
                ", modifier=" + modifier +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", delFlag=" + delFlag +
                '}';
    }

}
