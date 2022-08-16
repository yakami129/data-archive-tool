package com.skyjun.datamigration.source.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skyjun.datamigration.source.entity.ItsmPersonSource;
import com.skyjun.datamigration.source.mapper.ItsmPersonSourceMapper;
import com.skyjun.datamigration.source.service.ItsmPersonSourceService;
import org.springframework.stereotype.Service;

/**
 * @author zhangyajun
 * @description 针对表【itsm_person】的数据库操作Service实现
 * @createDate 2022-08-16 14:33:29
 */
@Service
@DS("source")
public class ItsmPersonSourceServiceImpl extends ServiceImpl<ItsmPersonSourceMapper, ItsmPersonSource>
        implements ItsmPersonSourceService {

}




