package com.skyjun.datamigration.target.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.skyjun.datamigration.target.entity.ItsmServiceWorkListTarget;
import com.skyjun.datamigration.core.CustomBaseMapper;

/**
* @author zhangyajun
* @description 针对表【itsm_service_work_list】的数据库操作Mapper
* @createDate 2022-08-12 16:31:48
* @Entity com.skyjun.datamigration.target.entity.ItsmServiceWorkListTarget
*/
@DS("target")
public interface ItsmServiceWorkListTargetMapper extends CustomBaseMapper<ItsmServiceWorkListTarget> {


}
