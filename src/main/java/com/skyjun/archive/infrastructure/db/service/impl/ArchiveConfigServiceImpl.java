package com.skyjun.archive.infrastructure.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skyjun.archive.infrastructure.db.entity.ArchiveConfigEntity;
import com.skyjun.archive.infrastructure.db.service.ArchiveConfigService;
import com.skyjun.archive.infrastructure.db.mapper.ArchiveConfigMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyajun
* @description 针对表【archive_config(归档配置表)】的数据库操作Service实现
* @createDate 2022-08-24 18:00:00
*/
@Service
public class ArchiveConfigServiceImpl extends ServiceImpl<ArchiveConfigMapper, ArchiveConfigEntity>
    implements ArchiveConfigService{

}




