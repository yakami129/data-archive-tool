package com.skyjun.datamigration.source.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName itsm_field_data
 */
@TableName(value ="itsm_field_data")
public class ItsmFieldDataSource implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.NONE)
    private Long id;

    /**
     * 服务目录ID
     */
    private Long serviceDirectoryId;

    /**
     * 服务项Id
     */
    private Long serviceItemId;

    /**
     * 工单ID
     */
    private Long itsmWorkId;

    /**
     * 流程模型ID
     */
    private Long proModelId;

    /**
     * 流程ID
     */
    private String actPid;

    /**
     * 任务ID
     */
    private Long itsmTaskId;

    /**
     * 字段模板ID
     */
    private Long itsmFieidModelId;

    /**
     * 字段编号
     */
    private String itsmFieidNum;

    /**
     * 字段名称
     */
    private String itsmFieidName;

    /**
     * 操作人ID
     */
    private Long itsmOperatorId;

    /**
     * 操作人名称
     */
    private String itsmOperatorName;

    /**
     * 
     */
    private Date createDate;

    /**
     * 
     */
    private Date updateDate;

    /**
     * 
     */
    private String itsmFieidVal;

    /**
     * ACT任务名称
     */
    private String actTaskId;

    /**
     * 是否是历史记录，1：是，0：否
     */
    private Long hiStatus;

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
     * 服务目录ID
     */
    public Long getServiceDirectoryId() {
        return serviceDirectoryId;
    }

    /**
     * 服务目录ID
     */
    public void setServiceDirectoryId(Long serviceDirectoryId) {
        this.serviceDirectoryId = serviceDirectoryId;
    }

    /**
     * 服务项Id
     */
    public Long getServiceItemId() {
        return serviceItemId;
    }

    /**
     * 服务项Id
     */
    public void setServiceItemId(Long serviceItemId) {
        this.serviceItemId = serviceItemId;
    }

    /**
     * 工单ID
     */
    public Long getItsmWorkId() {
        return itsmWorkId;
    }

    /**
     * 工单ID
     */
    public void setItsmWorkId(Long itsmWorkId) {
        this.itsmWorkId = itsmWorkId;
    }

    /**
     * 流程模型ID
     */
    public Long getProModelId() {
        return proModelId;
    }

    /**
     * 流程模型ID
     */
    public void setProModelId(Long proModelId) {
        this.proModelId = proModelId;
    }

    /**
     * 流程ID
     */
    public String getActPid() {
        return actPid;
    }

    /**
     * 流程ID
     */
    public void setActPid(String actPid) {
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
     * 字段模板ID
     */
    public Long getItsmFieidModelId() {
        return itsmFieidModelId;
    }

    /**
     * 字段模板ID
     */
    public void setItsmFieidModelId(Long itsmFieidModelId) {
        this.itsmFieidModelId = itsmFieidModelId;
    }

    /**
     * 字段编号
     */
    public String getItsmFieidNum() {
        return itsmFieidNum;
    }

    /**
     * 字段编号
     */
    public void setItsmFieidNum(String itsmFieidNum) {
        this.itsmFieidNum = itsmFieidNum;
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
     * 操作人ID
     */
    public Long getItsmOperatorId() {
        return itsmOperatorId;
    }

    /**
     * 操作人ID
     */
    public void setItsmOperatorId(Long itsmOperatorId) {
        this.itsmOperatorId = itsmOperatorId;
    }

    /**
     * 操作人名称
     */
    public String getItsmOperatorName() {
        return itsmOperatorName;
    }

    /**
     * 操作人名称
     */
    public void setItsmOperatorName(String itsmOperatorName) {
        this.itsmOperatorName = itsmOperatorName;
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
     * 
     */
    public String getItsmFieidVal() {
        return itsmFieidVal;
    }

    /**
     * 
     */
    public void setItsmFieidVal(String itsmFieidVal) {
        this.itsmFieidVal = itsmFieidVal;
    }

    /**
     * ACT任务名称
     */
    public String getActTaskId() {
        return actTaskId;
    }

    /**
     * ACT任务名称
     */
    public void setActTaskId(String actTaskId) {
        this.actTaskId = actTaskId;
    }

    /**
     * 是否是历史记录，1：是，0：否
     */
    public Long getHiStatus() {
        return hiStatus;
    }

    /**
     * 是否是历史记录，1：是，0：否
     */
    public void setHiStatus(Long hiStatus) {
        this.hiStatus = hiStatus;
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
        ItsmFieldDataSource other = (ItsmFieldDataSource) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getServiceDirectoryId() == null ? other.getServiceDirectoryId() == null : this.getServiceDirectoryId().equals(other.getServiceDirectoryId()))
            && (this.getServiceItemId() == null ? other.getServiceItemId() == null : this.getServiceItemId().equals(other.getServiceItemId()))
            && (this.getItsmWorkId() == null ? other.getItsmWorkId() == null : this.getItsmWorkId().equals(other.getItsmWorkId()))
            && (this.getProModelId() == null ? other.getProModelId() == null : this.getProModelId().equals(other.getProModelId()))
            && (this.getActPid() == null ? other.getActPid() == null : this.getActPid().equals(other.getActPid()))
            && (this.getItsmTaskId() == null ? other.getItsmTaskId() == null : this.getItsmTaskId().equals(other.getItsmTaskId()))
            && (this.getItsmFieidModelId() == null ? other.getItsmFieidModelId() == null : this.getItsmFieidModelId().equals(other.getItsmFieidModelId()))
            && (this.getItsmFieidNum() == null ? other.getItsmFieidNum() == null : this.getItsmFieidNum().equals(other.getItsmFieidNum()))
            && (this.getItsmFieidName() == null ? other.getItsmFieidName() == null : this.getItsmFieidName().equals(other.getItsmFieidName()))
            && (this.getItsmOperatorId() == null ? other.getItsmOperatorId() == null : this.getItsmOperatorId().equals(other.getItsmOperatorId()))
            && (this.getItsmOperatorName() == null ? other.getItsmOperatorName() == null : this.getItsmOperatorName().equals(other.getItsmOperatorName()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getItsmFieidVal() == null ? other.getItsmFieidVal() == null : this.getItsmFieidVal().equals(other.getItsmFieidVal()))
            && (this.getActTaskId() == null ? other.getActTaskId() == null : this.getActTaskId().equals(other.getActTaskId()))
            && (this.getHiStatus() == null ? other.getHiStatus() == null : this.getHiStatus().equals(other.getHiStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getServiceDirectoryId() == null) ? 0 : getServiceDirectoryId().hashCode());
        result = prime * result + ((getServiceItemId() == null) ? 0 : getServiceItemId().hashCode());
        result = prime * result + ((getItsmWorkId() == null) ? 0 : getItsmWorkId().hashCode());
        result = prime * result + ((getProModelId() == null) ? 0 : getProModelId().hashCode());
        result = prime * result + ((getActPid() == null) ? 0 : getActPid().hashCode());
        result = prime * result + ((getItsmTaskId() == null) ? 0 : getItsmTaskId().hashCode());
        result = prime * result + ((getItsmFieidModelId() == null) ? 0 : getItsmFieidModelId().hashCode());
        result = prime * result + ((getItsmFieidNum() == null) ? 0 : getItsmFieidNum().hashCode());
        result = prime * result + ((getItsmFieidName() == null) ? 0 : getItsmFieidName().hashCode());
        result = prime * result + ((getItsmOperatorId() == null) ? 0 : getItsmOperatorId().hashCode());
        result = prime * result + ((getItsmOperatorName() == null) ? 0 : getItsmOperatorName().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getItsmFieidVal() == null) ? 0 : getItsmFieidVal().hashCode());
        result = prime * result + ((getActTaskId() == null) ? 0 : getActTaskId().hashCode());
        result = prime * result + ((getHiStatus() == null) ? 0 : getHiStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serviceDirectoryId=").append(serviceDirectoryId);
        sb.append(", serviceItemId=").append(serviceItemId);
        sb.append(", itsmWorkId=").append(itsmWorkId);
        sb.append(", proModelId=").append(proModelId);
        sb.append(", actPid=").append(actPid);
        sb.append(", itsmTaskId=").append(itsmTaskId);
        sb.append(", itsmFieidModelId=").append(itsmFieidModelId);
        sb.append(", itsmFieidNum=").append(itsmFieidNum);
        sb.append(", itsmFieidName=").append(itsmFieidName);
        sb.append(", itsmOperatorId=").append(itsmOperatorId);
        sb.append(", itsmOperatorName=").append(itsmOperatorName);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", itsmFieidVal=").append(itsmFieidVal);
        sb.append(", actTaskId=").append(actTaskId);
        sb.append(", hiStatus=").append(hiStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}