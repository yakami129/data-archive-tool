package com.skyjun.datamigration.source.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skyjun.datamigration.source.entity.ItsmFieldModelSource;
import com.skyjun.datamigration.source.service.ItsmFieldModelSourceService;
import com.skyjun.datamigration.source.mapper.ItsmFieldModelSourceMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyajun
* @description 针对表【itsm_field_model】的数据库操作Service实现
* @createDate 2022-08-12 16:39:37
*/
@Service
@DS("source")
public class ItsmFieldModelSourceServiceImpl extends ServiceImpl<ItsmFieldModelSourceMapper, ItsmFieldModelSource>
    implements ItsmFieldModelSourceService {

}




