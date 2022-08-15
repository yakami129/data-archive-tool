package com.skyjun.datamigration.target.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName itsm_service_work_essential
 */
@TableName(value ="itsm_service_work_essential")
public class ItsmServiceWorkEssentialTarget implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.NONE)
    private Long id;

    /**
     * 关闭时间
     */
    private Date closeDate;

    /**
     * 优先级颜色
     */
    private String color;

    /**
     * 配置项
     */
    private String configuration;

    /**
     * 级别
     */
    private String disposeLevel;

    /**
     * 
     */
    private String fileValue;

    /**
     * 影响范围
     */
    private Long influenceRange;

    /**
     * 发起人ID
     */
    private Long initiatorId;

    /**
     * 发起人名称
     */
    private String initiatorName;

    /**
     * 服务项类别id
     */
    private Long itemTypeId;

    /**
     * 逾期时间
     */
    private Date lateDate;

    /**
     * 请求时间
     */
    private Date requestDate;

    /**
     * 请求人Json
     */
    private String requestPerson;

    /**
     * 请求人id
     */
    private Long requestPersonId;

    /**
     * 服务目录ID
     */
    private Long serviceItemId;

    /**
     * slaId
     */
    private Long slaId;

    /**
     * 标题
     */
    private String title;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 紧急程度
     */
    private Long urgentLevel;

    /**
     * 工单id
     */
    private Long workId;

    /**
     * 模板id
     */
    private Long templateId;

    /**
     * 满意度字段json
     */
    private String workSatisfaction;

    /**
     * 请求人姓名
     */
    private String requestPersonName;

    /**
     * 
     */
    private Long requestPersonDepartmentId;

    /**
     * 
     */
    private String requestPersonDepartmentName;

    /**
     * 关单人ID
     */
    private Long closeAssignorId;

    /**
     * 关单人名称
     */
    private String closeAssignorName;

    /**
     * 
     */
    private Boolean isRelated;

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
     * 关闭时间
     */
    public Date getCloseDate() {
        return closeDate;
    }

    /**
     * 关闭时间
     */
    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    /**
     * 优先级颜色
     */
    public String getColor() {
        return color;
    }

    /**
     * 优先级颜色
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 配置项
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * 配置项
     */
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * 级别
     */
    public String getDisposeLevel() {
        return disposeLevel;
    }

    /**
     * 级别
     */
    public void setDisposeLevel(String disposeLevel) {
        this.disposeLevel = disposeLevel;
    }

    /**
     * 
     */
    public String getFileValue() {
        return fileValue;
    }

    /**
     * 
     */
    public void setFileValue(String fileValue) {
        this.fileValue = fileValue;
    }

    /**
     * 影响范围
     */
    public Long getInfluenceRange() {
        return influenceRange;
    }

    /**
     * 影响范围
     */
    public void setInfluenceRange(Long influenceRange) {
        this.influenceRange = influenceRange;
    }

    /**
     * 发起人ID
     */
    public Long getInitiatorId() {
        return initiatorId;
    }

    /**
     * 发起人ID
     */
    public void setInitiatorId(Long initiatorId) {
        this.initiatorId = initiatorId;
    }

    /**
     * 发起人名称
     */
    public String getInitiatorName() {
        return initiatorName;
    }

    /**
     * 发起人名称
     */
    public void setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
    }

    /**
     * 服务项类别id
     */
    public Long getItemTypeId() {
        return itemTypeId;
    }

    /**
     * 服务项类别id
     */
    public void setItemTypeId(Long itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    /**
     * 逾期时间
     */
    public Date getLateDate() {
        return lateDate;
    }

    /**
     * 逾期时间
     */
    public void setLateDate(Date lateDate) {
        this.lateDate = lateDate;
    }

    /**
     * 请求时间
     */
    public Date getRequestDate() {
        return requestDate;
    }

    /**
     * 请求时间
     */
    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    /**
     * 请求人Json
     */
    public String getRequestPerson() {
        return requestPerson;
    }

    /**
     * 请求人Json
     */
    public void setRequestPerson(String requestPerson) {
        this.requestPerson = requestPerson;
    }

    /**
     * 请求人id
     */
    public Long getRequestPersonId() {
        return requestPersonId;
    }

    /**
     * 请求人id
     */
    public void setRequestPersonId(Long requestPersonId) {
        this.requestPersonId = requestPersonId;
    }

    /**
     * 服务目录ID
     */
    public Long getServiceItemId() {
        return serviceItemId;
    }

    /**
     * 服务目录ID
     */
    public void setServiceItemId(Long serviceItemId) {
        this.serviceItemId = serviceItemId;
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
     * 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 紧急程度
     */
    public Long getUrgentLevel() {
        return urgentLevel;
    }

    /**
     * 紧急程度
     */
    public void setUrgentLevel(Long urgentLevel) {
        this.urgentLevel = urgentLevel;
    }

    /**
     * 工单id
     */
    public Long getWorkId() {
        return workId;
    }

    /**
     * 工单id
     */
    public void setWorkId(Long workId) {
        this.workId = workId;
    }

    /**
     * 模板id
     */
    public Long getTemplateId() {
        return templateId;
    }

    /**
     * 模板id
     */
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    /**
     * 满意度字段json
     */
    public String getWorkSatisfaction() {
        return workSatisfaction;
    }

    /**
     * 满意度字段json
     */
    public void setWorkSatisfaction(String workSatisfaction) {
        this.workSatisfaction = workSatisfaction;
    }

    /**
     * 请求人姓名
     */
    public String getRequestPersonName() {
        return requestPersonName;
    }

    /**
     * 请求人姓名
     */
    public void setRequestPersonName(String requestPersonName) {
        this.requestPersonName = requestPersonName;
    }

    /**
     * 
     */
    public Long getRequestPersonDepartmentId() {
        return requestPersonDepartmentId;
    }

    /**
     * 
     */
    public void setRequestPersonDepartmentId(Long requestPersonDepartmentId) {
        this.requestPersonDepartmentId = requestPersonDepartmentId;
    }

    /**
     * 
     */
    public String getRequestPersonDepartmentName() {
        return requestPersonDepartmentName;
    }

    /**
     * 
     */
    public void setRequestPersonDepartmentName(String requestPersonDepartmentName) {
        this.requestPersonDepartmentName = requestPersonDepartmentName;
    }

    /**
     * 关单人ID
     */
    public Long getCloseAssignorId() {
        return closeAssignorId;
    }

    /**
     * 关单人ID
     */
    public void setCloseAssignorId(Long closeAssignorId) {
        this.closeAssignorId = closeAssignorId;
    }

    /**
     * 关单人名称
     */
    public String getCloseAssignorName() {
        return closeAssignorName;
    }

    /**
     * 关单人名称
     */
    public void setCloseAssignorName(String closeAssignorName) {
        this.closeAssignorName = closeAssignorName;
    }

    /**
     * 
     */
    public Boolean getIsRelated() {
        return isRelated;
    }

    /**
     * 
     */
    public void setIsRelated(Boolean isRelated) {
        this.isRelated = isRelated;
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
        ItsmServiceWorkEssentialTarget other = (ItsmServiceWorkEssentialTarget) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCloseDate() == null ? other.getCloseDate() == null : this.getCloseDate().equals(other.getCloseDate()))
            && (this.getColor() == null ? other.getColor() == null : this.getColor().equals(other.getColor()))
            && (this.getConfiguration() == null ? other.getConfiguration() == null : this.getConfiguration().equals(other.getConfiguration()))
            && (this.getDisposeLevel() == null ? other.getDisposeLevel() == null : this.getDisposeLevel().equals(other.getDisposeLevel()))
            && (this.getFileValue() == null ? other.getFileValue() == null : this.getFileValue().equals(other.getFileValue()))
            && (this.getInfluenceRange() == null ? other.getInfluenceRange() == null : this.getInfluenceRange().equals(other.getInfluenceRange()))
            && (this.getInitiatorId() == null ? other.getInitiatorId() == null : this.getInitiatorId().equals(other.getInitiatorId()))
            && (this.getInitiatorName() == null ? other.getInitiatorName() == null : this.getInitiatorName().equals(other.getInitiatorName()))
            && (this.getItemTypeId() == null ? other.getItemTypeId() == null : this.getItemTypeId().equals(other.getItemTypeId()))
            && (this.getLateDate() == null ? other.getLateDate() == null : this.getLateDate().equals(other.getLateDate()))
            && (this.getRequestDate() == null ? other.getRequestDate() == null : this.getRequestDate().equals(other.getRequestDate()))
            && (this.getRequestPerson() == null ? other.getRequestPerson() == null : this.getRequestPerson().equals(other.getRequestPerson()))
            && (this.getRequestPersonId() == null ? other.getRequestPersonId() == null : this.getRequestPersonId().equals(other.getRequestPersonId()))
            && (this.getServiceItemId() == null ? other.getServiceItemId() == null : this.getServiceItemId().equals(other.getServiceItemId()))
            && (this.getSlaId() == null ? other.getSlaId() == null : this.getSlaId().equals(other.getSlaId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getUrgentLevel() == null ? other.getUrgentLevel() == null : this.getUrgentLevel().equals(other.getUrgentLevel()))
            && (this.getWorkId() == null ? other.getWorkId() == null : this.getWorkId().equals(other.getWorkId()))
            && (this.getTemplateId() == null ? other.getTemplateId() == null : this.getTemplateId().equals(other.getTemplateId()))
            && (this.getWorkSatisfaction() == null ? other.getWorkSatisfaction() == null : this.getWorkSatisfaction().equals(other.getWorkSatisfaction()))
            && (this.getRequestPersonName() == null ? other.getRequestPersonName() == null : this.getRequestPersonName().equals(other.getRequestPersonName()))
            && (this.getRequestPersonDepartmentId() == null ? other.getRequestPersonDepartmentId() == null : this.getRequestPersonDepartmentId().equals(other.getRequestPersonDepartmentId()))
            && (this.getRequestPersonDepartmentName() == null ? other.getRequestPersonDepartmentName() == null : this.getRequestPersonDepartmentName().equals(other.getRequestPersonDepartmentName()))
            && (this.getCloseAssignorId() == null ? other.getCloseAssignorId() == null : this.getCloseAssignorId().equals(other.getCloseAssignorId()))
            && (this.getCloseAssignorName() == null ? other.getCloseAssignorName() == null : this.getCloseAssignorName().equals(other.getCloseAssignorName()))
            && (this.getIsRelated() == null ? other.getIsRelated() == null : this.getIsRelated().equals(other.getIsRelated()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCloseDate() == null) ? 0 : getCloseDate().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        result = prime * result + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        result = prime * result + ((getDisposeLevel() == null) ? 0 : getDisposeLevel().hashCode());
        result = prime * result + ((getFileValue() == null) ? 0 : getFileValue().hashCode());
        result = prime * result + ((getInfluenceRange() == null) ? 0 : getInfluenceRange().hashCode());
        result = prime * result + ((getInitiatorId() == null) ? 0 : getInitiatorId().hashCode());
        result = prime * result + ((getInitiatorName() == null) ? 0 : getInitiatorName().hashCode());
        result = prime * result + ((getItemTypeId() == null) ? 0 : getItemTypeId().hashCode());
        result = prime * result + ((getLateDate() == null) ? 0 : getLateDate().hashCode());
        result = prime * result + ((getRequestDate() == null) ? 0 : getRequestDate().hashCode());
        result = prime * result + ((getRequestPerson() == null) ? 0 : getRequestPerson().hashCode());
        result = prime * result + ((getRequestPersonId() == null) ? 0 : getRequestPersonId().hashCode());
        result = prime * result + ((getServiceItemId() == null) ? 0 : getServiceItemId().hashCode());
        result = prime * result + ((getSlaId() == null) ? 0 : getSlaId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getUrgentLevel() == null) ? 0 : getUrgentLevel().hashCode());
        result = prime * result + ((getWorkId() == null) ? 0 : getWorkId().hashCode());
        result = prime * result + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        result = prime * result + ((getWorkSatisfaction() == null) ? 0 : getWorkSatisfaction().hashCode());
        result = prime * result + ((getRequestPersonName() == null) ? 0 : getRequestPersonName().hashCode());
        result = prime * result + ((getRequestPersonDepartmentId() == null) ? 0 : getRequestPersonDepartmentId().hashCode());
        result = prime * result + ((getRequestPersonDepartmentName() == null) ? 0 : getRequestPersonDepartmentName().hashCode());
        result = prime * result + ((getCloseAssignorId() == null) ? 0 : getCloseAssignorId().hashCode());
        result = prime * result + ((getCloseAssignorName() == null) ? 0 : getCloseAssignorName().hashCode());
        result = prime * result + ((getIsRelated() == null) ? 0 : getIsRelated().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", closeDate=").append(closeDate);
        sb.append(", color=").append(color);
        sb.append(", configuration=").append(configuration);
        sb.append(", disposeLevel=").append(disposeLevel);
        sb.append(", fileValue=").append(fileValue);
        sb.append(", influenceRange=").append(influenceRange);
        sb.append(", initiatorId=").append(initiatorId);
        sb.append(", initiatorName=").append(initiatorName);
        sb.append(", itemTypeId=").append(itemTypeId);
        sb.append(", lateDate=").append(lateDate);
        sb.append(", requestDate=").append(requestDate);
        sb.append(", requestPerson=").append(requestPerson);
        sb.append(", requestPersonId=").append(requestPersonId);
        sb.append(", serviceItemId=").append(serviceItemId);
        sb.append(", slaId=").append(slaId);
        sb.append(", title=").append(title);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", urgentLevel=").append(urgentLevel);
        sb.append(", workId=").append(workId);
        sb.append(", templateId=").append(templateId);
        sb.append(", workSatisfaction=").append(workSatisfaction);
        sb.append(", requestPersonName=").append(requestPersonName);
        sb.append(", requestPersonDepartmentId=").append(requestPersonDepartmentId);
        sb.append(", requestPersonDepartmentName=").append(requestPersonDepartmentName);
        sb.append(", closeAssignorId=").append(closeAssignorId);
        sb.append(", closeAssignorName=").append(closeAssignorName);
        sb.append(", isRelated=").append(isRelated);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}