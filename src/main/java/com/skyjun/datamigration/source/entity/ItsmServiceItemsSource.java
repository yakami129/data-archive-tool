package com.skyjun.datamigration.source.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName itsm_service_items
 */
@TableName(value ="itsm_service_items")
public class ItsmServiceItemsSource implements Serializable {
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
     * 创建时间
     */
    private Date createdDate;

    /**
     * 过滤字段列表
     */
    private String filterFields;

    /**
     * 服务类别id
     */
    private Long itemTypeId;

    /**
     * 服务类别名称
     */
    private String itemTypeName;

    /**
     * 流程id
     */
    private Long processModelId;

    /**
     * 流程名称
     */
    private String processModelName;

    /**
     * 产品组id
     */
    private Long productGroupId;

    /**
     * 服务时间id
     */
    private Long serviceDateId;

    /**
     * 服务项描述
     */
    private String serviceItemContent;

    /**
     * 服务项名称
     */
    private String serviceItemName;

    /**
     * 服务项类型
     */
    private Long serviceItemType;

    /**
     * slaId
     */
    private Long slaId;

    /**
     * 任务id
     */
    private Long startTaskId;

    /**
     * 更新时间
     */
    private Date updatedDate;

    /**
     * 产品组名称
     */
    private String productGroupName;

    /**
     * 服务类型
     */
    private Long serviceType;

    /**
     * 头像颜色
     */
    private String headColor;

    /**
     * 头像名称
     */
    private String headName;

    /**
     * 是否配置到移动端
     */
    private Boolean moveconfig;

    /**
     * 是否删除
     */
    private Long isDelete;

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
     * 创建时间
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * 创建时间
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * 过滤字段列表
     */
    public String getFilterFields() {
        return filterFields;
    }

    /**
     * 过滤字段列表
     */
    public void setFilterFields(String filterFields) {
        this.filterFields = filterFields;
    }

    /**
     * 服务类别id
     */
    public Long getItemTypeId() {
        return itemTypeId;
    }

    /**
     * 服务类别id
     */
    public void setItemTypeId(Long itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    /**
     * 服务类别名称
     */
    public String getItemTypeName() {
        return itemTypeName;
    }

    /**
     * 服务类别名称
     */
    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }

    /**
     * 流程id
     */
    public Long getProcessModelId() {
        return processModelId;
    }

    /**
     * 流程id
     */
    public void setProcessModelId(Long processModelId) {
        this.processModelId = processModelId;
    }

    /**
     * 流程名称
     */
    public String getProcessModelName() {
        return processModelName;
    }

    /**
     * 流程名称
     */
    public void setProcessModelName(String processModelName) {
        this.processModelName = processModelName;
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

    /**
     * 服务时间id
     */
    public Long getServiceDateId() {
        return serviceDateId;
    }

    /**
     * 服务时间id
     */
    public void setServiceDateId(Long serviceDateId) {
        this.serviceDateId = serviceDateId;
    }

    /**
     * 服务项描述
     */
    public String getServiceItemContent() {
        return serviceItemContent;
    }

    /**
     * 服务项描述
     */
    public void setServiceItemContent(String serviceItemContent) {
        this.serviceItemContent = serviceItemContent;
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
     * slaId
     */
    public Long getSlaId() {
        return slaId;
    }

    /**
     * slaId
     */
    public void setSlaId(Long slaId) {
        this.slaId = slaId;
    }

    /**
     * 任务id
     */
    public Long getStartTaskId() {
        return startTaskId;
    }

    /**
     * 任务id
     */
    public void setStartTaskId(Long startTaskId) {
        this.startTaskId = startTaskId;
    }

    /**
     * 更新时间
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * 更新时间
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * 产品组名称
     */
    public String getProductGroupName() {
        return productGroupName;
    }

    /**
     * 产品组名称
     */
    public void setProductGroupName(String productGroupName) {
        this.productGroupName = productGroupName;
    }

    /**
     * 服务类型
     */
    public Long getServiceType() {
        return serviceType;
    }

    /**
     * 服务类型
     */
    public void setServiceType(Long serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * 头像颜色
     */
    public String getHeadColor() {
        return headColor;
    }

    /**
     * 头像颜色
     */
    public void setHeadColor(String headColor) {
        this.headColor = headColor;
    }

    /**
     * 头像名称
     */
    public String getHeadName() {
        return headName;
    }

    /**
     * 头像名称
     */
    public void setHeadName(String headName) {
        this.headName = headName;
    }

    /**
     * 是否配置到移动端
     */
    public Boolean getMoveconfig() {
        return moveconfig;
    }

    /**
     * 是否配置到移动端
     */
    public void setMoveconfig(Boolean moveconfig) {
        this.moveconfig = moveconfig;
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
        ItsmServiceItemsSource other = (ItsmServiceItemsSource) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getConfiguration() == null ? other.getConfiguration() == null : this.getConfiguration().equals(other.getConfiguration()))
            && (this.getCreatedDate() == null ? other.getCreatedDate() == null : this.getCreatedDate().equals(other.getCreatedDate()))
            && (this.getFilterFields() == null ? other.getFilterFields() == null : this.getFilterFields().equals(other.getFilterFields()))
            && (this.getItemTypeId() == null ? other.getItemTypeId() == null : this.getItemTypeId().equals(other.getItemTypeId()))
            && (this.getItemTypeName() == null ? other.getItemTypeName() == null : this.getItemTypeName().equals(other.getItemTypeName()))
            && (this.getProcessModelId() == null ? other.getProcessModelId() == null : this.getProcessModelId().equals(other.getProcessModelId()))
            && (this.getProcessModelName() == null ? other.getProcessModelName() == null : this.getProcessModelName().equals(other.getProcessModelName()))
            && (this.getProductGroupId() == null ? other.getProductGroupId() == null : this.getProductGroupId().equals(other.getProductGroupId()))
            && (this.getServiceDateId() == null ? other.getServiceDateId() == null : this.getServiceDateId().equals(other.getServiceDateId()))
            && (this.getServiceItemContent() == null ? other.getServiceItemContent() == null : this.getServiceItemContent().equals(other.getServiceItemContent()))
            && (this.getServiceItemName() == null ? other.getServiceItemName() == null : this.getServiceItemName().equals(other.getServiceItemName()))
            && (this.getServiceItemType() == null ? other.getServiceItemType() == null : this.getServiceItemType().equals(other.getServiceItemType()))
            && (this.getSlaId() == null ? other.getSlaId() == null : this.getSlaId().equals(other.getSlaId()))
            && (this.getStartTaskId() == null ? other.getStartTaskId() == null : this.getStartTaskId().equals(other.getStartTaskId()))
            && (this.getUpdatedDate() == null ? other.getUpdatedDate() == null : this.getUpdatedDate().equals(other.getUpdatedDate()))
            && (this.getProductGroupName() == null ? other.getProductGroupName() == null : this.getProductGroupName().equals(other.getProductGroupName()))
            && (this.getServiceType() == null ? other.getServiceType() == null : this.getServiceType().equals(other.getServiceType()))
            && (this.getHeadColor() == null ? other.getHeadColor() == null : this.getHeadColor().equals(other.getHeadColor()))
            && (this.getHeadName() == null ? other.getHeadName() == null : this.getHeadName().equals(other.getHeadName()))
            && (this.getMoveconfig() == null ? other.getMoveconfig() == null : this.getMoveconfig().equals(other.getMoveconfig()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        result = prime * result + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        result = prime * result + ((getFilterFields() == null) ? 0 : getFilterFields().hashCode());
        result = prime * result + ((getItemTypeId() == null) ? 0 : getItemTypeId().hashCode());
        result = prime * result + ((getItemTypeName() == null) ? 0 : getItemTypeName().hashCode());
        result = prime * result + ((getProcessModelId() == null) ? 0 : getProcessModelId().hashCode());
        result = prime * result + ((getProcessModelName() == null) ? 0 : getProcessModelName().hashCode());
        result = prime * result + ((getProductGroupId() == null) ? 0 : getProductGroupId().hashCode());
        result = prime * result + ((getServiceDateId() == null) ? 0 : getServiceDateId().hashCode());
        result = prime * result + ((getServiceItemContent() == null) ? 0 : getServiceItemContent().hashCode());
        result = prime * result + ((getServiceItemName() == null) ? 0 : getServiceItemName().hashCode());
        result = prime * result + ((getServiceItemType() == null) ? 0 : getServiceItemType().hashCode());
        result = prime * result + ((getSlaId() == null) ? 0 : getSlaId().hashCode());
        result = prime * result + ((getStartTaskId() == null) ? 0 : getStartTaskId().hashCode());
        result = prime * result + ((getUpdatedDate() == null) ? 0 : getUpdatedDate().hashCode());
        result = prime * result + ((getProductGroupName() == null) ? 0 : getProductGroupName().hashCode());
        result = prime * result + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        result = prime * result + ((getHeadColor() == null) ? 0 : getHeadColor().hashCode());
        result = prime * result + ((getHeadName() == null) ? 0 : getHeadName().hashCode());
        result = prime * result + ((getMoveconfig() == null) ? 0 : getMoveconfig().hashCode());
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
        sb.append(", createdDate=").append(createdDate);
        sb.append(", filterFields=").append(filterFields);
        sb.append(", itemTypeId=").append(itemTypeId);
        sb.append(", itemTypeName=").append(itemTypeName);
        sb.append(", processModelId=").append(processModelId);
        sb.append(", processModelName=").append(processModelName);
        sb.append(", productGroupId=").append(productGroupId);
        sb.append(", serviceDateId=").append(serviceDateId);
        sb.append(", serviceItemContent=").append(serviceItemContent);
        sb.append(", serviceItemName=").append(serviceItemName);
        sb.append(", serviceItemType=").append(serviceItemType);
        sb.append(", slaId=").append(slaId);
        sb.append(", startTaskId=").append(startTaskId);
        sb.append(", updatedDate=").append(updatedDate);
        sb.append(", productGroupName=").append(productGroupName);
        sb.append(", serviceType=").append(serviceType);
        sb.append(", headColor=").append(headColor);
        sb.append(", headName=").append(headName);
        sb.append(", moveconfig=").append(moveconfig);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}