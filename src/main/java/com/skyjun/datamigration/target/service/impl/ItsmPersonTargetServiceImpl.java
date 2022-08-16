package com.skyjun.datamigration.target.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skyjun.datamigration.target.entity.ItsmPersonTarget;
import com.skyjun.datamigration.target.mapper.ItsmPersonTargetMapper;
import com.skyjun.datamigration.target.service.ItsmPersonTargetService;
import org.springframework.stereotype.Service;

/**
 * @author zhangyajun
 * @description 针对表【itsm_person】的数据库操作Service实现
 * @createDate 2022-08-16 14:36:25
 */
@Service
@DS("target")
public class ItsmPersonTargetServiceImpl extends ServiceImpl<ItsmPersonTargetMapper, ItsmPersonTarget>
        implements ItsmPersonTargetService {

}




