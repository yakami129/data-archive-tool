package com.skyjun.datamigration.target.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName itsm_process_model
 */
@TableName(value ="itsm_process_model")
public class ItsmProcessModelTarget implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.NONE)
    private Long id;

    /**
     * act流程模型ID
     */
    private String actPid;

    /**
     * 
     */
    private String proName;

    /**
     * 流程描述
     */
    private String proDescribe;

    /**
     * 是否启用：0：禁用 1：启用
     */
    private Long proIsEnabled;

    /**
     * 流程模型创建人ID
     */
    private Long proCreateId;

    /**
     * 流程模型创建人名称
     */
    private String proCreateName;

    /**
     * 
     */
    private Long builtIn;

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
    private String bpmn;

    /**
     * 到达
     */
    private String bpmnViewType;

    /**
     * bpmn流程图configuration
     */
    private String configuration;

    /**
     * 是否是历史记录，1：是，0：否
     */
    private Long hiStatus;

    /**
     * 流程类型
     */
    private String proType;

    /**
     * 
     */
    private Long moveconfig;

    /**
     * 历史组
     */
    private String historyGroup;

    /**
     * 版本号
     */
    private Integer version;

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
     * act流程模型ID
     */
    public String getActPid() {
        return actPid;
    }

    /**
     * act流程模型ID
     */
    public void setActPid(String actPid) {
        this.actPid = actPid;
    }

    /**
     * 
     */
    public String getProName() {
        return proName;
    }

    /**
     * 
     */
    public void setProName(String proName) {
        this.proName = proName;
    }

    /**
     * 流程描述
     */
    public String getProDescribe() {
        return proDescribe;
    }

    /**
     * 流程描述
     */
    public void setProDescribe(String proDescribe) {
        this.proDescribe = proDescribe;
    }

    /**
     * 是否启用：0：禁用 1：启用
     */
    public Long getProIsEnabled() {
        return proIsEnabled;
    }

    /**
     * 是否启用：0：禁用 1：启用
     */
    public void setProIsEnabled(Long proIsEnabled) {
        this.proIsEnabled = proIsEnabled;
    }

    /**
     * 流程模型创建人ID
     */
    public Long getProCreateId() {
        return proCreateId;
    }

    /**
     * 流程模型创建人ID
     */
    public void setProCreateId(Long proCreateId) {
        this.proCreateId = proCreateId;
    }

    /**
     * 流程模型创建人名称
     */
    public String getProCreateName() {
        return proCreateName;
    }

    /**
     * 流程模型创建人名称
     */
    public void setProCreateName(String proCreateName) {
        this.proCreateName = proCreateName;
    }

    /**
     * 
     */
    public Long getBuiltIn() {
        return builtIn;
    }

    /**
     * 
     */
    public void setBuiltIn(Long builtIn) {
        this.builtIn = builtIn;
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
    public String getBpmn() {
        return bpmn;
    }

    /**
     * 
     */
    public void setBpmn(String bpmn) {
        this.bpmn = bpmn;
    }

    /**
     * 到达
     */
    public String getBpmnViewType() {
        return bpmnViewType;
    }

    /**
     * 到达
     */
    public void setBpmnViewType(String bpmnViewType) {
        this.bpmnViewType = bpmnViewType;
    }

    /**
     * bpmn流程图configuration
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * bpmn流程图configuration
     */
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
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

    /**
     * 流程类型
     */
    public String getProType() {
        return proType;
    }

    /**
     * 流程类型
     */
    public void setProType(String proType) {
        this.proType = proType;
    }

    /**
     * 
     */
    public Long getMoveconfig() {
        return moveconfig;
    }

    /**
     * 
     */
    public void setMoveconfig(Long moveconfig) {
        this.moveconfig = moveconfig;
    }

    /**
     * 历史组
     */
    public String getHistoryGroup() {
        return historyGroup;
    }

    /**
     * 历史组
     */
    public void setHistoryGroup(String historyGroup) {
        this.historyGroup = historyGroup;
    }

    /**
     * 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
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
        ItsmProcessModelTarget other = (ItsmProcessModelTarget) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getActPid() == null ? other.getActPid() == null : this.getActPid().equals(other.getActPid()))
            && (this.getProName() == null ? other.getProName() == null : this.getProName().equals(other.getProName()))
            && (this.getProDescribe() == null ? other.getProDescribe() == null : this.getProDescribe().equals(other.getProDescribe()))
            && (this.getProIsEnabled() == null ? other.getProIsEnabled() == null : this.getProIsEnabled().equals(other.getProIsEnabled()))
            && (this.getProCreateId() == null ? other.getProCreateId() == null : this.getProCreateId().equals(other.getProCreateId()))
            && (this.getProCreateName() == null ? other.getProCreateName() == null : this.getProCreateName().equals(other.getProCreateName()))
            && (this.getBuiltIn() == null ? other.getBuiltIn() == null : this.getBuiltIn().equals(other.getBuiltIn()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getBpmn() == null ? other.getBpmn() == null : this.getBpmn().equals(other.getBpmn()))
            && (this.getBpmnViewType() == null ? other.getBpmnViewType() == null : this.getBpmnViewType().equals(other.getBpmnViewType()))
            && (this.getConfiguration() == null ? other.getConfiguration() == null : this.getConfiguration().equals(other.getConfiguration()))
            && (this.getHiStatus() == null ? other.getHiStatus() == null : this.getHiStatus().equals(other.getHiStatus()))
            && (this.getProType() == null ? other.getProType() == null : this.getProType().equals(other.getProType()))
            && (this.getMoveconfig() == null ? other.getMoveconfig() == null : this.getMoveconfig().equals(other.getMoveconfig()))
            && (this.getHistoryGroup() == null ? other.getHistoryGroup() == null : this.getHistoryGroup().equals(other.getHistoryGroup()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getActPid() == null) ? 0 : getActPid().hashCode());
        result = prime * result + ((getProName() == null) ? 0 : getProName().hashCode());
        result = prime * result + ((getProDescribe() == null) ? 0 : getProDescribe().hashCode());
        result = prime * result + ((getProIsEnabled() == null) ? 0 : getProIsEnabled().hashCode());
        result = prime * result + ((getProCreateId() == null) ? 0 : getProCreateId().hashCode());
        result = prime * result + ((getProCreateName() == null) ? 0 : getProCreateName().hashCode());
        result = prime * result + ((getBuiltIn() == null) ? 0 : getBuiltIn().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getBpmn() == null) ? 0 : getBpmn().hashCode());
        result = prime * result + ((getBpmnViewType() == null) ? 0 : getBpmnViewType().hashCode());
        result = prime * result + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        result = prime * result + ((getHiStatus() == null) ? 0 : getHiStatus().hashCode());
        result = prime * result + ((getProType() == null) ? 0 : getProType().hashCode());
        result = prime * result + ((getMoveconfig() == null) ? 0 : getMoveconfig().hashCode());
        result = prime * result + ((getHistoryGroup() == null) ? 0 : getHistoryGroup().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
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
        sb.append(", proName=").append(proName);
        sb.append(", proDescribe=").append(proDescribe);
        sb.append(", proIsEnabled=").append(proIsEnabled);
        sb.append(", proCreateId=").append(proCreateId);
        sb.append(", proCreateName=").append(proCreateName);
        sb.append(", builtIn=").append(builtIn);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", bpmn=").append(bpmn);
        sb.append(", bpmnViewType=").append(bpmnViewType);
        sb.append(", configuration=").append(configuration);
        sb.append(", hiStatus=").append(hiStatus);
        sb.append(", proType=").append(proType);
        sb.append(", moveconfig=").append(moveconfig);
        sb.append(", historyGroup=").append(historyGroup);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}