package com.skyjun.datamigration.source.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * @TableName itsm_service_type
 */
@TableName(value = "itsm_service_type")
public class ItsmServiceTypeSource implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @TableId(type = IdType.NONE)
    private Long id;
    /**
     * 前端使用的扩展字段
     */
    private String configuration;
    /**
     * 描述
     */
    private String serviceTypeContent;
    /**
     * 类别名称
     */
    private String serviceTypeName;
    /**
     *
     */
    private Integer count;
    /**
     * 是否删除
     */
    private Long isDelete;

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
     * 前端使用的扩展字段
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * 前端使用的扩展字段
     */
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * 描述
     */
    public String getServiceTypeContent() {
        return serviceTypeContent;
    }

    /**
     * 描述
     */
    public void setServiceTypeContent(String serviceTypeContent) {
        this.serviceTypeContent = serviceTypeContent;
    }

    /**
     * 类别名称
     */
    public String getServiceTypeName() {
        return serviceTypeName;
    }

    /**
     * 类别名称
     */
    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }

    /**
     *
     */
    public Integer getCount() {
        return count;
    }

    /**
     *
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 是否删除
     */
    public Long getIsDelete() {
        return isDelete;
    }

    /**
     * 是否删除
     */
    public void setIsDelete(Long isDelete) {
        this.isDelete = isDelete;
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
        ItsmServiceTypeSource other = (ItsmServiceTypeSource) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getConfiguration() == null ? other.getConfiguration() == null : this.getConfiguration().equals(other.getConfiguration()))
                && (this.getServiceTypeContent() == null ? other.getServiceTypeContent() == null : this.getServiceTypeContent().equals(other.getServiceTypeContent()))
                && (this.getServiceTypeName() == null ? other.getServiceTypeName() == null : this.getServiceTypeName().equals(other.getServiceTypeName()))
                && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
                && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        result = prime * result + ((getServiceTypeContent() == null) ? 0 : getServiceTypeContent().hashCode());
        result = prime * result + ((getServiceTypeName() == null) ? 0 : getServiceTypeName().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", configuration=").append(configuration);
        sb.append(", serviceTypeContent=").append(serviceTypeContent);
        sb.append(", serviceTypeName=").append(serviceTypeName);
        sb.append(", count=").append(count);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}