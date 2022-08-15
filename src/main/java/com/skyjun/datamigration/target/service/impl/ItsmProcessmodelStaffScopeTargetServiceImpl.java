package com.skyjun.datamigration.target.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skyjun.datamigration.target.entity.ItsmProcessmodelStaffScopeTarget;
import com.skyjun.datamigration.target.service.ItsmProcessmodelStaffScopeTargetService;
import com.skyjun.datamigration.target.mapper.ItsmProcessmodelStaffScopeTargetMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyajun
* @description 针对表【itsm_processmodel_staff_scope】的数据库操作Service实现
* @createDate 2022-08-12 16:31:48
*/
@Service
@DS("target")
public class ItsmProcessmodelStaffScopeTargetServiceImpl extends ServiceImpl<ItsmProcessmodelStaffScopeTargetMapper, ItsmProcessmodelStaffScopeTarget>
implements ItsmProcessmodelStaffScopeTargetService {

}
