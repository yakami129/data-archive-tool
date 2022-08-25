package com.skyjun.archive.infrastructure.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skyjun.archive.infrastructure.db.entity.ArchiveTasksEntity;
import com.skyjun.archive.infrastructure.db.service.ArchiveTasksService;
import com.skyjun.archive.infrastructure.db.mapper.ArchiveTasksMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyajun
* @description 针对表【archive_tasks(归档任务表)】的数据库操作Service实现
* @createDate 2022-08-24 18:01:07
*/
@Service
public class ArchiveTasksServiceImpl extends ServiceImpl<ArchiveTasksMapper, ArchiveTasksEntity>
    implements ArchiveTasksService{

}




