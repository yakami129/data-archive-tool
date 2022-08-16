package com.skyjun.datamigration.source.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * @TableName itsm_task
 */
@TableName(value = "itsm_task")
public class ItsmTaskSource implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @TableId(type = IdType.NONE)
    private Long id;
    /**
     *
     */
    private Long actPid;
    /**
     * 任务名称
     */
    private String taskName;
    /**
     * 阶段说明
     */
    private String taskDescribe;
    /**
     * 指派人ID
     */
    private Long taskAssignorId;
    /**
     * 指派人名称
     */
    private String taskAssignorName;
    /**
     *
     */
    private Long taskPosition;
    /**
     * 人员范围：0：默认，会签：1 依此会签 2
     */
    private Long staffScope;
    /**
     * 分配方式  0：由上一处理人指定，1：由发起人指定，2：主动认领
     */
    private Long taskDistributionMode;
    /**
     * 流程连接类型
     */
    private String sequenceFlowType;
    /**
     * 下一个任务
     */
    private String nextTask;
    /**
     *
     */
    private String changeInput;
    /**
     * 动态任务，用于动态分配处理人
     */
    private String dynamicTask;
    /**
     * 是否可以转办：1:是，0：否
     */
    private Long transferBool;
    /**
     * 是否可以驳回：1:是，0：否
     */
    private Long taskRejectBool;
    /**
     * 转办次数
     */
    private Long transferTime;
    /**
     * 绑定的子流程
     */
    private Long bindActPid;
    /**
     * 节点类别
     */
    private String category;
    /**
     * 是否开启系统通知：1:是，0：否
     */
    private Long sysNoticeBool;
    /**
     * 前端配置项
     */
    private String configuration;
    /**
     *
     */
    private Long olaId;
    /**
     * 是否开启系统通知：1:是，0：否
     */
    private Long outParamBool;
    /**
     * 出参列表
     */
    private String outParamJson;
    /**
     * 服务节点设置
     */
    private String serviceTaskFieldVal;
    /**
     * 是否自动分配： 1、是  2、否
     */
    private Long assignBool;
    /**
     * 分派超时时间
     */
    private Long assignTimeOut;
    /**
     * 分派方式： 1、权重分派   2、随机分派
     */
    private Long assignType;
    /**
     * 服务节点设置
     */
    private String outParamType;
    /**
     * 流程模型Id
     */
    private String template;
    /**
     * 分配规则
     */
    private Long distributionRule;
    /**
     * 多人规则
     */
    private Long manyPeopleRule;
    /**
     * 人员范围类型
     */
    private Long staffScopeType;
    /**
     * 移动端不可处理
     */
    private Long hfiveNohandle;

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
     *
     */
    public Long getActPid() {
        return actPid;
    }

    /**
     *
     */
    public void setActPid(Long actPid) {
        this.actPid = actPid;
    }

    /**
     * 任务名称
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * 任务名称
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * 阶段说明
     */
    public String getTaskDescribe() {
        return taskDescribe;
    }

    /**
     * 阶段说明
     */
    public void setTaskDescribe(String taskDescribe) {
        this.taskDescribe = taskDescribe;
    }

    /**
     * 指派人ID
     */
    public Long getTaskAssignorId() {
        return taskAssignorId;
    }

    /**
     * 指派人ID
     */
    public void setTaskAssignorId(Long taskAssignorId) {
        this.taskAssignorId = taskAssignorId;
    }

    /**
     * 指派人名称
     */
    public String getTaskAssignorName() {
        return taskAssignorName;
    }

    /**
     * 指派人名称
     */
    public void setTaskAssignorName(String taskAssignorName) {
        this.taskAssignorName = taskAssignorName;
    }

    /**
     *
     */
    public Long getTaskPosition() {
        return taskPosition;
    }

    /**
     *
     */
    public void setTaskPosition(Long taskPosition) {
        this.taskPosition = taskPosition;
    }

    /**
     * 人员范围：0：默认，会签：1 依此会签 2
     */
    public Long getStaffScope() {
        return staffScope;
    }

    /**
     * 人员范围：0：默认，会签：1 依此会签 2
     */
    public void setStaffScope(Long staffScope) {
        this.staffScope = staffScope;
    }

    /**
     * 分配方式  0：由上一处理人指定，1：由发起人指定，2：主动认领
     */
    public Long getTaskDistributionMode() {
        return taskDistributionMode;
    }

    /**
     * 分配方式  0：由上一处理人指定，1：由发起人指定，2：主动认领
     */
    public void setTaskDistributionMode(Long taskDistributionMode) {
        this.taskDistributionMode = taskDistributionMode;
    }

    /**
     * 流程连接类型
     */
    public String getSequenceFlowType() {
        return sequenceFlowType;
    }

    /**
     * 流程连接类型
     */
    public void setSequenceFlowType(String sequenceFlowType) {
        this.sequenceFlowType = sequenceFlowType;
    }

    /**
     * 下一个任务
     */
    public String getNextTask() {
        return nextTask;
    }

    /**
     * 下一个任务
     */
    public void setNextTask(String nextTask) {
        this.nextTask = nextTask;
    }

    /**
     *
     */
    public String getChangeInput() {
        return changeInput;
    }

    /**
     *
     */
    public void setChangeInput(String changeInput) {
        this.changeInput = changeInput;
    }

    /**
     * 动态任务，用于动态分配处理人
     */
    public String getDynamicTask() {
        return dynamicTask;
    }

    /**
     * 动态任务，用于动态分配处理人
     */
    public void setDynamicTask(String dynamicTask) {
        this.dynamicTask = dynamicTask;
    }

    /**
     * 是否可以转办：1:是，0：否
     */
    public Long getTransferBool() {
        return transferBool;
    }

    /**
     * 是否可以转办：1:是，0：否
     */
    public void setTransferBool(Long transferBool) {
        this.transferBool = transferBool;
    }

    /**
     * 是否可以驳回：1:是，0：否
     */
    public Long getTaskRejectBool() {
        return taskRejectBool;
    }

    /**
     * 是否可以驳回：1:是，0：否
     */
    public void setTaskRejectBool(Long taskRejectBool) {
        this.taskRejectBool = taskRejectBool;
    }

    /**
     * 转办次数
     */
    public Long getTransferTime() {
        return transferTime;
    }

    /**
     * 转办次数
     */
    public void setTransferTime(Long transferTime) {
        this.transferTime = transferTime;
    }

    /**
     * 绑定的子流程
     */
    public Long getBindActPid() {
        return bindActPid;
    }

    /**
     * 绑定的子流程
     */
    public void setBindActPid(Long bindActPid) {
        this.bindActPid = bindActPid;
    }

    /**
     * 节点类别
     */
    public String getCategory() {
        return category;
    }

    /**
     * 节点类别
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 是否开启系统通知：1:是，0：否
     */
    public Long getSysNoticeBool() {
        return sysNoticeBool;
    }

    /**
     * 是否开启系统通知：1:是，0：否
     */
    public void setSysNoticeBool(Long sysNoticeBool) {
        this.sysNoticeBool = sysNoticeBool;
    }

    /**
     * 前端配置项
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * 前端配置项
     */
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     *
     */
    public Long getOlaId() {
        return olaId;
    }

    /**
     *
     */
    public void setOlaId(Long olaId) {
        this.olaId = olaId;
    }

    /**
     * 是否开启系统通知：1:是，0：否
     */
    public Long getOutParamBool() {
        return outParamBool;
    }

    /**
     * 是否开启系统通知：1:是，0：否
     */
    public void setOutParamBool(Long outParamBool) {
        this.outParamBool = outParamBool;
    }

    /**
     * 出参列表
     */
    public String getOutParamJson() {
        return outParamJson;
    }

    /**
     * 出参列表
     */
    public void setOutParamJson(String outParamJson) {
        this.outParamJson = outParamJson;
    }

    /**
     * 服务节点设置
     */
    public String getServiceTaskFieldVal() {
        return serviceTaskFieldVal;
    }

    /**
     * 服务节点设置
     */
    public void setServiceTaskFieldVal(String serviceTaskFieldVal) {
        this.serviceTaskFieldVal = serviceTaskFieldVal;
    }

    /**
     * 是否自动分配： 1、是  2、否
     */
    public Long getAssignBool() {
        return assignBool;
    }

    /**
     * 是否自动分配： 1、是  2、否
     */
    public void setAssignBool(Long assignBool) {
        this.assignBool = assignBool;
    }

    /**
     * 分派超时时间
     */
    public Long getAssignTimeOut() {
        return assignTimeOut;
    }

    /**
     * 分派超时时间
     */
    public void setAssignTimeOut(Long assignTimeOut) {
        this.assignTimeOut = assignTimeOut;
    }

    /**
     * 分派方式： 1、权重分派   2、随机分派
     */
    public Long getAssignType() {
        return assignType;
    }

    /**
     * 分派方式： 1、权重分派   2、随机分派
     */
    public void setAssignType(Long assignType) {
        this.assignType = assignType;
    }

    /**
     * 服务节点设置
     */
    public String getOutParamType() {
        return outParamType;
    }

    /**
     * 服务节点设置
     */
    public void setOutParamType(String outParamType) {
        this.outParamType = outParamType;
    }

    /**
     * 流程模型Id
     */
    public String getTemplate() {
        return template;
    }

    /**
     * 流程模型Id
     */
    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * 分配规则
     */
    public Long getDistributionRule() {
        return distributionRule;
    }

    /**
     * 分配规则
     */
    public void setDistributionRule(Long distributionRule) {
        this.distributionRule = distributionRule;
    }

    /**
     * 多人规则
     */
    public Long getManyPeopleRule() {
        return manyPeopleRule;
    }

    /**
     * 多人规则
     */
    public void setManyPeopleRule(Long manyPeopleRule) {
        this.manyPeopleRule = manyPeopleRule;
    }

    /**
     * 人员范围类型
     */
    public Long getStaffScopeType() {
        return staffScopeType;
    }

    /**
     * 人员范围类型
     */
    public void setStaffScopeType(Long staffScopeType) {
        this.staffScopeType = staffScopeType;
    }

    /**
     * 移动端不可处理
     */
    public Long getHfiveNohandle() {
        return hfiveNohandle;
    }

    /**
     * 移动端不可处理
     */
    public void setHfiveNohandle(Long hfiveNohandle) {
        this.hfiveNohandle = hfiveNohandle;
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
        ItsmTaskSource other = (ItsmTaskSource) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getActPid() == null ? other.getActPid() == null : this.getActPid().equals(other.getActPid()))
                && (this.getTaskName() == null ? other.getTaskName() == null : this.getTaskName().equals(other.getTaskName()))
                && (this.getTaskDescribe() == null ? other.getTaskDescribe() == null : this.getTaskDescribe().equals(other.getTaskDescribe()))
                && (this.getTaskAssignorId() == null ? other.getTaskAssignorId() == null : this.getTaskAssignorId().equals(other.getTaskAssignorId()))
                && (this.getTaskAssignorName() == null ? other.getTaskAssignorName() == null : this.getTaskAssignorName().equals(other.getTaskAssignorName()))
                && (this.getTaskPosition() == null ? other.getTaskPosition() == null : this.getTaskPosition().equals(other.getTaskPosition()))
                && (this.getStaffScope() == null ? other.getStaffScope() == null : this.getStaffScope().equals(other.getStaffScope()))
                && (this.getTaskDistributionMode() == null ? other.getTaskDistributionMode() == null : this.getTaskDistributionMode().equals(other.getTaskDistributionMode()))
                && (this.getSequenceFlowType() == null ? other.getSequenceFlowType() == null : this.getSequenceFlowType().equals(other.getSequenceFlowType()))
                && (this.getNextTask() == null ? other.getNextTask() == null : this.getNextTask().equals(other.getNextTask()))
                && (this.getChangeInput() == null ? other.getChangeInput() == null : this.getChangeInput().equals(other.getChangeInput()))
                && (this.getDynamicTask() == null ? other.getDynamicTask() == null : this.getDynamicTask().equals(other.getDynamicTask()))
                && (this.getTransferBool() == null ? other.getTransferBool() == null : this.getTransferBool().equals(other.getTransferBool()))
                && (this.getTaskRejectBool() == null ? other.getTaskRejectBool() == null : this.getTaskRejectBool().equals(other.getTaskRejectBool()))
                && (this.getTransferTime() == null ? other.getTransferTime() == null : this.getTransferTime().equals(other.getTransferTime()))
                && (this.getBindActPid() == null ? other.getBindActPid() == null : this.getBindActPid().equals(other.getBindActPid()))
                && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
                && (this.getSysNoticeBool() == null ? other.getSysNoticeBool() == null : this.getSysNoticeBool().equals(other.getSysNoticeBool()))
                && (this.getConfiguration() == null ? other.getConfiguration() == null : this.getConfiguration().equals(other.getConfiguration()))
                && (this.getOlaId() == null ? other.getOlaId() == null : this.getOlaId().equals(other.getOlaId()))
                && (this.getOutParamBool() == null ? other.getOutParamBool() == null : this.getOutParamBool().equals(other.getOutParamBool()))
                && (this.getOutParamJson() == null ? other.getOutParamJson() == null : this.getOutParamJson().equals(other.getOutParamJson()))
                && (this.getServiceTaskFieldVal() == null ? other.getServiceTaskFieldVal() == null : this.getServiceTaskFieldVal().equals(other.getServiceTaskFieldVal()))
                && (this.getAssignBool() == null ? other.getAssignBool() == null : this.getAssignBool().equals(other.getAssignBool()))
                && (this.getAssignTimeOut() == null ? other.getAssignTimeOut() == null : this.getAssignTimeOut().equals(other.getAssignTimeOut()))
                && (this.getAssignType() == null ? other.getAssignType() == null : this.getAssignType().equals(other.getAssignType()))
                && (this.getOutParamType() == null ? other.getOutParamType() == null : this.getOutParamType().equals(other.getOutParamType()))
                && (this.getTemplate() == null ? other.getTemplate() == null : this.getTemplate().equals(other.getTemplate()))
                && (this.getDistributionRule() == null ? other.getDistributionRule() == null : this.getDistributionRule().equals(other.getDistributionRule()))
                && (this.getManyPeopleRule() == null ? other.getManyPeopleRule() == null : this.getManyPeopleRule().equals(other.getManyPeopleRule()))
                && (this.getStaffScopeType() == null ? other.getStaffScopeType() == null : this.getStaffScopeType().equals(other.getStaffScopeType()))
                && (this.getHfiveNohandle() == null ? other.getHfiveNohandle() == null : this.getHfiveNohandle().equals(other.getHfiveNohandle()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getActPid() == null) ? 0 : getActPid().hashCode());
        result = prime * result + ((getTaskName() == null) ? 0 : getTaskName().hashCode());
        result = prime * result + ((getTaskDescribe() == null) ? 0 : getTaskDescribe().hashCode());
        result = prime * result + ((getTaskAssignorId() == null) ? 0 : getTaskAssignorId().hashCode());
        result = prime * result + ((getTaskAssignorName() == null) ? 0 : getTaskAssignorName().hashCode());
        result = prime * result + ((getTaskPosition() == null) ? 0 : getTaskPosition().hashCode());
        result = prime * result + ((getStaffScope() == null) ? 0 : getStaffScope().hashCode());
        result = prime * result + ((getTaskDistributionMode() == null) ? 0 : getTaskDistributionMode().hashCode());
        result = prime * result + ((getSequenceFlowType() == null) ? 0 : getSequenceFlowType().hashCode());
        result = prime * result + ((getNextTask() == null) ? 0 : getNextTask().hashCode());
        result = prime * result + ((getChangeInput() == null) ? 0 : getChangeInput().hashCode());
        result = prime * result + ((getDynamicTask() == null) ? 0 : getDynamicTask().hashCode());
        result = prime * result + ((getTransferBool() == null) ? 0 : getTransferBool().hashCode());
        result = prime * result + ((getTaskRejectBool() == null) ? 0 : getTaskRejectBool().hashCode());
        result = prime * result + ((getTransferTime() == null) ? 0 : getTransferTime().hashCode());
        result = prime * result + ((getBindActPid() == null) ? 0 : getBindActPid().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getSysNoticeBool() == null) ? 0 : getSysNoticeBool().hashCode());
        result = prime * result + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        result = prime * result + ((getOlaId() == null) ? 0 : getOlaId().hashCode());
        result = prime * result + ((getOutParamBool() == null) ? 0 : getOutParamBool().hashCode());
        result = prime * result + ((getOutParamJson() == null) ? 0 : getOutParamJson().hashCode());
        result = prime * result + ((getServiceTaskFieldVal() == null) ? 0 : getServiceTaskFieldVal().hashCode());
        result = prime * result + ((getAssignBool() == null) ? 0 : getAssignBool().hashCode());
        result = prime * result + ((getAssignTimeOut() == null) ? 0 : getAssignTimeOut().hashCode());
        result = prime * result + ((getAssignType() == null) ? 0 : getAssignType().hashCode());
        result = prime * result + ((getOutParamType() == null) ? 0 : getOutParamType().hashCode());
        result = prime * result + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        result = prime * result + ((getDistributionRule() == null) ? 0 : getDistributionRule().hashCode());
        result = prime * result + ((getManyPeopleRule() == null) ? 0 : getManyPeopleRule().hashCode());
        result = prime * result + ((getStaffScopeType() == null) ? 0 : getStaffScopeType().hashCode());
        result = prime * result + ((getHfiveNohandle() == null) ? 0 : getHfiveNohandle().hashCode());
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
        sb.append(", taskName=").append(taskName);
        sb.append(", taskDescribe=").append(taskDescribe);
        sb.append(", taskAssignorId=").append(taskAssignorId);
        sb.append(", taskAssignorName=").append(taskAssignorName);
        sb.append(", taskPosition=").append(taskPosition);
        sb.append(", staffScope=").append(staffScope);
        sb.append(", taskDistributionMode=").append(taskDistributionMode);
        sb.append(", sequenceFlowType=").append(sequenceFlowType);
        sb.append(", nextTask=").append(nextTask);
        sb.append(", changeInput=").append(changeInput);
        sb.append(", dynamicTask=").append(dynamicTask);
        sb.append(", transferBool=").append(transferBool);
        sb.append(", taskRejectBool=").append(taskRejectBool);
        sb.append(", transferTime=").append(transferTime);
        sb.append(", bindActPid=").append(bindActPid);
        sb.append(", category=").append(category);
        sb.append(", sysNoticeBool=").append(sysNoticeBool);
        sb.append(", configuration=").append(configuration);
        sb.append(", olaId=").append(olaId);
        sb.append(", outParamBool=").append(outParamBool);
        sb.append(", outParamJson=").append(outParamJson);
        sb.append(", serviceTaskFieldVal=").append(serviceTaskFieldVal);
        sb.append(", assignBool=").append(assignBool);
        sb.append(", assignTimeOut=").append(assignTimeOut);
        sb.append(", assignType=").append(assignType);
        sb.append(", outParamType=").append(outParamType);
        sb.append(", template=").append(template);
        sb.append(", distributionRule=").append(distributionRule);
        sb.append(", manyPeopleRule=").append(manyPeopleRule);
        sb.append(", staffScopeType=").append(staffScopeType);
        sb.append(", hfiveNohandle=").append(hfiveNohandle);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}