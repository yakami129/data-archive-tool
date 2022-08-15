package com.skyjun.datamigration.target.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skyjun.datamigration.target.entity.ItsmServiceWorkEssentialTarget;
import com.skyjun.datamigration.target.service.ItsmServiceWorkEssentialTargetService;
import com.skyjun.datamigration.target.mapper.ItsmServiceWorkEssentialTargetMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyajun
* @description 针对表【itsm_service_work_essential】的数据库操作Service实现
* @createDate 2022-08-12 16:31:48
*/
@Service
@DS("target")
public class ItsmServiceWorkEssentialTargetServiceImpl extends ServiceImpl<ItsmServiceWorkEssentialTargetMapper, ItsmServiceWorkEssentialTarget>
implements ItsmServiceWorkEssentialTargetService {

}
