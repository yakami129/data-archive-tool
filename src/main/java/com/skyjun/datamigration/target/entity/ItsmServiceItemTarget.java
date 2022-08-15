package com.skyjun.datamigration.target.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName itsm_service_item
 */
@TableName(value ="itsm_service_item")
public class ItsmServiceItemTarget implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.NONE)
    private Long id;

    /**
     * 服务项名称
     */
    private String serviceItemName;

    /**
     * 负责人
     */
    private String serviceItemHead;

    /**
     * 服务描述
     */
    private String serviceContent;

    /**
     * 流程模型ID
     */
    private Long processModelId;

    /**
     * 启动任务ID
     */
    private Long startTaskId;

    /**
     * 服务项类型
     */
    private Long serviceItemType;

    /**
     * 流程模型名称
     */
    private String processModelName;

    /**
     * 服务场景
     */
    private String serviceItemScene;

    /**
     * 服务时间
     */
    private String serviceDate;

    /**
     * SLA ID
     */
    private Long slaId;

    /**
     * 
     */
    private Date createDate;

    /**
     * 
     */
    private Date updateDate;

    /**
     * 针对门户用户过滤的字段列表
     */
    private String filterFields;

    /**
     * 产品组id
     */
    private Long productGroupId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
     * 服务项名称
     */
    public String getServiceItemName() {
        return serviceItemName;
    }

    /**
     * 服务项名称
     */
    public void setServiceItemName(String serviceItemName) {
        this.serviceItemName = serviceItemName;
    }

    /**
     * 负责人
     */
    public String getServiceItemHead() {
        return serviceItemHead;
    }

    /**
     * 负责人
     */
    public void setServiceItemHead(String serviceItemHead) {
        this.serviceItemHead = serviceItemHead;
    }

    /**
     * 服务描述
     */
    public String getServiceContent() {
        return serviceContent;
    }

    /**
     * 服务描述
     */
    public void setServiceContent(String serviceContent) {
        this.serviceContent = serviceContent;
    }

    /**
     * 流程模型ID
     */
    public Long getProcessModelId() {
        return processModelId;
    }

    /**
     * 流程模型ID
     */
    public void setProcessModelId(Long processModelId) {
        this.processModelId = processModelId;
    }

    /**
     * 启动任务ID
     */
    public Long getStartTaskId() {
        return startTaskId;
    }

    /**
     * 启动任务ID
     */
    public void setStartTaskId(Long startTaskId) {
        this.startTaskId = startTaskId;
    }

    /**
     * 服务项类型
     */
    public Long getServiceItemType() {
        return serviceItemType;
    }

    /**
     * 服务项类型
     */
    public void setServiceItemType(Long serviceItemType) {
        this.serviceItemType = serviceItemType;
    }

    /**
     * 流程模型名称
     */
    public String getProcessModelName() {
        return processModelName;
    }

    /**
     * 流程模型名称
     */
    public void setProcessModelName(String processModelName) {
        this.processModelName = processModelName;
    }

    /**
     * 服务场景
     */
    public String getServiceItemScene() {
        return serviceItemScene;
    }

    /**
     * 服务场景
     */
    public void setServiceItemScene(String serviceItemScene) {
        this.serviceItemScene = serviceItemScene;
    }

    /**
     * 服务时间
     */
    public String getServiceDate() {
        return serviceDate;
    }

    /**
     * 服务时间
     */
    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    /**
     * SLA ID
     */
    public Long getSlaId() {
        return slaId;
    }

    /**
     * SLA ID
     */
    public void setSlaId(Long slaId) {
        this.slaId = slaId;
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
     * 针对门户用户过滤的字段列表
     */
    public String getFilterFields() {
        return filterFields;
    }

    /**
     * 针对门户用户过滤的字段列表
     */
    public void setFilterFields(String filterFields) {
        this.filterFields = filterFields;
    }

    /**
     * 产品组id
     */
    public Long getProductGroupId() {
        return productGroupId;
    }

    /**
     * 产品组id
     */
    public void setProductGroupId(Long productGroupId) {
        this.productGroupId = productGroupId;
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
        ItsmServiceItemTarget other = (ItsmServiceItemTarget) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getServiceItemName() == null ? other.getServiceItemName() == null : this.getServiceItemName().equals(other.getServiceItemName()))
            && (this.getServiceItemHead() == null ? other.getServiceItemHead() == null : this.getServiceItemHead().equals(other.getServiceItemHead()))
            && (this.getServiceContent() == null ? other.getServiceContent() == null : this.getServiceContent().equals(other.getServiceContent()))
            && (this.getProcessModelId() == null ? other.getProcessModelId() == null : this.getProcessModelId().equals(other.getProcessModelId()))
            && (this.getStartTaskId() == null ? other.getStartTaskId() == null : this.getStartTaskId().equals(other.getStartTaskId()))
            && (this.getServiceItemType() == null ? other.getServiceItemType() == null : this.getServiceItemType().equals(other.getServiceItemType()))
            && (this.getProcessModelName() == null ? other.getProcessModelName() == null : this.getProcessModelName().equals(other.getProcessModelName()))
            && (this.getServiceItemScene() == null ? other.getServiceItemScene() == null : this.getServiceItemScene().equals(other.getServiceItemScene()))
            && (this.getServiceDate() == null ? other.getServiceDate() == null : this.getServiceDate().equals(other.getServiceDate()))
            && (this.getSlaId() == null ? other.getSlaId() == null : this.getSlaId().equals(other.getSlaId()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getFilterFields() == null ? other.getFilterFields() == null : this.getFilterFields().equals(other.getFilterFields()))
            && (this.getProductGroupId() == null ? other.getProductGroupId() == null : this.getProductGroupId().equals(other.getProductGroupId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getServiceItemName() == null) ? 0 : getServiceItemName().hashCode());
        result = prime * result + ((getServiceItemHead() == null) ? 0 : getServiceItemHead().hashCode());
        result = prime * result + ((getServiceContent() == null) ? 0 : getServiceContent().hashCode());
        result = prime * result + ((getProcessModelId() == null) ? 0 : getProcessModelId().hashCode());
        result = prime * result + ((getStartTaskId() == null) ? 0 : getStartTaskId().hashCode());
        result = prime * result + ((getServiceItemType() == null) ? 0 : getServiceItemType().hashCode());
        result = prime * result + ((getProcessModelName() == null) ? 0 : getProcessModelName().hashCode());
        result = prime * result + ((getServiceItemScene() == null) ? 0 : getServiceItemScene().hashCode());
        result = prime * result + ((getServiceDate() == null) ? 0 : getServiceDate().hashCode());
        result = prime * result + ((getSlaId() == null) ? 0 : getSlaId().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getFilterFields() == null) ? 0 : getFilterFields().hashCode());
        result = prime * result + ((getProductGroupId() == null) ? 0 : getProductGroupId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serviceItemName=").append(serviceItemName);
        sb.append(", serviceItemHead=").append(serviceItemHead);
        sb.append(", serviceContent=").append(serviceContent);
        sb.append(", processModelId=").append(processModelId);
        sb.append(", startTaskId=").append(startTaskId);
        sb.append(", serviceItemType=").append(serviceItemType);
        sb.append(", processModelName=").append(processModelName);
        sb.append(", serviceItemScene=").append(serviceItemScene);
        sb.append(", serviceDate=").append(serviceDate);
        sb.append(", slaId=").append(slaId);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", filterFields=").append(filterFields);
        sb.append(", productGroupId=").append(productGroupId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}