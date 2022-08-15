package com.skyjun.datamigration.target.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName itsm_service_work_user_department
 */
@TableName(value ="itsm_service_work_user_department")
public class ItsmServiceWorkUserDepartmentTarget implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.NONE)
    private Long id;

    /**
     * 用户部门ID
     */
    private Long departmentId;

    /**
     * 服务目录ID
     */
    private Long serviceWorkId;

    /**
     * 用户类型
     */
    private Integer type;

    /**
     * 用户ID
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
     * 用户部门ID
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * 用户部门ID
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 服务目录ID
     */
    public Long getServiceWorkId() {
        return serviceWorkId;
    }

    /**
     * 服务目录ID
     */
    public void setServiceWorkId(Long serviceWorkId) {
        this.serviceWorkId = serviceWorkId;
    }

    /**
     * 用户类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 用户类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户ID
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
        ItsmServiceWorkUserDepartmentTarget other = (ItsmServiceWorkUserDepartmentTarget) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDepartmentId() == null ? other.getDepartmentId() == null : this.getDepartmentId().equals(other.getDepartmentId()))
            && (this.getServiceWorkId() == null ? other.getServiceWorkId() == null : this.getServiceWorkId().equals(other.getServiceWorkId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDepartmentId() == null) ? 0 : getDepartmentId().hashCode());
        result = prime * result + ((getServiceWorkId() == null) ? 0 : getServiceWorkId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
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
        sb.append(", departmentId=").append(departmentId);
        sb.append(", serviceWorkId=").append(serviceWorkId);
        sb.append(", type=").append(type);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}