package com.skyjun.datamigration.target.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.skyjun.datamigration.core.CustomBaseMapper;
import com.skyjun.datamigration.target.entity.ItsmFieldDataTarget;

/**
 * @author zhangyajun
 * @description 针对表【itsm_field_data】的数据库操作Mapper
 * @createDate 2022-08-12 16:31:48
 * @Entity com.skyjun.datamigration.target.entity.ItsmFieldDataTarget
 */
@DS("target")
public interface ItsmFieldDataTargetMapper extends CustomBaseMapper<ItsmFieldDataTarget> {


}
