package com.skyjun.archive.infrastructure.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 归档配置表
 *
 * @TableName archive_config
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "archive_config")
public class ArchiveConfigEntity implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 源服务器
     */
    private String sourceHost;

    /**
     * 源服务器端口
     */
    private Integer sourcePort;

    /**
     * 源数据库schema
     */
    private String sourceDb;

    /**
     * 源数据库表
     */
    private String sourceTable;

    /**
     * 目标服务器
     */
    private String destHost;

    /**
     * 目标服务器端口
     */
    private Integer destPort;

    /**
     * 目标数据库schema
     */
    private String destDb;

    /**
     * 目标数据库表
     */
    private String destTable;

    /**
     * 归档模式
     *
     * @see com.skyjun.archive.enums.ArchiveModeEnum
     */
    private String archiveMode;

    /**
     * 字符集
     */
    private String charset;

    /**
     * 归档条件
     */
    private String archiveCondition;

    /**
     * 执行时间窗口，如：00:00-06:00,22:00-24:00
     */
    private String execTimeWindow;

    /**
     * 优化级，数值越高，在执行时间窗口的有多个任务时，优先执行
     */
    private Byte priority;

    /**
     * 创建时间
     */
    private Date sysCtime;

    /**
     * 修改时间
     */
    private Date sysUtime;

    /**
     * 是否已删除
     */
    private Byte isDeleted;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 扩展命令
     */
    private String extensionCmd;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}