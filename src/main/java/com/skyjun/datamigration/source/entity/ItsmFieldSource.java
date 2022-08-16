package com.skyjun.datamigration.source.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName itsm_field
 */
@TableName(value = "itsm_field")
public class ItsmFieldSource implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     * ID
     */
    @TableId(type = IdType.NONE)
    private Long id;
    /**
     * 字段编号
     */
    private String fieldNum;
    /**
     * 字段名称
     */
    private String fieldName;
    /**
     * 字段数据类型
     */
    private String fieldDataType;
    /**
     * 控件名称
     */
    private String fieldControlName;
    /**
     * 字段控件类型
     */
    private String fieldControlType;
    /**
     * 字段默认值
     */
    private String fieldDefaultValue;
    /**
     * 字段扩展属性（JSON）
     */
    private String fieldExtendJson;
    /**
     * 字段扩展URL
     */
    private String fieldExtendUrl;
    /**
     *
     */
    private Date createDate;
    /**
     *
     */
    private Date updateDate;
    /**
     * ico
     */
    private String fieldIco;
    /**
     * 文本最大长度，整数最大值，浮点数最大值
     */
    private Double fieldMax;
    /**
     *
     */
    private Double fieldMin;
    /**
     * 保留几位小数
     */
    private Long fieldRetainedDecimal;
    /**
     *
     */
    private String fieldCompany;
    /**
     * 是否仅日期
     */
    private Long fieldIsDateOnly;
    /**
     * 是否为内置字段
     */
    private Long fieldIsBuiltin;
    /**
     *
     */
    private String configuration;
    /**
     * 下拉菜单配置
     */
    private String selectConfig;
    /**
     * 内置字段是否可以修改 0：否  1：是
     */
    private Long isUpdate;
    /**
     * 系统字段 0：否  1：是
     */
    private Long sysField;
    /**
     * 字段描述
     */
    private String remark;
    /**
     * 内置字段是否可以修改 0：不需要  1：需要
     */
    private Long needRequest;

    /**
     * ID
     */
    public Long getId() {
        return id;
    }

    /**
     * ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 字段编号
     */
    public String getFieldNum() {
        return fieldNum;
    }

    /**
     * 字段编号
     */
    public void setFieldNum(String fieldNum) {
        this.fieldNum = fieldNum;
    }

    /**
     * 字段名称
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * 字段名称
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * 字段数据类型
     */
    public String getFieldDataType() {
        return fieldDataType;
    }

    /**
     * 字段数据类型
     */
    public void setFieldDataType(String fieldDataType) {
        this.fieldDataType = fieldDataType;
    }

    /**
     * 控件名称
     */
    public String getFieldControlName() {
        return fieldControlName;
    }

    /**
     * 控件名称
     */
    public void setFieldControlName(String fieldControlName) {
        this.fieldControlName = fieldControlName;
    }

    /**
     * 字段控件类型
     */
    public String getFieldControlType() {
        return fieldControlType;
    }

    /**
     * 字段控件类型
     */
    public void setFieldControlType(String fieldControlType) {
        this.fieldControlType = fieldControlType;
    }

    /**
     * 字段默认值
     */
    public String getFieldDefaultValue() {
        return fieldDefaultValue;
    }

    /**
     * 字段默认值
     */
    public void setFieldDefaultValue(String fieldDefaultValue) {
        this.fieldDefaultValue = fieldDefaultValue;
    }

    /**
     * 字段扩展属性（JSON）
     */
    public String getFieldExtendJson() {
        return fieldExtendJson;
    }

    /**
     * 字段扩展属性（JSON）
     */
    public void setFieldExtendJson(String fieldExtendJson) {
        this.fieldExtendJson = fieldExtendJson;
    }

    /**
     * 字段扩展URL
     */
    public String getFieldExtendUrl() {
        return fieldExtendUrl;
    }

    /**
     * 字段扩展URL
     */
    public void setFieldExtendUrl(String fieldExtendUrl) {
        this.fieldExtendUrl = fieldExtendUrl;
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
     * ico
     */
    public String getFieldIco() {
        return fieldIco;
    }

    /**
     * ico
     */
    public void setFieldIco(String fieldIco) {
        this.fieldIco = fieldIco;
    }

    /**
     * 文本最大长度，整数最大值，浮点数最大值
     */
    public Double getFieldMax() {
        return fieldMax;
    }

    /**
     * 文本最大长度，整数最大值，浮点数最大值
     */
    public void setFieldMax(Double fieldMax) {
        this.fieldMax = fieldMax;
    }

    /**
     *
     */
    public Double getFieldMin() {
        return fieldMin;
    }

    /**
     *
     */
    public void setFieldMin(Double fieldMin) {
        this.fieldMin = fieldMin;
    }

    /**
     * 保留几位小数
     */
    public Long getFieldRetainedDecimal() {
        return fieldRetainedDecimal;
    }

    /**
     * 保留几位小数
     */
    public void setFieldRetainedDecimal(Long fieldRetainedDecimal) {
        this.fieldRetainedDecimal = fieldRetainedDecimal;
    }

    /**
     *
     */
    public String getFieldCompany() {
        return fieldCompany;
    }

    /**
     *
     */
    public void setFieldCompany(String fieldCompany) {
        this.fieldCompany = fieldCompany;
    }

    /**
     * 是否仅日期
     */
    public Long getFieldIsDateOnly() {
        return fieldIsDateOnly;
    }

    /**
     * 是否仅日期
     */
    public void setFieldIsDateOnly(Long fieldIsDateOnly) {
        this.fieldIsDateOnly = fieldIsDateOnly;
    }

    /**
     * 是否为内置字段
     */
    public Long getFieldIsBuiltin() {
        return fieldIsBuiltin;
    }

    /**
     * 是否为内置字段
     */
    public void setFieldIsBuiltin(Long fieldIsBuiltin) {
        this.fieldIsBuiltin = fieldIsBuiltin;
    }

    /**
     *
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     *
     */
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * 下拉菜单配置
     */
    public String getSelectConfig() {
        return selectConfig;
    }

    /**
     * 下拉菜单配置
     */
    public void setSelectConfig(String selectConfig) {
        this.selectConfig = selectConfig;
    }

    /**
     * 内置字段是否可以修改 0：否  1：是
     */
    public Long getIsUpdate() {
        return isUpdate;
    }

    /**
     * 内置字段是否可以修改 0：否  1：是
     */
    public void setIsUpdate(Long isUpdate) {
        this.isUpdate = isUpdate;
    }

    /**
     * 系统字段 0：否  1：是
     */
    public Long getSysField() {
        return sysField;
    }

    /**
     * 系统字段 0：否  1：是
     */
    public void setSysField(Long sysField) {
        this.sysField = sysField;
    }

    /**
     * 字段描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 字段描述
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 内置字段是否可以修改 0：不需要  1：需要
     */
    public Long getNeedRequest() {
        return needRequest;
    }

    /**
     * 内置字段是否可以修改 0：不需要  1：需要
     */
    public void setNeedRequest(Long needRequest) {
        this.needRequest = needRequest;
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
        ItsmFieldSource other = (ItsmFieldSource) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getFieldNum() == null ? other.getFieldNum() == null : this.getFieldNum().equals(other.getFieldNum()))
                && (this.getFieldName() == null ? other.getFieldName() == null : this.getFieldName().equals(other.getFieldName()))
                && (this.getFieldDataType() == null ? other.getFieldDataType() == null : this.getFieldDataType().equals(other.getFieldDataType()))
                && (this.getFieldControlName() == null ? other.getFieldControlName() == null : this.getFieldControlName().equals(other.getFieldControlName()))
                && (this.getFieldControlType() == null ? other.getFieldControlType() == null : this.getFieldControlType().equals(other.getFieldControlType()))
                && (this.getFieldDefaultValue() == null ? other.getFieldDefaultValue() == null : this.getFieldDefaultValue().equals(other.getFieldDefaultValue()))
                && (this.getFieldExtendJson() == null ? other.getFieldExtendJson() == null : this.getFieldExtendJson().equals(other.getFieldExtendJson()))
                && (this.getFieldExtendUrl() == null ? other.getFieldExtendUrl() == null : this.getFieldExtendUrl().equals(other.getFieldExtendUrl()))
                && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
                && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
                && (this.getFieldIco() == null ? other.getFieldIco() == null : this.getFieldIco().equals(other.getFieldIco()))
                && (this.getFieldMax() == null ? other.getFieldMax() == null : this.getFieldMax().equals(other.getFieldMax()))
                && (this.getFieldMin() == null ? other.getFieldMin() == null : this.getFieldMin().equals(other.getFieldMin()))
                && (this.getFieldRetainedDecimal() == null ? other.getFieldRetainedDecimal() == null : this.getFieldRetainedDecimal().equals(other.getFieldRetainedDecimal()))
                && (this.getFieldCompany() == null ? other.getFieldCompany() == null : this.getFieldCompany().equals(other.getFieldCompany()))
                && (this.getFieldIsDateOnly() == null ? other.getFieldIsDateOnly() == null : this.getFieldIsDateOnly().equals(other.getFieldIsDateOnly()))
                && (this.getFieldIsBuiltin() == null ? other.getFieldIsBuiltin() == null : this.getFieldIsBuiltin().equals(other.getFieldIsBuiltin()))
                && (this.getConfiguration() == null ? other.getConfiguration() == null : this.getConfiguration().equals(other.getConfiguration()))
                && (this.getSelectConfig() == null ? other.getSelectConfig() == null : this.getSelectConfig().equals(other.getSelectConfig()))
                && (this.getIsUpdate() == null ? other.getIsUpdate() == null : this.getIsUpdate().equals(other.getIsUpdate()))
                && (this.getSysField() == null ? other.getSysField() == null : this.getSysField().equals(other.getSysField()))
                && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
                && (this.getNeedRequest() == null ? other.getNeedRequest() == null : this.getNeedRequest().equals(other.getNeedRequest()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFieldNum() == null) ? 0 : getFieldNum().hashCode());
        result = prime * result + ((getFieldName() == null) ? 0 : getFieldName().hashCode());
        result = prime * result + ((getFieldDataType() == null) ? 0 : getFieldDataType().hashCode());
        result = prime * result + ((getFieldControlName() == null) ? 0 : getFieldControlName().hashCode());
        result = prime * result + ((getFieldControlType() == null) ? 0 : getFieldControlType().hashCode());
        result = prime * result + ((getFieldDefaultValue() == null) ? 0 : getFieldDefaultValue().hashCode());
        result = prime * result + ((getFieldExtendJson() == null) ? 0 : getFieldExtendJson().hashCode());
        result = prime * result + ((getFieldExtendUrl() == null) ? 0 : getFieldExtendUrl().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getFieldIco() == null) ? 0 : getFieldIco().hashCode());
        result = prime * result + ((getFieldMax() == null) ? 0 : getFieldMax().hashCode());
        result = prime * result + ((getFieldMin() == null) ? 0 : getFieldMin().hashCode());
        result = prime * result + ((getFieldRetainedDecimal() == null) ? 0 : getFieldRetainedDecimal().hashCode());
        result = prime * result + ((getFieldCompany() == null) ? 0 : getFieldCompany().hashCode());
        result = prime * result + ((getFieldIsDateOnly() == null) ? 0 : getFieldIsDateOnly().hashCode());
        result = prime * result + ((getFieldIsBuiltin() == null) ? 0 : getFieldIsBuiltin().hashCode());
        result = prime * result + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        result = prime * result + ((getSelectConfig() == null) ? 0 : getSelectConfig().hashCode());
        result = prime * result + ((getIsUpdate() == null) ? 0 : getIsUpdate().hashCode());
        result = prime * result + ((getSysField() == null) ? 0 : getSysField().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getNeedRequest() == null) ? 0 : getNeedRequest().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fieldNum=").append(fieldNum);
        sb.append(", fieldName=").append(fieldName);
        sb.append(", fieldDataType=").append(fieldDataType);
        sb.append(", fieldControlName=").append(fieldControlName);
        sb.append(", fieldControlType=").append(fieldControlType);
        sb.append(", fieldDefaultValue=").append(fieldDefaultValue);
        sb.append(", fieldExtendJson=").append(fieldExtendJson);
        sb.append(", fieldExtendUrl=").append(fieldExtendUrl);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", fieldIco=").append(fieldIco);
        sb.append(", fieldMax=").append(fieldMax);
        sb.append(", fieldMin=").append(fieldMin);
        sb.append(", fieldRetainedDecimal=").append(fieldRetainedDecimal);
        sb.append(", fieldCompany=").append(fieldCompany);
        sb.append(", fieldIsDateOnly=").append(fieldIsDateOnly);
        sb.append(", fieldIsBuiltin=").append(fieldIsBuiltin);
        sb.append(", configuration=").append(configuration);
        sb.append(", selectConfig=").append(selectConfig);
        sb.append(", isUpdate=").append(isUpdate);
        sb.append(", sysField=").append(sysField);
        sb.append(", remark=").append(remark);
        sb.append(", needRequest=").append(needRequest);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}