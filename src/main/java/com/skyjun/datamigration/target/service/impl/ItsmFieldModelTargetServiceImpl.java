package com.skyjun.datamigration.target.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skyjun.datamigration.target.entity.ItsmFieldModelTarget;
import com.skyjun.datamigration.target.service.ItsmFieldModelTargetService;
import com.skyjun.datamigration.target.mapper.ItsmFieldModelTargetMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyajun
* @description 针对表【itsm_field_model】的数据库操作Service实现
* @createDate 2022-08-12 16:31:48
*/
@Service
@DS("target")
public class ItsmFieldModelTargetServiceImpl extends ServiceImpl<ItsmFieldModelTargetMapper, ItsmFieldModelTarget>
implements ItsmFieldModelTargetService {

}
