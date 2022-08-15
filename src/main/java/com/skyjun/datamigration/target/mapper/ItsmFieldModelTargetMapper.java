package com.skyjun.datamigration.target.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.skyjun.datamigration.core.CustomBaseMapper;
import com.skyjun.datamigration.target.entity.ItsmFieldModelTarget;

/**
* @author zhangyajun
* @description 针对表【itsm_field_model】的数据库操作Mapper
* @createDate 2022-08-12 16:31:48
* @Entity com.skyjun.datamigration.target.entity.ItsmFieldModelTarget
*/
@DS("target")
public interface ItsmFieldModelTargetMapper extends CustomBaseMapper<ItsmFieldModelTarget> {


}
