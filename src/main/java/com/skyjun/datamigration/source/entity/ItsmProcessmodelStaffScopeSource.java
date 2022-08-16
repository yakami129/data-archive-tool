package com.skyjun.datamigration.source.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * @TableName itsm_processmodel_staff_scope
 */
@TableName(value = "itsm_processmodel_staff_scope")
public class ItsmProcessmodelStaffScopeSource implements Serializable {
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
    private Long itsmProId;
    /**
     * 任务模型ID
     */
    private Long itsmTaskId;
    /**
     * 用户ID
     */
    private Long itsmProUserAndGroup;
    /**
     *
     */
    private String itsmProType;
    /**
     * 组的父Id
     */
    private Long groupParentId;
    /**
     * 登录名
     */
    private String itsmLogin;

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
    public Long getItsmProId() {
        return itsmProId;
    }

    /**
     * 流程模型ID
     */
    public void setItsmProId(Long itsmProId) {
        this.itsmProId = itsmProId;
    }

    /**
     * 任务模型ID
     */
    public Long getItsmTaskId() {
        return itsmTaskId;
    }

    /**
     * 任务模型ID
     */
    public void setItsmTaskId(Long itsmTaskId) {
        this.itsmTaskId = itsmTaskId;
    }

    /**
     * 用户ID
     */
    public Long getItsmProUserAndGroup() {
        return itsmProUserAndGroup;
    }

    /**
     * 用户ID
     */
    public void setItsmProUserAndGroup(Long itsmProUserAndGroup) {
        this.itsmProUserAndGroup = itsmProUserAndGroup;
    }

    /**
     *
     */
    public String getItsmProType() {
        return itsmProType;
    }

    /**
     *
     */
    public void setItsmProType(String itsmProType) {
        this.itsmProType = itsmProType;
    }

    /**
     * 组的父Id
     */
    public Long getGroupParentId() {
        return groupParentId;
    }

    /**
     * 组的父Id
     */
    public void setGroupParentId(Long groupParentId) {
        this.groupParentId = groupParentId;
    }

    /**
     * 登录名
     */
    public String getItsmLogin() {
        return itsmLogin;
    }

    /**
     * 登录名
     */
    public void setItsmLogin(String itsmLogin) {
        this.itsmLogin = itsmLogin;
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
        ItsmProcessmodelStaffScopeSource other = (ItsmProcessmodelStaffScopeSource) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getItsmProId() == null ? other.getItsmProId() == null : this.getItsmProId().equals(other.getItsmProId()))
                && (this.getItsmTaskId() == null ? other.getItsmTaskId() == null : this.getItsmTaskId().equals(other.getItsmTaskId()))
                && (this.getItsmProUserAndGroup() == null ? other.getItsmProUserAndGroup() == null : this.getItsmProUserAndGroup().equals(other.getItsmProUserAndGroup()))
                && (this.getItsmProType() == null ? other.getItsmProType() == null : this.getItsmProType().equals(other.getItsmProType()))
                && (this.getGroupParentId() == null ? other.getGroupParentId() == null : this.getGroupParentId().equals(other.getGroupParentId()))
                && (this.getItsmLogin() == null ? other.getItsmLogin() == null : this.getItsmLogin().equals(other.getItsmLogin()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getItsmProId() == null) ? 0 : getItsmProId().hashCode());
        result = prime * result + ((getItsmTaskId() == null) ? 0 : getItsmTaskId().hashCode());
        result = prime * result + ((getItsmProUserAndGroup() == null) ? 0 : getItsmProUserAndGroup().hashCode());
        result = prime * result + ((getItsmProType() == null) ? 0 : getItsmProType().hashCode());
        result = prime * result + ((getGroupParentId() == null) ? 0 : getGroupParentId().hashCode());
        result = prime * result + ((getItsmLogin() == null) ? 0 : getItsmLogin().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", itsmProId=").append(itsmProId);
        sb.append(", itsmTaskId=").append(itsmTaskId);
        sb.append(", itsmProUserAndGroup=").append(itsmProUserAndGroup);
        sb.append(", itsmProType=").append(itsmProType);
        sb.append(", groupParentId=").append(groupParentId);
        sb.append(", itsmLogin=").append(itsmLogin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}