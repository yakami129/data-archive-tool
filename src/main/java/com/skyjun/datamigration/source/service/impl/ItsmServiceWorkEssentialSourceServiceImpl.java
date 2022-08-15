package com.skyjun.datamigration.source.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skyjun.datamigration.source.entity.ItsmServiceWorkEssentialSource;
import com.skyjun.datamigration.source.service.ItsmServiceWorkEssentialSourceService;
import com.skyjun.datamigration.source.mapper.ItsmServiceWorkEssentialSourceMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyajun
* @description 针对表【itsm_service_work_essential】的数据库操作Service实现
* @createDate 2022-08-12 16:39:37
*/
@Service
@DS("source")
public class ItsmServiceWorkEssentialSourceServiceImpl extends ServiceImpl<ItsmServiceWorkEssentialSourceMapper, ItsmServiceWorkEssentialSource>
    implements ItsmServiceWorkEssentialSourceService {

}




