# 工程简介

data-archive-tool 是一个基于pt-archiver之上，封装的通用数据归档工具。

### data-archive-tool支持以下几种模式归档数据：

- ARCHIVE：归档后，删除原数据库的数据
- DELETE： 只删除原数据库的数据，不进行归档
- ARCHIVE_TO_FILE：将数据归档到文件中

### data-archive-tool的架构图如下：

![数据归档组件架构](img/数据归档组件设计.drawio.png)

- 归档任务生成器：定时根据归档配置，生成相应的归档任务， 根据归档配置和pt-archiver命令模版，动态生成shell命令
- 归档任务执行器：定时执行归档任务，并且记录执行日志和执行状态
- pt-archiver： pt-archiver工具包，用于执行归档操作

# 延伸阅读

### 运行环境：

- JDK8
- linux（CentOS 7）
- pt-archiver
- perl-tool

### 如何安装data-archive-tool？

#### （1）下载Percona Toolkit:

[Percona-Toolkit-3.4.0.rpm](https://www.notion.so/Linux-pt-archiver-a6b5450661bd4d87aea2ce209a7f5d2d#c585497698cb422c85d7cd1163c1fd4b)

#### （2）安装前置依赖环境：

```
yum install -y perl-DBI perl-DBD-MySQL perl-Digest-MD5 perl-IO-Socket-SSL perl-TermReadKey
```

#### （3）安装Percona Toolkit:

```
rpm -ivh percona-toolkit-3.4.0-3.el7.x86_64.rpm
```

#### （4）下载源码后使用Maven编译器进行编译：

```
mvn clean package
```

data-archive-tool/target中可以看到可运行的jar

### 如何使用data-archive-tool?

