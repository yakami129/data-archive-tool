package com.skyjun.datamigration.source.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName itsm_person
 */
@TableName(value ="itsm_person")
public class ItsmPersonSource implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.NONE)
    private Long itsmId;

    /**
     * 微信账号
     */
    private String weixin;

    /**
     * 
     */
    private String itsmLogin;

    /**
     * 
     */
    private String itsmPhone;

    /**
     * 
     */
    private String itsmProfilePath;

    /**
     * 
     */
    private String itsmPwd;

    /**
     * 
     */
    private String itsmEmail;

    /**
     * 
     */
    private String itsmMsgStatus;

    /**
     * 
     */
    private String itsmQq;

    /**
     * 
     */
    private String itsmWechat;

    /**
     * 
     */
    private String itsmName;

    /**
     * 
     */
    private Integer itsmLocationId;

    /**
     * 
     */
    private String itsmNumber;

    /**
     * 
     */
    private String itsmStatus;

    /**
     * 
     */
    private String itsmTime;

    /**
     * 
     */
    private String itsmUpPerson;

    /**
     * 
     */
    private Integer itsmTeamId;

    /**
     * 
     */
    private String itsmLocation;

    /**
     * 
     */
    private String itsmOrganization;

    /**
     * 
     */
    private String itsmTeam;

    /**
     * 关联项数量
     */
    private Integer itsmDevice;

    /**
     * 
     */
    private Integer itsmOrganizationId;

    /**
     * 
     */
    private Integer itsmUpPersonId;

    /**
     * 关联项数量
     */
    private String itsmDuties;

    /**
     * 职责
     */
    private String itsmPosition;

    /**
     * 
     */
    private Long itsmPersonType;

    /**
     * 引用cmdb
     */
    private Long itsmRefId;

    /**
     * 
     */
    private String itsmImgPath;

    /**
     * 背景图片
     */
    private String itsmImgBackground;

    /**
     * 分配权重
     */
    private Long weight;

    /**
     * 
     */
    private String newteams;

    /**
     * 用户状态
     */
    private Long userStatus;

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 服务类别
     */
    private Long itemTypeId;

    /**
     * 来源(0-ldap导入的管理用户, 1-ldap导入的门户用户, 2-非ldap用户)
     */
    private Long source;

    /**
     * 用户来源， 0-系统用户 1-LDAP 2-企业微信, 3-钉钉
     */
    private Byte userSource;

    /**
     * 企业微信用户ID
     */
    private String workWeChartUserId;

    /**
     * 
     */
    private String dingTalkUserId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Long getItsmId() {
        return itsmId;
    }

    /**
     * 
     */
    public void setItsmId(Long itsmId) {
        this.itsmId = itsmId;
    }

    /**
     * 微信账号
     */
    public String getWeixin() {
        return weixin;
    }

    /**
     * 微信账号
     */
    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    /**
     * 
     */
    public String getItsmLogin() {
        return itsmLogin;
    }

    /**
     * 
     */
    public void setItsmLogin(String itsmLogin) {
        this.itsmLogin = itsmLogin;
    }

    /**
     * 
     */
    public String getItsmPhone() {
        return itsmPhone;
    }

    /**
     * 
     */
    public void setItsmPhone(String itsmPhone) {
        this.itsmPhone = itsmPhone;
    }

    /**
     * 
     */
    public String getItsmProfilePath() {
        return itsmProfilePath;
    }

    /**
     * 
     */
    public void setItsmProfilePath(String itsmProfilePath) {
        this.itsmProfilePath = itsmProfilePath;
    }

    /**
     * 
     */
    public String getItsmPwd() {
        return itsmPwd;
    }

    /**
     * 
     */
    public void setItsmPwd(String itsmPwd) {
        this.itsmPwd = itsmPwd;
    }

    /**
     * 
     */
    public String getItsmEmail() {
        return itsmEmail;
    }

    /**
     * 
     */
    public void setItsmEmail(String itsmEmail) {
        this.itsmEmail = itsmEmail;
    }

    /**
     * 
     */
    public String getItsmMsgStatus() {
        return itsmMsgStatus;
    }

    /**
     * 
     */
    public void setItsmMsgStatus(String itsmMsgStatus) {
        this.itsmMsgStatus = itsmMsgStatus;
    }

    /**
     * 
     */
    public String getItsmQq() {
        return itsmQq;
    }

    /**
     * 
     */
    public void setItsmQq(String itsmQq) {
        this.itsmQq = itsmQq;
    }

    /**
     * 
     */
    public String getItsmWechat() {
        return itsmWechat;
    }

    /**
     * 
     */
    public void setItsmWechat(String itsmWechat) {
        this.itsmWechat = itsmWechat;
    }

    /**
     * 
     */
    public String getItsmName() {
        return itsmName;
    }

    /**
     * 
     */
    public void setItsmName(String itsmName) {
        this.itsmName = itsmName;
    }

    /**
     * 
     */
    public Integer getItsmLocationId() {
        return itsmLocationId;
    }

    /**
     * 
     */
    public void setItsmLocationId(Integer itsmLocationId) {
        this.itsmLocationId = itsmLocationId;
    }

    /**
     * 
     */
    public String getItsmNumber() {
        return itsmNumber;
    }

    /**
     * 
     */
    public void setItsmNumber(String itsmNumber) {
        this.itsmNumber = itsmNumber;
    }

    /**
     * 
     */
    public String getItsmStatus() {
        return itsmStatus;
    }

    /**
     * 
     */
    public void setItsmStatus(String itsmStatus) {
        this.itsmStatus = itsmStatus;
    }

    /**
     * 
     */
    public String getItsmTime() {
        return itsmTime;
    }

    /**
     * 
     */
    public void setItsmTime(String itsmTime) {
        this.itsmTime = itsmTime;
    }

    /**
     * 
     */
    public String getItsmUpPerson() {
        return itsmUpPerson;
    }

    /**
     * 
     */
    public void setItsmUpPerson(String itsmUpPerson) {
        this.itsmUpPerson = itsmUpPerson;
    }

    /**
     * 
     */
    public Integer getItsmTeamId() {
        return itsmTeamId;
    }

    /**
     * 
     */
    public void setItsmTeamId(Integer itsmTeamId) {
        this.itsmTeamId = itsmTeamId;
    }

    /**
     * 
     */
    public String getItsmLocation() {
        return itsmLocation;
    }

    /**
     * 
     */
    public void setItsmLocation(String itsmLocation) {
        this.itsmLocation = itsmLocation;
    }

    /**
     * 
     */
    public String getItsmOrganization() {
        return itsmOrganization;
    }

    /**
     * 
     */
    public void setItsmOrganization(String itsmOrganization) {
        this.itsmOrganization = itsmOrganization;
    }

    /**
     * 
     */
    public String getItsmTeam() {
        return itsmTeam;
    }

    /**
     * 
     */
    public void setItsmTeam(String itsmTeam) {
        this.itsmTeam = itsmTeam;
    }

    /**
     * 关联项数量
     */
    public Integer getItsmDevice() {
        return itsmDevice;
    }

    /**
     * 关联项数量
     */
    public void setItsmDevice(Integer itsmDevice) {
        this.itsmDevice = itsmDevice;
    }

    /**
     * 
     */
    public Integer getItsmOrganizationId() {
        return itsmOrganizationId;
    }

    /**
     * 
     */
    public void setItsmOrganizationId(Integer itsmOrganizationId) {
        this.itsmOrganizationId = itsmOrganizationId;
    }

    /**
     * 
     */
    public Integer getItsmUpPersonId() {
        return itsmUpPersonId;
    }

    /**
     * 
     */
    public void setItsmUpPersonId(Integer itsmUpPersonId) {
        this.itsmUpPersonId = itsmUpPersonId;
    }

    /**
     * 关联项数量
     */
    public String getItsmDuties() {
        return itsmDuties;
    }

    /**
     * 关联项数量
     */
    public void setItsmDuties(String itsmDuties) {
        this.itsmDuties = itsmDuties;
    }

    /**
     * 职责
     */
    public String getItsmPosition() {
        return itsmPosition;
    }

    /**
     * 职责
     */
    public void setItsmPosition(String itsmPosition) {
        this.itsmPosition = itsmPosition;
    }

    /**
     * 
     */
    public Long getItsmPersonType() {
        return itsmPersonType;
    }

    /**
     * 
     */
    public void setItsmPersonType(Long itsmPersonType) {
        this.itsmPersonType = itsmPersonType;
    }

    /**
     * 引用cmdb
     */
    public Long getItsmRefId() {
        return itsmRefId;
    }

    /**
     * 引用cmdb
     */
    public void setItsmRefId(Long itsmRefId) {
        this.itsmRefId = itsmRefId;
    }

    /**
     * 
     */
    public String getItsmImgPath() {
        return itsmImgPath;
    }

    /**
     * 
     */
    public void setItsmImgPath(String itsmImgPath) {
        this.itsmImgPath = itsmImgPath;
    }

    /**
     * 背景图片
     */
    public String getItsmImgBackground() {
        return itsmImgBackground;
    }

    /**
     * 背景图片
     */
    public void setItsmImgBackground(String itsmImgBackground) {
        this.itsmImgBackground = itsmImgBackground;
    }

    /**
     * 分配权重
     */
    public Long getWeight() {
        return weight;
    }

    /**
     * 分配权重
     */
    public void setWeight(Long weight) {
        this.weight = weight;
    }

    /**
     * 
     */
    public String getNewteams() {
        return newteams;
    }

    /**
     * 
     */
    public void setNewteams(String newteams) {
        this.newteams = newteams;
    }

    /**
     * 用户状态
     */
    public Long getUserStatus() {
        return userStatus;
    }

    /**
     * 用户状态
     */
    public void setUserStatus(Long userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * 角色id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 服务类别
     */
    public Long getItemTypeId() {
        return itemTypeId;
    }

    /**
     * 服务类别
     */
    public void setItemTypeId(Long itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    /**
     * 来源(0-ldap导入的管理用户, 1-ldap导入的门户用户, 2-非ldap用户)
     */
    public Long getSource() {
        return source;
    }

    /**
     * 来源(0-ldap导入的管理用户, 1-ldap导入的门户用户, 2-非ldap用户)
     */
    public void setSource(Long source) {
        this.source = source;
    }

    /**
     * 用户来源， 0-系统用户 1-LDAP 2-企业微信, 3-钉钉
     */
    public Byte getUserSource() {
        return userSource;
    }

    /**
     * 用户来源， 0-系统用户 1-LDAP 2-企业微信, 3-钉钉
     */
    public void setUserSource(Byte userSource) {
        this.userSource = userSource;
    }

    /**
     * 企业微信用户ID
     */
    public String getWorkWeChartUserId() {
        return workWeChartUserId;
    }

    /**
     * 企业微信用户ID
     */
    public void setWorkWeChartUserId(String workWeChartUserId) {
        this.workWeChartUserId = workWeChartUserId;
    }

    /**
     * 
     */
    public String getDingTalkUserId() {
        return dingTalkUserId;
    }

    /**
     * 
     */
    public void setDingTalkUserId(String dingTalkUserId) {
        this.dingTalkUserId = dingTalkUserId;
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
        ItsmPersonSource other = (ItsmPersonSource) that;
        return (this.getItsmId() == null ? other.getItsmId() == null : this.getItsmId().equals(other.getItsmId()))
            && (this.getWeixin() == null ? other.getWeixin() == null : this.getWeixin().equals(other.getWeixin()))
            && (this.getItsmLogin() == null ? other.getItsmLogin() == null : this.getItsmLogin().equals(other.getItsmLogin()))
            && (this.getItsmPhone() == null ? other.getItsmPhone() == null : this.getItsmPhone().equals(other.getItsmPhone()))
            && (this.getItsmProfilePath() == null ? other.getItsmProfilePath() == null : this.getItsmProfilePath().equals(other.getItsmProfilePath()))
            && (this.getItsmPwd() == null ? other.getItsmPwd() == null : this.getItsmPwd().equals(other.getItsmPwd()))
            && (this.getItsmEmail() == null ? other.getItsmEmail() == null : this.getItsmEmail().equals(other.getItsmEmail()))
            && (this.getItsmMsgStatus() == null ? other.getItsmMsgStatus() == null : this.getItsmMsgStatus().equals(other.getItsmMsgStatus()))
            && (this.getItsmQq() == null ? other.getItsmQq() == null : this.getItsmQq().equals(other.getItsmQq()))
            && (this.getItsmWechat() == null ? other.getItsmWechat() == null : this.getItsmWechat().equals(other.getItsmWechat()))
            && (this.getItsmName() == null ? other.getItsmName() == null : this.getItsmName().equals(other.getItsmName()))
            && (this.getItsmLocationId() == null ? other.getItsmLocationId() == null : this.getItsmLocationId().equals(other.getItsmLocationId()))
            && (this.getItsmNumber() == null ? other.getItsmNumber() == null : this.getItsmNumber().equals(other.getItsmNumber()))
            && (this.getItsmStatus() == null ? other.getItsmStatus() == null : this.getItsmStatus().equals(other.getItsmStatus()))
            && (this.getItsmTime() == null ? other.getItsmTime() == null : this.getItsmTime().equals(other.getItsmTime()))
            && (this.getItsmUpPerson() == null ? other.getItsmUpPerson() == null : this.getItsmUpPerson().equals(other.getItsmUpPerson()))
            && (this.getItsmTeamId() == null ? other.getItsmTeamId() == null : this.getItsmTeamId().equals(other.getItsmTeamId()))
            && (this.getItsmLocation() == null ? other.getItsmLocation() == null : this.getItsmLocation().equals(other.getItsmLocation()))
            && (this.getItsmOrganization() == null ? other.getItsmOrganization() == null : this.getItsmOrganization().equals(other.getItsmOrganization()))
            && (this.getItsmTeam() == null ? other.getItsmTeam() == null : this.getItsmTeam().equals(other.getItsmTeam()))
            && (this.getItsmDevice() == null ? other.getItsmDevice() == null : this.getItsmDevice().equals(other.getItsmDevice()))
            && (this.getItsmOrganizationId() == null ? other.getItsmOrganizationId() == null : this.getItsmOrganizationId().equals(other.getItsmOrganizationId()))
            && (this.getItsmUpPersonId() == null ? other.getItsmUpPersonId() == null : this.getItsmUpPersonId().equals(other.getItsmUpPersonId()))
            && (this.getItsmDuties() == null ? other.getItsmDuties() == null : this.getItsmDuties().equals(other.getItsmDuties()))
            && (this.getItsmPosition() == null ? other.getItsmPosition() == null : this.getItsmPosition().equals(other.getItsmPosition()))
            && (this.getItsmPersonType() == null ? other.getItsmPersonType() == null : this.getItsmPersonType().equals(other.getItsmPersonType()))
            && (this.getItsmRefId() == null ? other.getItsmRefId() == null : this.getItsmRefId().equals(other.getItsmRefId()))
            && (this.getItsmImgPath() == null ? other.getItsmImgPath() == null : this.getItsmImgPath().equals(other.getItsmImgPath()))
            && (this.getItsmImgBackground() == null ? other.getItsmImgBackground() == null : this.getItsmImgBackground().equals(other.getItsmImgBackground()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getNewteams() == null ? other.getNewteams() == null : this.getNewteams().equals(other.getNewteams()))
            && (this.getUserStatus() == null ? other.getUserStatus() == null : this.getUserStatus().equals(other.getUserStatus()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getItemTypeId() == null ? other.getItemTypeId() == null : this.getItemTypeId().equals(other.getItemTypeId()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getUserSource() == null ? other.getUserSource() == null : this.getUserSource().equals(other.getUserSource()))
            && (this.getWorkWeChartUserId() == null ? other.getWorkWeChartUserId() == null : this.getWorkWeChartUserId().equals(other.getWorkWeChartUserId()))
            && (this.getDingTalkUserId() == null ? other.getDingTalkUserId() == null : this.getDingTalkUserId().equals(other.getDingTalkUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getItsmId() == null) ? 0 : getItsmId().hashCode());
        result = prime * result + ((getWeixin() == null) ? 0 : getWeixin().hashCode());
        result = prime * result + ((getItsmLogin() == null) ? 0 : getItsmLogin().hashCode());
        result = prime * result + ((getItsmPhone() == null) ? 0 : getItsmPhone().hashCode());
        result = prime * result + ((getItsmProfilePath() == null) ? 0 : getItsmProfilePath().hashCode());
        result = prime * result + ((getItsmPwd() == null) ? 0 : getItsmPwd().hashCode());
        result = prime * result + ((getItsmEmail() == null) ? 0 : getItsmEmail().hashCode());
        result = prime * result + ((getItsmMsgStatus() == null) ? 0 : getItsmMsgStatus().hashCode());
        result = prime * result + ((getItsmQq() == null) ? 0 : getItsmQq().hashCode());
        result = prime * result + ((getItsmWechat() == null) ? 0 : getItsmWechat().hashCode());
        result = prime * result + ((getItsmName() == null) ? 0 : getItsmName().hashCode());
        result = prime * result + ((getItsmLocationId() == null) ? 0 : getItsmLocationId().hashCode());
        result = prime * result + ((getItsmNumber() == null) ? 0 : getItsmNumber().hashCode());
        result = prime * result + ((getItsmStatus() == null) ? 0 : getItsmStatus().hashCode());
        result = prime * result + ((getItsmTime() == null) ? 0 : getItsmTime().hashCode());
        result = prime * result + ((getItsmUpPerson() == null) ? 0 : getItsmUpPerson().hashCode());
        result = prime * result + ((getItsmTeamId() == null) ? 0 : getItsmTeamId().hashCode());
        result = prime * result + ((getItsmLocation() == null) ? 0 : getItsmLocation().hashCode());
        result = prime * result + ((getItsmOrganization() == null) ? 0 : getItsmOrganization().hashCode());
        result = prime * result + ((getItsmTeam() == null) ? 0 : getItsmTeam().hashCode());
        result = prime * result + ((getItsmDevice() == null) ? 0 : getItsmDevice().hashCode());
        result = prime * result + ((getItsmOrganizationId() == null) ? 0 : getItsmOrganizationId().hashCode());
        result = prime * result + ((getItsmUpPersonId() == null) ? 0 : getItsmUpPersonId().hashCode());
        result = prime * result + ((getItsmDuties() == null) ? 0 : getItsmDuties().hashCode());
        result = prime * result + ((getItsmPosition() == null) ? 0 : getItsmPosition().hashCode());
        result = prime * result + ((getItsmPersonType() == null) ? 0 : getItsmPersonType().hashCode());
        result = prime * result + ((getItsmRefId() == null) ? 0 : getItsmRefId().hashCode());
        result = prime * result + ((getItsmImgPath() == null) ? 0 : getItsmImgPath().hashCode());
        result = prime * result + ((getItsmImgBackground() == null) ? 0 : getItsmImgBackground().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getNewteams() == null) ? 0 : getNewteams().hashCode());
        result = prime * result + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getItemTypeId() == null) ? 0 : getItemTypeId().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getUserSource() == null) ? 0 : getUserSource().hashCode());
        result = prime * result + ((getWorkWeChartUserId() == null) ? 0 : getWorkWeChartUserId().hashCode());
        result = prime * result + ((getDingTalkUserId() == null) ? 0 : getDingTalkUserId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itsmId=").append(itsmId);
        sb.append(", weixin=").append(weixin);
        sb.append(", itsmLogin=").append(itsmLogin);
        sb.append(", itsmPhone=").append(itsmPhone);
        sb.append(", itsmProfilePath=").append(itsmProfilePath);
        sb.append(", itsmPwd=").append(itsmPwd);
        sb.append(", itsmEmail=").append(itsmEmail);
        sb.append(", itsmMsgStatus=").append(itsmMsgStatus);
        sb.append(", itsmQq=").append(itsmQq);
        sb.append(", itsmWechat=").append(itsmWechat);
        sb.append(", itsmName=").append(itsmName);
        sb.append(", itsmLocationId=").append(itsmLocationId);
        sb.append(", itsmNumber=").append(itsmNumber);
        sb.append(", itsmStatus=").append(itsmStatus);
        sb.append(", itsmTime=").append(itsmTime);
        sb.append(", itsmUpPerson=").append(itsmUpPerson);
        sb.append(", itsmTeamId=").append(itsmTeamId);
        sb.append(", itsmLocation=").append(itsmLocation);
        sb.append(", itsmOrganization=").append(itsmOrganization);
        sb.append(", itsmTeam=").append(itsmTeam);
        sb.append(", itsmDevice=").append(itsmDevice);
        sb.append(", itsmOrganizationId=").append(itsmOrganizationId);
        sb.append(", itsmUpPersonId=").append(itsmUpPersonId);
        sb.append(", itsmDuties=").append(itsmDuties);
        sb.append(", itsmPosition=").append(itsmPosition);
        sb.append(", itsmPersonType=").append(itsmPersonType);
        sb.append(", itsmRefId=").append(itsmRefId);
        sb.append(", itsmImgPath=").append(itsmImgPath);
        sb.append(", itsmImgBackground=").append(itsmImgBackground);
        sb.append(", weight=").append(weight);
        sb.append(", newteams=").append(newteams);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", roleId=").append(roleId);
        sb.append(", itemTypeId=").append(itemTypeId);
        sb.append(", source=").append(source);
        sb.append(", userSource=").append(userSource);
        sb.append(", workWeChartUserId=").append(workWeChartUserId);
        sb.append(", dingTalkUserId=").append(dingTalkUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}