/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.3.15
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : 192.168.3.15:3306
 Source Schema         : mysql_archiver

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 26/08/2022 09:52:50
*/

CREATE DATABASE IF NOT EXISTS `mysql_archiver` DEFAULT CHARACTER SET utf8 collate utf8_unicode_ci;

USE `mysql_archiver`;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for archive_config
-- ----------------------------
DROP TABLE IF EXISTS `archive_config`;
CREATE TABLE `archive_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `source_host` varchar(64) NOT NULL COMMENT '源服务器',
  `source_port` int(11) NOT NULL COMMENT '源服务器端口',
  `source_db` varchar(64) NOT NULL COMMENT '源数据库schema',
  `source_table` varchar(128) NOT NULL COMMENT '源数据库表',
  `dest_host` varchar(64) NOT NULL COMMENT '目标服务器',
  `dest_port` int(11) NOT NULL DEFAULT '3306' COMMENT '目标服务器端口',
  `dest_db` varchar(64) NOT NULL DEFAULT '' COMMENT '目标数据库schema',
  `dest_table` varchar(128) NOT NULL DEFAULT '' COMMENT '目标数据库表',
  `archive_mode` varchar(20) NOT NULL DEFAULT 'ARCHIVE' COMMENT '归档模式：ARCHIVE（归档）,DELETE(只删除不归档)，ARCHIVE_TO_FILE(归档到文件)',
  `charset` varchar(20) NOT NULL DEFAULT 'UTF8' COMMENT '字符集',
  `archive_condition` varchar(255) NOT NULL DEFAULT '' COMMENT '归档条件',
  `exec_time_window_cron` varchar(30) NOT NULL DEFAULT '0 0 2 1 * ? *' COMMENT '执行时间窗口，如：0 0 2 1 * ? *,表示在每月的1日的凌晨2点执行任务\n\n',
  `extension_cmd` varchar(255) DEFAULT '' COMMENT '归档扩展命令',
  `priority` tinyint(4) DEFAULT '1' COMMENT '优化级，数值越高，在执行时间窗口的有多个任务时，优先执行',
  `sys_ctime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `sys_utime` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_enable` tinyint(4) DEFAULT '0' COMMENT '是否开启：1:开启，0:关闭',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`id`),
  KEY `idx_source_db_source_table` (`source_db`,`source_table`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='归档配置表';

-- ----------------------------
-- Table structure for archive_tasks
-- ----------------------------
DROP TABLE IF EXISTS `archive_tasks`;
CREATE TABLE `archive_tasks` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `source_host` varchar(64) NOT NULL COMMENT '源服务器',
  `source_port` int(11) NOT NULL COMMENT '源服务器端口',
  `source_db` varchar(64) NOT NULL COMMENT '源数据库schema',
  `source_table` varchar(128) NOT NULL COMMENT '源数据库表',
  `dest_host` varchar(64) NOT NULL COMMENT '目标服务器',
  `dest_port` int(11) NOT NULL COMMENT '目标服务器端口',
  `dest_db` varchar(64) DEFAULT NULL COMMENT '目标数据库schema',
  `dest_table` varchar(128) DEFAULT NULL COMMENT '目标数据库表',
  `archive_mode` varchar(20) DEFAULT 'archive' COMMENT '归档模式：ARCHIVE（归档）,DELETE(只删除不归档)，ARCHIVE_TO_FILE(归档到文件)',
  `priority` tinyint(4) DEFAULT '1' COMMENT '优化级，数值越高，在执行时间窗口的有多个任务时，优先执行',
  `exec_status` varchar(100) DEFAULT 'INITIAL' COMMENT '运行的状态，INITIAL:初始状态，RUNNING:执行中，ERROR:执行失败，WAIT_TIMEOUT:等待超时，SUCCESS:执行成功',
  `exec_start` datetime DEFAULT NULL COMMENT '归档开始时间',
  `exec_end` datetime DEFAULT NULL COMMENT '归档结束时间',
  `exec_seconds` int(11) DEFAULT NULL COMMENT '执行时间（秒）',
  `archive_cmd` varchar(2000) DEFAULT NULL COMMENT '归档命令',
  `exec_log` longtext COMMENT '执行日志',
  `sys_utime` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `idx_source_db_table` (`source_db`,`source_table`,`exec_start`),
  KEY `idx_source_host_port` (`source_host`,`source_port`,`exec_start`)
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=utf8 COMMENT='归档任务表';

SET FOREIGN_KEY_CHECKS = 1;
