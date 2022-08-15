package com.skyjun.datamigration.source.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skyjun.datamigration.source.entity.ItsmServiceItemsSource;
import com.skyjun.datamigration.source.service.ItsmServiceItemsSourceService;
import com.skyjun.datamigration.source.mapper.ItsmServiceItemsSourceMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyajun
* @description 针对表【itsm_service_items】的数据库操作Service实现
* @createDate 2022-08-12 16:39:37
*/
@Service
@DS("source")
public class ItsmServiceItemsSourceServiceImpl extends ServiceImpl<ItsmServiceItemsSourceMapper, ItsmServiceItemsSource>
    implements ItsmServiceItemsSourceService {

}




