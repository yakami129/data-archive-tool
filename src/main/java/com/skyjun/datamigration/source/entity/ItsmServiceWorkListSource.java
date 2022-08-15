package com.skyjun.datamigration.source.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName itsm_service_work_list
 */
@TableName(value ="itsm_service_work_list")
public class ItsmServiceWorkListSource implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.NONE)
    private Long id;

    /**
     * 
     */
    private String serviceWorkNum;

    /**
     * 服务目录id
     */
    private Long serviceDirectoryId;

    /**
     * 服务项id
     */
    private Long serviceItemId;

    /**
     * 流程模型ID
     */
    private Long processModelId;

    /**
     * 流程ID
     */
    private String processId;

    /**
     * 当前处理人名称
     */
    private String currentAssignorName;

    /**
     * 当前处理人Id
     */
    private Long currentAssignorId;

    /**
     * 当前处理人列表
     */
    private String currentAssignorIds;

    /**
     * 当前分配方式
     */
    private Long currentDistributionMode;

    /**
     * 当前任务ID
     */
    private Long currentTaskId;

    /**
     * 当前任务名称
     */
    private String currentTaskName;

    /**
     * 当前任务序号
     */
    private Long currentTaskSerialNumber;

    /**
     * 服务工单发起人ID
     */
    private Long initiatorId;

    /**
     * 服务工单发起人名称
     */
    private String initiatorName;

    /**
     * 服务工单发起人头像
     */
    private String itsmImgPath;

    /**
     * 是否完成
     */
    private Long complete;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 处理状态
     */
    private Long disposeStatus;

    /**
     * 服务项类型
     */
    private Long serviceItemType;

    /**
     * 
     */
    private String title;

    /**
     * 级别
     */
    private String disposeLevel;

    /**
     * 
     */
    private String content;

    /**
     * 响应时间
     */
    private Date responseDate;

    /**
     * 关闭时间
     */
    private Date endDate;

    /**
     * 是否是变更
     */
    private Long isChange;

    /**
     * 
     */
    private String triggerForm;

    /**
     * 是否是历史记录，1：是，0：否
     */
    private Long hiStatus;

    /**
     * 触发变更id
     */
    private String eventNum;

    /**
     * 触发变更id
     */
    private Long requestChangeId;

    /**
     * 触发变更编号
     */
    private String requestChangeNum;

    /**
     * 关联ci名称
     */
    private String ciName;

    /**
     * 关联问题id
     */
    private Long requestProblemId;

    /**
     * 关联问题编号
     */
    private String requestProblemNum;

    /**
     * 事件来源
     */
    private String eventSource;

    /**
     * 事件状态
     */
    private String eventStatus;

    /**
     * 事件引用id
     */
    private Long rfId;

    /**
     * 关联的服务请求列表
     */
    private String requestJson;

    /**
     * 关联服务请求
     */
    private String requestWork;

    /**
     * 问题id
     */
    private String eventId;

    /**
     * 关联ci的ID
     */
    private Long ciId;

    /**
     * 关联ci的类型
     */
    private String ciType;

    /**
     * 指派处理人
     */
    private Long assignPersonId;

    /**
     * 父流程执行Id
     */
    private String superProcessId;

    /**
     * 当前会签次数
     */
    private Long taskCount;

    /**
     * 人员范围
     */
    private Long staffScope;

    /**
     * 当前ACT任务Id
     */
    private String actTaskId;

    /**
     * 优先级颜色
     */
    private String color;

    /**
     * 影响范围
     */
    private Long influenceRange;

    /**
     * 优先级Id
     */
    private Long leveId;

    /**
     * 旧的SLA解决时间
     */
    private Date oldSolveTime;

    /**
     * SLA的Id
     */
    private Long slaId;

    /**
     * SLA响应时间
     */
    private Date slaResponseTime;

    /**
     * SLA解决时间
     */
    private Date solveTime;

    /**
     * 紧急程度
     */
    private Long urgentLevel;

    /**
     * 是否同意
     */
    private Long isAgree;

    /**
     * 服务项类别id
     */
    private Long itemTypeId;

    /**
     * 关单人Id
     */
    private Long lastAssignorId;

    /**
     * 变更类型
     */
    private String changeType;

    /**
     * 区域
     */
    private String region;

    /**
     * 是否为主事件
     */
    private Long isPrimaryEvent;

    /**
     * OLA通知时间
     */
    private Date noticeTime;

    /**
     * 请求人类型
     */
    private Long personType;

    /**
     * 模板id
     */
    private Long templateId;

    /**
     * 即将逾期通知时间
     */
    private Date soonsolveTime;

    /**
     * 全局状态
     */
    private Long globalStatus;

    /**
     * 东亚变更执行时间
     */
    private Date beaChangeTime;

    /**
     * 东亚风险级别
     */
    private String beaRiskLevel;

    /**
     * 挂起非服务时间（单位：秒）
     */
    private Long hangNonServiceTime;

    /**
     * 
     */
    private Date recentHangTime;

    /**
     * 挂起时总时间（单位：秒）
     */
    private Long timeLeft;

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
     * 
     */
    public String getServiceWorkNum() {
        return serviceWorkNum;
    }

    /**
     * 
     */
    public void setServiceWorkNum(String serviceWorkNum) {
        this.serviceWorkNum = serviceWorkNum;
    }

    /**
     * 服务目录id
     */
    public Long getServiceDirectoryId() {
        return serviceDirectoryId;
    }

    /**
     * 服务目录id
     */
    public void setServiceDirectoryId(Long serviceDirectoryId) {
        this.serviceDirectoryId = serviceDirectoryId;
    }

    /**
     * 服务项id
     */
    public Long getServiceItemId() {
        return serviceItemId;
    }

    /**
     * 服务项id
     */
    public void setServiceItemId(Long serviceItemId) {
        this.serviceItemId = serviceItemId;
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
     * 流程ID
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * 流程ID
     */
    public void setProcessId(String processId) {
        this.processId = processId;
    }

    /**
     * 当前处理人名称
     */
    public String getCurrentAssignorName() {
        return currentAssignorName;
    }

    /**
     * 当前处理人名称
     */
    public void setCurrentAssignorName(String currentAssignorName) {
        this.currentAssignorName = currentAssignorName;
    }

    /**
     * 当前处理人Id
     */
    public Long getCurrentAssignorId() {
        return currentAssignorId;
    }

    /**
     * 当前处理人Id
     */
    public void setCurrentAssignorId(Long currentAssignorId) {
        this.currentAssignorId = currentAssignorId;
    }

    /**
     * 当前处理人列表
     */
    public String getCurrentAssignorIds() {
        return currentAssignorIds;
    }

    /**
     * 当前处理人列表
     */
    public void setCurrentAssignorIds(String currentAssignorIds) {
        this.currentAssignorIds = currentAssignorIds;
    }

    /**
     * 当前分配方式
     */
    public Long getCurrentDistributionMode() {
        return currentDistributionMode;
    }

    /**
     * 当前分配方式
     */
    public void setCurrentDistributionMode(Long currentDistributionMode) {
        this.currentDistributionMode = currentDistributionMode;
    }

    /**
     * 当前任务ID
     */
    public Long getCurrentTaskId() {
        return currentTaskId;
    }

    /**
     * 当前任务ID
     */
    public void setCurrentTaskId(Long currentTaskId) {
        this.currentTaskId = currentTaskId;
    }

    /**
     * 当前任务名称
     */
    public String getCurrentTaskName() {
        return currentTaskName;
    }

    /**
     * 当前任务名称
     */
    public void setCurrentTaskName(String currentTaskName) {
        this.currentTaskName = currentTaskName;
    }

    /**
     * 当前任务序号
     */
    public Long getCurrentTaskSerialNumber() {
        return currentTaskSerialNumber;
    }

    /**
     * 当前任务序号
     */
    public void setCurrentTaskSerialNumber(Long currentTaskSerialNumber) {
        this.currentTaskSerialNumber = currentTaskSerialNumber;
    }

    /**
     * 服务工单发起人ID
     */
    public Long getInitiatorId() {
        return initiatorId;
    }

    /**
     * 服务工单发起人ID
     */
    public void setInitiatorId(Long initiatorId) {
        this.initiatorId = initiatorId;
    }

    /**
     * 服务工单发起人名称
     */
    public String getInitiatorName() {
        return initiatorName;
    }

    /**
     * 服务工单发起人名称
     */
    public void setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
    }

    /**
     * 服务工单发起人头像
     */
    public String getItsmImgPath() {
        return itsmImgPath;
    }

    /**
     * 服务工单发起人头像
     */
    public void setItsmImgPath(String itsmImgPath) {
        this.itsmImgPath = itsmImgPath;
    }

    /**
     * 是否完成
     */
    public Long getComplete() {
        return complete;
    }

    /**
     * 是否完成
     */
    public void setComplete(Long complete) {
        this.complete = complete;
    }

    /**
     * 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
     * 处理状态
     */
    public Long getDisposeStatus() {
        return disposeStatus;
    }

    /**
     * 处理状态
     */
    public void setDisposeStatus(Long disposeStatus) {
        this.disposeStatus = disposeStatus;
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
     * 
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     */
    public void setTitle(String title) {
        this.title = title;
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
    public String getContent() {
        return content;
    }

    /**
     * 
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 响应时间
     */
    public Date getResponseDate() {
        return responseDate;
    }

    /**
     * 响应时间
     */
    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    /**
     * 关闭时间
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 关闭时间
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 是否是变更
     */
    public Long getIsChange() {
        return isChange;
    }

    /**
     * 是否是变更
     */
    public void setIsChange(Long isChange) {
        this.isChange = isChange;
    }

    /**
     * 
     */
    public String getTriggerForm() {
        return triggerForm;
    }

    /**
     * 
     */
    public void setTriggerForm(String triggerForm) {
        this.triggerForm = triggerForm;
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
     * 触发变更id
     */
    public String getEventNum() {
        return eventNum;
    }

    /**
     * 触发变更id
     */
    public void setEventNum(String eventNum) {
        this.eventNum = eventNum;
    }

    /**
     * 触发变更id
     */
    public Long getRequestChangeId() {
        return requestChangeId;
    }

    /**
     * 触发变更id
     */
    public void setRequestChangeId(Long requestChangeId) {
        this.requestChangeId = requestChangeId;
    }

    /**
     * 触发变更编号
     */
    public String getRequestChangeNum() {
        return requestChangeNum;
    }

    /**
     * 触发变更编号
     */
    public void setRequestChangeNum(String requestChangeNum) {
        this.requestChangeNum = requestChangeNum;
    }

    /**
     * 关联ci名称
     */
    public String getCiName() {
        return ciName;
    }

    /**
     * 关联ci名称
     */
    public void setCiName(String ciName) {
        this.ciName = ciName;
    }

    /**
     * 关联问题id
     */
    public Long getRequestProblemId() {
        return requestProblemId;
    }

    /**
     * 关联问题id
     */
    public void setRequestProblemId(Long requestProblemId) {
        this.requestProblemId = requestProblemId;
    }

    /**
     * 关联问题编号
     */
    public String getRequestProblemNum() {
        return requestProblemNum;
    }

    /**
     * 关联问题编号
     */
    public void setRequestProblemNum(String requestProblemNum) {
        this.requestProblemNum = requestProblemNum;
    }

    /**
     * 事件来源
     */
    public String getEventSource() {
        return eventSource;
    }

    /**
     * 事件来源
     */
    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    /**
     * 事件状态
     */
    public String getEventStatus() {
        return eventStatus;
    }

    /**
     * 事件状态
     */
    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    /**
     * 事件引用id
     */
    public Long getRfId() {
        return rfId;
    }

    /**
     * 事件引用id
     */
    public void setRfId(Long rfId) {
        this.rfId = rfId;
    }

    /**
     * 关联的服务请求列表
     */
    public String getRequestJson() {
        return requestJson;
    }

    /**
     * 关联的服务请求列表
     */
    public void setRequestJson(String requestJson) {
        this.requestJson = requestJson;
    }

    /**
     * 关联服务请求
     */
    public String getRequestWork() {
        return requestWork;
    }

    /**
     * 关联服务请求
     */
    public void setRequestWork(String requestWork) {
        this.requestWork = requestWork;
    }

    /**
     * 问题id
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * 问题id
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * 关联ci的ID
     */
    public Long getCiId() {
        return ciId;
    }

    /**
     * 关联ci的ID
     */
    public void setCiId(Long ciId) {
        this.ciId = ciId;
    }

    /**
     * 关联ci的类型
     */
    public String getCiType() {
        return ciType;
    }

    /**
     * 关联ci的类型
     */
    public void setCiType(String ciType) {
        this.ciType = ciType;
    }

    /**
     * 指派处理人
     */
    public Long getAssignPersonId() {
        return assignPersonId;
    }

    /**
     * 指派处理人
     */
    public void setAssignPersonId(Long assignPersonId) {
        this.assignPersonId = assignPersonId;
    }

    /**
     * 父流程执行Id
     */
    public String getSuperProcessId() {
        return superProcessId;
    }

    /**
     * 父流程执行Id
     */
    public void setSuperProcessId(String superProcessId) {
        this.superProcessId = superProcessId;
    }

    /**
     * 当前会签次数
     */
    public Long getTaskCount() {
        return taskCount;
    }

    /**
     * 当前会签次数
     */
    public void setTaskCount(Long taskCount) {
        this.taskCount = taskCount;
    }

    /**
     * 人员范围
     */
    public Long getStaffScope() {
        return staffScope;
    }

    /**
     * 人员范围
     */
    public void setStaffScope(Long staffScope) {
        this.staffScope = staffScope;
    }

    /**
     * 当前ACT任务Id
     */
    public String getActTaskId() {
        return actTaskId;
    }

    /**
     * 当前ACT任务Id
     */
    public void setActTaskId(String actTaskId) {
        this.actTaskId = actTaskId;
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
     * 优先级Id
     */
    public Long getLeveId() {
        return leveId;
    }

    /**
     * 优先级Id
     */
    public void setLeveId(Long leveId) {
        this.leveId = leveId;
    }

    /**
     * 旧的SLA解决时间
     */
    public Date getOldSolveTime() {
        return oldSolveTime;
    }

    /**
     * 旧的SLA解决时间
     */
    public void setOldSolveTime(Date oldSolveTime) {
        this.oldSolveTime = oldSolveTime;
    }

    /**
     * SLA的Id
     */
    public Long getSlaId() {
        return slaId;
    }

    /**
     * SLA的Id
     */
    public void setSlaId(Long slaId) {
        this.slaId = slaId;
    }

    /**
     * SLA响应时间
     */
    public Date getSlaResponseTime() {
        return slaResponseTime;
    }

    /**
     * SLA响应时间
     */
    public void setSlaResponseTime(Date slaResponseTime) {
        this.slaResponseTime = slaResponseTime;
    }

    /**
     * SLA解决时间
     */
    public Date getSolveTime() {
        return solveTime;
    }

    /**
     * SLA解决时间
     */
    public void setSolveTime(Date solveTime) {
        this.solveTime = solveTime;
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
     * 是否同意
     */
    public Long getIsAgree() {
        return isAgree;
    }

    /**
     * 是否同意
     */
    public void setIsAgree(Long isAgree) {
        this.isAgree = isAgree;
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
     * 关单人Id
     */
    public Long getLastAssignorId() {
        return lastAssignorId;
    }

    /**
     * 关单人Id
     */
    public void setLastAssignorId(Long lastAssignorId) {
        this.lastAssignorId = lastAssignorId;
    }

    /**
     * 变更类型
     */
    public String getChangeType() {
        return changeType;
    }

    /**
     * 变更类型
     */
    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /**
     * 区域
     */
    public String getRegion() {
        return region;
    }

    /**
     * 区域
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * 是否为主事件
     */
    public Long getIsPrimaryEvent() {
        return isPrimaryEvent;
    }

    /**
     * 是否为主事件
     */
    public void setIsPrimaryEvent(Long isPrimaryEvent) {
        this.isPrimaryEvent = isPrimaryEvent;
    }

    /**
     * OLA通知时间
     */
    public Date getNoticeTime() {
        return noticeTime;
    }

    /**
     * OLA通知时间
     */
    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }

    /**
     * 请求人类型
     */
    public Long getPersonType() {
        return personType;
    }

    /**
     * 请求人类型
     */
    public void setPersonType(Long personType) {
        this.personType = personType;
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
     * 即将逾期通知时间
     */
    public Date getSoonsolveTime() {
        return soonsolveTime;
    }

    /**
     * 即将逾期通知时间
     */
    public void setSoonsolveTime(Date soonsolveTime) {
        this.soonsolveTime = soonsolveTime;
    }

    /**
     * 全局状态
     */
    public Long getGlobalStatus() {
        return globalStatus;
    }

    /**
     * 全局状态
     */
    public void setGlobalStatus(Long globalStatus) {
        this.globalStatus = globalStatus;
    }

    /**
     * 东亚变更执行时间
     */
    public Date getBeaChangeTime() {
        return beaChangeTime;
    }

    /**
     * 东亚变更执行时间
     */
    public void setBeaChangeTime(Date beaChangeTime) {
        this.beaChangeTime = beaChangeTime;
    }

    /**
     * 东亚风险级别
     */
    public String getBeaRiskLevel() {
        return beaRiskLevel;
    }

    /**
     * 东亚风险级别
     */
    public void setBeaRiskLevel(String beaRiskLevel) {
        this.beaRiskLevel = beaRiskLevel;
    }

    /**
     * 挂起非服务时间（单位：秒）
     */
    public Long getHangNonServiceTime() {
        return hangNonServiceTime;
    }

    /**
     * 挂起非服务时间（单位：秒）
     */
    public void setHangNonServiceTime(Long hangNonServiceTime) {
        this.hangNonServiceTime = hangNonServiceTime;
    }

    /**
     * 
     */
    public Date getRecentHangTime() {
        return recentHangTime;
    }

    /**
     * 
     */
    public void setRecentHangTime(Date recentHangTime) {
        this.recentHangTime = recentHangTime;
    }

    /**
     * 挂起时总时间（单位：秒）
     */
    public Long getTimeLeft() {
        return timeLeft;
    }

    /**
     * 挂起时总时间（单位：秒）
     */
    public void setTimeLeft(Long timeLeft) {
        this.timeLeft = timeLeft;
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
        ItsmServiceWorkListSource other = (ItsmServiceWorkListSource) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getServiceWorkNum() == null ? other.getServiceWorkNum() == null : this.getServiceWorkNum().equals(other.getServiceWorkNum()))
            && (this.getServiceDirectoryId() == null ? other.getServiceDirectoryId() == null : this.getServiceDirectoryId().equals(other.getServiceDirectoryId()))
            && (this.getServiceItemId() == null ? other.getServiceItemId() == null : this.getServiceItemId().equals(other.getServiceItemId()))
            && (this.getProcessModelId() == null ? other.getProcessModelId() == null : this.getProcessModelId().equals(other.getProcessModelId()))
            && (this.getProcessId() == null ? other.getProcessId() == null : this.getProcessId().equals(other.getProcessId()))
            && (this.getCurrentAssignorName() == null ? other.getCurrentAssignorName() == null : this.getCurrentAssignorName().equals(other.getCurrentAssignorName()))
            && (this.getCurrentAssignorId() == null ? other.getCurrentAssignorId() == null : this.getCurrentAssignorId().equals(other.getCurrentAssignorId()))
            && (this.getCurrentAssignorIds() == null ? other.getCurrentAssignorIds() == null : this.getCurrentAssignorIds().equals(other.getCurrentAssignorIds()))
            && (this.getCurrentDistributionMode() == null ? other.getCurrentDistributionMode() == null : this.getCurrentDistributionMode().equals(other.getCurrentDistributionMode()))
            && (this.getCurrentTaskId() == null ? other.getCurrentTaskId() == null : this.getCurrentTaskId().equals(other.getCurrentTaskId()))
            && (this.getCurrentTaskName() == null ? other.getCurrentTaskName() == null : this.getCurrentTaskName().equals(other.getCurrentTaskName()))
            && (this.getCurrentTaskSerialNumber() == null ? other.getCurrentTaskSerialNumber() == null : this.getCurrentTaskSerialNumber().equals(other.getCurrentTaskSerialNumber()))
            && (this.getInitiatorId() == null ? other.getInitiatorId() == null : this.getInitiatorId().equals(other.getInitiatorId()))
            && (this.getInitiatorName() == null ? other.getInitiatorName() == null : this.getInitiatorName().equals(other.getInitiatorName()))
            && (this.getItsmImgPath() == null ? other.getItsmImgPath() == null : this.getItsmImgPath().equals(other.getItsmImgPath()))
            && (this.getComplete() == null ? other.getComplete() == null : this.getComplete().equals(other.getComplete()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getDisposeStatus() == null ? other.getDisposeStatus() == null : this.getDisposeStatus().equals(other.getDisposeStatus()))
            && (this.getServiceItemType() == null ? other.getServiceItemType() == null : this.getServiceItemType().equals(other.getServiceItemType()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getDisposeLevel() == null ? other.getDisposeLevel() == null : this.getDisposeLevel().equals(other.getDisposeLevel()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getResponseDate() == null ? other.getResponseDate() == null : this.getResponseDate().equals(other.getResponseDate()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getIsChange() == null ? other.getIsChange() == null : this.getIsChange().equals(other.getIsChange()))
            && (this.getTriggerForm() == null ? other.getTriggerForm() == null : this.getTriggerForm().equals(other.getTriggerForm()))
            && (this.getHiStatus() == null ? other.getHiStatus() == null : this.getHiStatus().equals(other.getHiStatus()))
            && (this.getEventNum() == null ? other.getEventNum() == null : this.getEventNum().equals(other.getEventNum()))
            && (this.getRequestChangeId() == null ? other.getRequestChangeId() == null : this.getRequestChangeId().equals(other.getRequestChangeId()))
            && (this.getRequestChangeNum() == null ? other.getRequestChangeNum() == null : this.getRequestChangeNum().equals(other.getRequestChangeNum()))
            && (this.getCiName() == null ? other.getCiName() == null : this.getCiName().equals(other.getCiName()))
            && (this.getRequestProblemId() == null ? other.getRequestProblemId() == null : this.getRequestProblemId().equals(other.getRequestProblemId()))
            && (this.getRequestProblemNum() == null ? other.getRequestProblemNum() == null : this.getRequestProblemNum().equals(other.getRequestProblemNum()))
            && (this.getEventSource() == null ? other.getEventSource() == null : this.getEventSource().equals(other.getEventSource()))
            && (this.getEventStatus() == null ? other.getEventStatus() == null : this.getEventStatus().equals(other.getEventStatus()))
            && (this.getRfId() == null ? other.getRfId() == null : this.getRfId().equals(other.getRfId()))
            && (this.getRequestJson() == null ? other.getRequestJson() == null : this.getRequestJson().equals(other.getRequestJson()))
            && (this.getRequestWork() == null ? other.getRequestWork() == null : this.getRequestWork().equals(other.getRequestWork()))
            && (this.getEventId() == null ? other.getEventId() == null : this.getEventId().equals(other.getEventId()))
            && (this.getCiId() == null ? other.getCiId() == null : this.getCiId().equals(other.getCiId()))
            && (this.getCiType() == null ? other.getCiType() == null : this.getCiType().equals(other.getCiType()))
            && (this.getAssignPersonId() == null ? other.getAssignPersonId() == null : this.getAssignPersonId().equals(other.getAssignPersonId()))
            && (this.getSuperProcessId() == null ? other.getSuperProcessId() == null : this.getSuperProcessId().equals(other.getSuperProcessId()))
            && (this.getTaskCount() == null ? other.getTaskCount() == null : this.getTaskCount().equals(other.getTaskCount()))
            && (this.getStaffScope() == null ? other.getStaffScope() == null : this.getStaffScope().equals(other.getStaffScope()))
            && (this.getActTaskId() == null ? other.getActTaskId() == null : this.getActTaskId().equals(other.getActTaskId()))
            && (this.getColor() == null ? other.getColor() == null : this.getColor().equals(other.getColor()))
            && (this.getInfluenceRange() == null ? other.getInfluenceRange() == null : this.getInfluenceRange().equals(other.getInfluenceRange()))
            && (this.getLeveId() == null ? other.getLeveId() == null : this.getLeveId().equals(other.getLeveId()))
            && (this.getOldSolveTime() == null ? other.getOldSolveTime() == null : this.getOldSolveTime().equals(other.getOldSolveTime()))
            && (this.getSlaId() == null ? other.getSlaId() == null : this.getSlaId().equals(other.getSlaId()))
            && (this.getSlaResponseTime() == null ? other.getSlaResponseTime() == null : this.getSlaResponseTime().equals(other.getSlaResponseTime()))
            && (this.getSolveTime() == null ? other.getSolveTime() == null : this.getSolveTime().equals(other.getSolveTime()))
            && (this.getUrgentLevel() == null ? other.getUrgentLevel() == null : this.getUrgentLevel().equals(other.getUrgentLevel()))
            && (this.getIsAgree() == null ? other.getIsAgree() == null : this.getIsAgree().equals(other.getIsAgree()))
            && (this.getItemTypeId() == null ? other.getItemTypeId() == null : this.getItemTypeId().equals(other.getItemTypeId()))
            && (this.getLastAssignorId() == null ? other.getLastAssignorId() == null : this.getLastAssignorId().equals(other.getLastAssignorId()))
            && (this.getChangeType() == null ? other.getChangeType() == null : this.getChangeType().equals(other.getChangeType()))
            && (this.getRegion() == null ? other.getRegion() == null : this.getRegion().equals(other.getRegion()))
            && (this.getIsPrimaryEvent() == null ? other.getIsPrimaryEvent() == null : this.getIsPrimaryEvent().equals(other.getIsPrimaryEvent()))
            && (this.getNoticeTime() == null ? other.getNoticeTime() == null : this.getNoticeTime().equals(other.getNoticeTime()))
            && (this.getPersonType() == null ? other.getPersonType() == null : this.getPersonType().equals(other.getPersonType()))
            && (this.getTemplateId() == null ? other.getTemplateId() == null : this.getTemplateId().equals(other.getTemplateId()))
            && (this.getSoonsolveTime() == null ? other.getSoonsolveTime() == null : this.getSoonsolveTime().equals(other.getSoonsolveTime()))
            && (this.getGlobalStatus() == null ? other.getGlobalStatus() == null : this.getGlobalStatus().equals(other.getGlobalStatus()))
            && (this.getBeaChangeTime() == null ? other.getBeaChangeTime() == null : this.getBeaChangeTime().equals(other.getBeaChangeTime()))
            && (this.getBeaRiskLevel() == null ? other.getBeaRiskLevel() == null : this.getBeaRiskLevel().equals(other.getBeaRiskLevel()))
            && (this.getHangNonServiceTime() == null ? other.getHangNonServiceTime() == null : this.getHangNonServiceTime().equals(other.getHangNonServiceTime()))
            && (this.getRecentHangTime() == null ? other.getRecentHangTime() == null : this.getRecentHangTime().equals(other.getRecentHangTime()))
            && (this.getTimeLeft() == null ? other.getTimeLeft() == null : this.getTimeLeft().equals(other.getTimeLeft()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getServiceWorkNum() == null) ? 0 : getServiceWorkNum().hashCode());
        result = prime * result + ((getServiceDirectoryId() == null) ? 0 : getServiceDirectoryId().hashCode());
        result = prime * result + ((getServiceItemId() == null) ? 0 : getServiceItemId().hashCode());
        result = prime * result + ((getProcessModelId() == null) ? 0 : getProcessModelId().hashCode());
        result = prime * result + ((getProcessId() == null) ? 0 : getProcessId().hashCode());
        result = prime * result + ((getCurrentAssignorName() == null) ? 0 : getCurrentAssignorName().hashCode());
        result = prime * result + ((getCurrentAssignorId() == null) ? 0 : getCurrentAssignorId().hashCode());
        result = prime * result + ((getCurrentAssignorIds() == null) ? 0 : getCurrentAssignorIds().hashCode());
        result = prime * result + ((getCurrentDistributionMode() == null) ? 0 : getCurrentDistributionMode().hashCode());
        result = prime * result + ((getCurrentTaskId() == null) ? 0 : getCurrentTaskId().hashCode());
        result = prime * result + ((getCurrentTaskName() == null) ? 0 : getCurrentTaskName().hashCode());
        result = prime * result + ((getCurrentTaskSerialNumber() == null) ? 0 : getCurrentTaskSerialNumber().hashCode());
        result = prime * result + ((getInitiatorId() == null) ? 0 : getInitiatorId().hashCode());
        result = prime * result + ((getInitiatorName() == null) ? 0 : getInitiatorName().hashCode());
        result = prime * result + ((getItsmImgPath() == null) ? 0 : getItsmImgPath().hashCode());
        result = prime * result + ((getComplete() == null) ? 0 : getComplete().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getDisposeStatus() == null) ? 0 : getDisposeStatus().hashCode());
        result = prime * result + ((getServiceItemType() == null) ? 0 : getServiceItemType().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getDisposeLevel() == null) ? 0 : getDisposeLevel().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getResponseDate() == null) ? 0 : getResponseDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getIsChange() == null) ? 0 : getIsChange().hashCode());
        result = prime * result + ((getTriggerForm() == null) ? 0 : getTriggerForm().hashCode());
        result = prime * result + ((getHiStatus() == null) ? 0 : getHiStatus().hashCode());
        result = prime * result + ((getEventNum() == null) ? 0 : getEventNum().hashCode());
        result = prime * result + ((getRequestChangeId() == null) ? 0 : getRequestChangeId().hashCode());
        result = prime * result + ((getRequestChangeNum() == null) ? 0 : getRequestChangeNum().hashCode());
        result = prime * result + ((getCiName() == null) ? 0 : getCiName().hashCode());
        result = prime * result + ((getRequestProblemId() == null) ? 0 : getRequestProblemId().hashCode());
        result = prime * result + ((getRequestProblemNum() == null) ? 0 : getRequestProblemNum().hashCode());
        result = prime * result + ((getEventSource() == null) ? 0 : getEventSource().hashCode());
        result = prime * result + ((getEventStatus() == null) ? 0 : getEventStatus().hashCode());
        result = prime * result + ((getRfId() == null) ? 0 : getRfId().hashCode());
        result = prime * result + ((getRequestJson() == null) ? 0 : getRequestJson().hashCode());
        result = prime * result + ((getRequestWork() == null) ? 0 : getRequestWork().hashCode());
        result = prime * result + ((getEventId() == null) ? 0 : getEventId().hashCode());
        result = prime * result + ((getCiId() == null) ? 0 : getCiId().hashCode());
        result = prime * result + ((getCiType() == null) ? 0 : getCiType().hashCode());
        result = prime * result + ((getAssignPersonId() == null) ? 0 : getAssignPersonId().hashCode());
        result = prime * result + ((getSuperProcessId() == null) ? 0 : getSuperProcessId().hashCode());
        result = prime * result + ((getTaskCount() == null) ? 0 : getTaskCount().hashCode());
        result = prime * result + ((getStaffScope() == null) ? 0 : getStaffScope().hashCode());
        result = prime * result + ((getActTaskId() == null) ? 0 : getActTaskId().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        result = prime * result + ((getInfluenceRange() == null) ? 0 : getInfluenceRange().hashCode());
        result = prime * result + ((getLeveId() == null) ? 0 : getLeveId().hashCode());
        result = prime * result + ((getOldSolveTime() == null) ? 0 : getOldSolveTime().hashCode());
        result = prime * result + ((getSlaId() == null) ? 0 : getSlaId().hashCode());
        result = prime * result + ((getSlaResponseTime() == null) ? 0 : getSlaResponseTime().hashCode());
        result = prime * result + ((getSolveTime() == null) ? 0 : getSolveTime().hashCode());
        result = prime * result + ((getUrgentLevel() == null) ? 0 : getUrgentLevel().hashCode());
        result = prime * result + ((getIsAgree() == null) ? 0 : getIsAgree().hashCode());
        result = prime * result + ((getItemTypeId() == null) ? 0 : getItemTypeId().hashCode());
        result = prime * result + ((getLastAssignorId() == null) ? 0 : getLastAssignorId().hashCode());
        result = prime * result + ((getChangeType() == null) ? 0 : getChangeType().hashCode());
        result = prime * result + ((getRegion() == null) ? 0 : getRegion().hashCode());
        result = prime * result + ((getIsPrimaryEvent() == null) ? 0 : getIsPrimaryEvent().hashCode());
        result = prime * result + ((getNoticeTime() == null) ? 0 : getNoticeTime().hashCode());
        result = prime * result + ((getPersonType() == null) ? 0 : getPersonType().hashCode());
        result = prime * result + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        result = prime * result + ((getSoonsolveTime() == null) ? 0 : getSoonsolveTime().hashCode());
        result = prime * result + ((getGlobalStatus() == null) ? 0 : getGlobalStatus().hashCode());
        result = prime * result + ((getBeaChangeTime() == null) ? 0 : getBeaChangeTime().hashCode());
        result = prime * result + ((getBeaRiskLevel() == null) ? 0 : getBeaRiskLevel().hashCode());
        result = prime * result + ((getHangNonServiceTime() == null) ? 0 : getHangNonServiceTime().hashCode());
        result = prime * result + ((getRecentHangTime() == null) ? 0 : getRecentHangTime().hashCode());
        result = prime * result + ((getTimeLeft() == null) ? 0 : getTimeLeft().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serviceWorkNum=").append(serviceWorkNum);
        sb.append(", serviceDirectoryId=").append(serviceDirectoryId);
        sb.append(", serviceItemId=").append(serviceItemId);
        sb.append(", processModelId=").append(processModelId);
        sb.append(", processId=").append(processId);
        sb.append(", currentAssignorName=").append(currentAssignorName);
        sb.append(", currentAssignorId=").append(currentAssignorId);
        sb.append(", currentAssignorIds=").append(currentAssignorIds);
        sb.append(", currentDistributionMode=").append(currentDistributionMode);
        sb.append(", currentTaskId=").append(currentTaskId);
        sb.append(", currentTaskName=").append(currentTaskName);
        sb.append(", currentTaskSerialNumber=").append(currentTaskSerialNumber);
        sb.append(", initiatorId=").append(initiatorId);
        sb.append(", initiatorName=").append(initiatorName);
        sb.append(", itsmImgPath=").append(itsmImgPath);
        sb.append(", complete=").append(complete);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", disposeStatus=").append(disposeStatus);
        sb.append(", serviceItemType=").append(serviceItemType);
        sb.append(", title=").append(title);
        sb.append(", disposeLevel=").append(disposeLevel);
        sb.append(", content=").append(content);
        sb.append(", responseDate=").append(responseDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", isChange=").append(isChange);
        sb.append(", triggerForm=").append(triggerForm);
        sb.append(", hiStatus=").append(hiStatus);
        sb.append(", eventNum=").append(eventNum);
        sb.append(", requestChangeId=").append(requestChangeId);
        sb.append(", requestChangeNum=").append(requestChangeNum);
        sb.append(", ciName=").append(ciName);
        sb.append(", requestProblemId=").append(requestProblemId);
        sb.append(", requestProblemNum=").append(requestProblemNum);
        sb.append(", eventSource=").append(eventSource);
        sb.append(", eventStatus=").append(eventStatus);
        sb.append(", rfId=").append(rfId);
        sb.append(", requestJson=").append(requestJson);
        sb.append(", requestWork=").append(requestWork);
        sb.append(", eventId=").append(eventId);
        sb.append(", ciId=").append(ciId);
        sb.append(", ciType=").append(ciType);
        sb.append(", assignPersonId=").append(assignPersonId);
        sb.append(", superProcessId=").append(superProcessId);
        sb.append(", taskCount=").append(taskCount);
        sb.append(", staffScope=").append(staffScope);
        sb.append(", actTaskId=").append(actTaskId);
        sb.append(", color=").append(color);
        sb.append(", influenceRange=").append(influenceRange);
        sb.append(", leveId=").append(leveId);
        sb.append(", oldSolveTime=").append(oldSolveTime);
        sb.append(", slaId=").append(slaId);
        sb.append(", slaResponseTime=").append(slaResponseTime);
        sb.append(", solveTime=").append(solveTime);
        sb.append(", urgentLevel=").append(urgentLevel);
        sb.append(", isAgree=").append(isAgree);
        sb.append(", itemTypeId=").append(itemTypeId);
        sb.append(", lastAssignorId=").append(lastAssignorId);
        sb.append(", changeType=").append(changeType);
        sb.append(", region=").append(region);
        sb.append(", isPrimaryEvent=").append(isPrimaryEvent);
        sb.append(", noticeTime=").append(noticeTime);
        sb.append(", personType=").append(personType);
        sb.append(", templateId=").append(templateId);
        sb.append(", soonsolveTime=").append(soonsolveTime);
        sb.append(", globalStatus=").append(globalStatus);
        sb.append(", beaChangeTime=").append(beaChangeTime);
        sb.append(", beaRiskLevel=").append(beaRiskLevel);
        sb.append(", hangNonServiceTime=").append(hangNonServiceTime);
        sb.append(", recentHangTime=").append(recentHangTime);
        sb.append(", timeLeft=").append(timeLeft);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}