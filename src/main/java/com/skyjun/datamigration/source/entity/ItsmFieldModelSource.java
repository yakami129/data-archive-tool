package com.skyjun.datamigration.source.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName itsm_field_model
 */
@TableName(value = "itsm_field_model")
public class ItsmFieldModelSource implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @TableId(type = IdType.NONE)
    private Long id;
    /**
     * 流程模型ID
     */
    private Long actPid;
    /**
     * 任务ID
     */
    private Long itsmTaskId;
    /**
     * 字段ID
     */
    private Long itsmFieidId;
    /**
     * 字段名称
     */
    private String itsmFieidName;
    /**
     * 字段编码
     */
    private String itsmFieidNum;
    /**
     * 控件类型
     */
    private String itsmFieidControlType;
    /**
     * 是否可读：0：否 1：是
     */
    private Long itsmFieidModelIsreadable;
    /**
     * 是否可写 0：否 1：是
     */
    private Long itsmFieidModelIswrite;
    /**
     * 是否必输：0：否 1：是
     */
    private Long itsmFieidModelIsmust;
    /**
     * 属性
     */
    private Long itsmProperty;
    /**
     * 布局位置
     */
    private Long layoutPosition;
    /**
     *
     */
    private Date createDate;
    /**
     *
     */
    private Date updateDate;
    /**
     * h5是否隐藏字段
     */
    private Boolean h5Hide;

    /**
     *
     */
    public Long getId() {
        return id;
    }

    /**
     *
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 流程模型ID
     */
    public Long getActPid() {
        return actPid;
    }

    /**
     * 流程模型ID
     */
    public void setActPid(Long actPid) {
        this.actPid = actPid;
    }

    /**
     * 任务ID
     */
    public Long getItsmTaskId() {
        return itsmTaskId;
    }

    /**
     * 任务ID
     */
    public void setItsmTaskId(Long itsmTaskId) {
        this.itsmTaskId = itsmTaskId;
    }

    /**
     * 字段ID
     */
    public Long getItsmFieidId() {
        return itsmFieidId;
    }

    /**
     * 字段ID
     */
    public void setItsmFieidId(Long itsmFieidId) {
        this.itsmFieidId = itsmFieidId;
    }

    /**
     * 字段名称
     */
    public String getItsmFieidName() {
        return itsmFieidName;
    }

    /**
     * 字段名称
     */
    public void setItsmFieidName(String itsmFieidName) {
        this.itsmFieidName = itsmFieidName;
    }

    /**
     * 字段编码
     */
    public String getItsmFieidNum() {
        return itsmFieidNum;
    }

    /**
     * 字段编码
     */
    public void setItsmFieidNum(String itsmFieidNum) {
        this.itsmFieidNum = itsmFieidNum;
    }

    /**
     * 控件类型
     */
    public String getItsmFieidControlType() {
        return itsmFieidControlType;
    }

    /**
     * 控件类型
     */
    public void setItsmFieidControlType(String itsmFieidControlType) {
        this.itsmFieidControlType = itsmFieidControlType;
    }

    /**
     * 是否可读：0：否 1：是
     */
    public Long getItsmFieidModelIsreadable() {
        return itsmFieidModelIsreadable;
    }

    /**
     * 是否可读：0：否 1：是
     */
    public void setItsmFieidModelIsreadable(Long itsmFieidModelIsreadable) {
        this.itsmFieidModelIsreadable = itsmFieidModelIsreadable;
    }

    /**
     * 是否可写 0：否 1：是
     */
    public Long getItsmFieidModelIswrite() {
        return itsmFieidModelIswrite;
    }

    /**
     * 是否可写 0：否 1：是
     */
    public void setItsmFieidModelIswrite(Long itsmFieidModelIswrite) {
        this.itsmFieidModelIswrite = itsmFieidModelIswrite;
    }

    /**
     * 是否必输：0：否 1：是
     */
    public Long getItsmFieidModelIsmust() {
        return itsmFieidModelIsmust;
    }

    /**
     * 是否必输：0：否 1：是
     */
    public void setItsmFieidModelIsmust(Long itsmFieidModelIsmust) {
        this.itsmFieidModelIsmust = itsmFieidModelIsmust;
    }

    /**
     * 属性
     */
    public Long getItsmProperty() {
        return itsmProperty;
    }

    /**
     * 属性
     */
    public void setItsmProperty(Long itsmProperty) {
        this.itsmProperty = itsmProperty;
    }

    /**
     * 布局位置
     */
    public Long getLayoutPosition() {
        return layoutPosition;
    }

    /**
     * 布局位置
     */
    public void setLayoutPosition(Long layoutPosition) {
        this.layoutPosition = layoutPosition;
    }

    /**
     *
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     *
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     *
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     *
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * h5是否隐藏字段
     */
    public Boolean getH5Hide() {
        return h5Hide;
    }

    /**
     * h5是否隐藏字段
     */
    public void setH5Hide(Boolean h5Hide) {
        this.h5Hide = h5Hide;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ItsmFieldModelSource other = (ItsmFieldModelSource) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getActPid() == null ? other.getActPid() == null : this.getActPid().equals(other.getActPid()))
                && (this.getItsmTaskId() == null ? other.getItsmTaskId() == null : this.getItsmTaskId().equals(other.getItsmTaskId()))
                && (this.getItsmFieidId() == null ? other.getItsmFieidId() == null : this.getItsmFieidId().equals(other.getItsmFieidId()))
                && (this.getItsmFieidName() == null ? other.getItsmFieidName() == null : this.getItsmFieidName().equals(other.getItsmFieidName()))
                && (this.getItsmFieidNum() == null ? other.getItsmFieidNum() == null : this.getItsmFieidNum().equals(other.getItsmFieidNum()))
                && (this.getItsmFieidControlType() == null ? other.getItsmFieidControlType() == null : this.getItsmFieidControlType().equals(other.getItsmFieidControlType()))
                && (this.getItsmFieidModelIsreadable() == null ? other.getItsmFieidModelIsreadable() == null : this.getItsmFieidModelIsreadable().equals(other.getItsmFieidModelIsreadable()))
                && (this.getItsmFieidModelIswrite() == null ? other.getItsmFieidModelIswrite() == null : this.getItsmFieidModelIswrite().equals(other.getItsmFieidModelIswrite()))
                && (this.getItsmFieidModelIsmust() == null ? other.getItsmFieidModelIsmust() == null : this.getItsmFieidModelIsmust().equals(other.getItsmFieidModelIsmust()))
                && (this.getItsmProperty() == null ? other.getItsmProperty() == null : this.getItsmProperty().equals(other.getItsmProperty()))
                && (this.getLayoutPosition() == null ? other.getLayoutPosition() == null : this.getLayoutPosition().equals(other.getLayoutPosition()))
                && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
                && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
                && (this.getH5Hide() == null ? other.getH5Hide() == null : this.getH5Hide().equals(other.getH5Hide()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getActPid() == null) ? 0 : getActPid().hashCode());
        result = prime * result + ((getItsmTaskId() == null) ? 0 : getItsmTaskId().hashCode());
        result = prime * result + ((getItsmFieidId() == null) ? 0 : getItsmFieidId().hashCode());
        result = prime * result + ((getItsmFieidName() == null) ? 0 : getItsmFieidName().hashCode());
        result = prime * result + ((getItsmFieidNum() == null) ? 0 : getItsmFieidNum().hashCode());
        result = prime * result + ((getItsmFieidControlType() == null) ? 0 : getItsmFieidControlType().hashCode());
        result = prime * result + ((getItsmFieidModelIsreadable() == null) ? 0 : getItsmFieidModelIsreadable().hashCode());
        result = prime * result + ((getItsmFieidModelIswrite() == null) ? 0 : getItsmFieidModelIswrite().hashCode());
        result = prime * result + ((getItsmFieidModelIsmust() == null) ? 0 : getItsmFieidModelIsmust().hashCode());
        result = prime * result + ((getItsmProperty() == null) ? 0 : getItsmProperty().hashCode());
        result = prime * result + ((getLayoutPosition() == null) ? 0 : getLayoutPosition().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getH5Hide() == null) ? 0 : getH5Hide().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", actPid=").append(actPid);
        sb.append(", itsmTaskId=").append(itsmTaskId);
        sb.append(", itsmFieidId=").append(itsmFieidId);
        sb.append(", itsmFieidName=").append(itsmFieidName);
        sb.append(", itsmFieidNum=").append(itsmFieidNum);
        sb.append(", itsmFieidControlType=").append(itsmFieidControlType);
        sb.append(", itsmFieidModelIsreadable=").append(itsmFieidModelIsreadable);
        sb.append(", itsmFieidModelIswrite=").append(itsmFieidModelIswrite);
        sb.append(", itsmFieidModelIsmust=").append(itsmFieidModelIsmust);
        sb.append(", itsmProperty=").append(itsmProperty);
        sb.append(", layoutPosition=").append(layoutPosition);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", h5Hide=").append(h5Hide);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}