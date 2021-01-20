package cn.caijiajia.ratelimiter.core.mybatis.model;

import cn.caijiajia.ratelimiter.core.mybatis.support.IdGen;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
public class BaseEntity <T> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    protected Long id;

    /**
     * 创建者
     */
    protected String creator;

    /**
     * 创建日期
     */
    @Column(name = "create_date")
    protected Date createDate;

    /**
     * 更新者
     */
    protected String modifier;

    /**
     * 更新日期
     */

    @Column(name = "modify_date")
    protected Date modifyDate;

    /**
     * 删除标记 0:正常，1-删除
     */
    @Column(name = "del_flag")
    protected Integer delFlag = 0;


    /**
     * 是否为新记录
     */
    @Transient  //不映射该属性到数据库
    protected boolean isNewRecord;


    public BaseEntity(Long id) {
        this();
        this.id = id;
    }

    /**
     * 是否为新记录
     *
     * @return boolean
     */
    public boolean isNewRecord() {
        return this.isNewRecord || this.getId() == null;
    }

    /**
     * 设置基本属性
     *
     * @param userCode        用户编码
     */
    public void setCommonValue(String userCode) {
        Date currentDate = new Date();
        if (this.isNewRecord()) {
            this.setId(IdGen.snowflakeId());
            this.setNewRecord(true);
            this.creator = userCode;
            this.createDate = currentDate;
        }
        this.modifier = userCode;
        this.modifyDate = currentDate;
        this.delFlag = 0;
    }

    /**
     * 置空属性
     */
    public void clearCommonValue() {
        this.creator = null;
        this.createDate = null;
        this.modifier = null;
        this.modifyDate = null;
        this.delFlag = null;
    }
}
