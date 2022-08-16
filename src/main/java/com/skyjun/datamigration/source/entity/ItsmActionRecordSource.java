package com.skyjun.datamigration.source.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName itsm_action_record
 */
@TableName(value ="itsm_action_record")
public class ItsmActionRecordSource implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.NONE)
    private Long id;

    /**
     * 
     */
    private String actionLog;

    /**
     * 操作用户
     */
    private Date createDate;

    /**
     * 操作步骤
     */
    private String step;

    /**
     * 任务Id
     */
    private Long taskId;

    /**
     * 操作用户
     */
    private String userName;

    /**
     * 工单Id
     */
    private Long workId;

    /**
     * 操作用户Id
     */
    private Long userId;

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
    public String getActionLog() {
        return actionLog;
    }

    /**
     * 
     */
    public void setActionLog(String actionLog) {
        this.actionLog = actionLog;
    }

    /**
     * 操作用户
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 操作用户
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 操作步骤
     */
    public String getStep() {
        return step;
    }

    /**
     * 操作步骤
     */
    public void setStep(String step) {
        this.step = step;
    }

    /**
     * 任务Id
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * 任务Id
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * 操作用户
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 操作用户
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 工单Id
     */
    public Long getWorkId() {
        return workId;
    }

    /**
     * 工单Id
     */
    public void setWorkId(Long workId) {
        this.workId = workId;
    }

    /**
     * 操作用户Id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 操作用户Id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
        ItsmActionRecordSource other = (ItsmActionRecordSource) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getActionLog() == null ? other.getActionLog() == null : this.getActionLog().equals(other.getActionLog()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getStep() == null ? other.getStep() == null : this.getStep().equals(other.getStep()))
            && (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getWorkId() == null ? other.getWorkId() == null : this.getWorkId().equals(other.getWorkId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getActionLog() == null) ? 0 : getActionLog().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getStep() == null) ? 0 : getStep().hashCode());
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getWorkId() == null) ? 0 : getWorkId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", actionLog=").append(actionLog);
        sb.append(", createDate=").append(createDate);
        sb.append(", step=").append(step);
        sb.append(", taskId=").append(taskId);
        sb.append(", userName=").append(userName);
        sb.append(", workId=").append(workId);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}