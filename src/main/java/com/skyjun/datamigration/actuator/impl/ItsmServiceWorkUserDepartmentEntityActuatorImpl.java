package com.skyjun.datamigration.actuator.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skyjun.datamigration.actuator.AbstractDataEntityActuator;
import com.skyjun.datamigration.core.CustomBaseMapper;
import com.skyjun.datamigration.source.entity.ItsmServiceWorkUserDepartmentSource;
import com.skyjun.datamigration.source.service.ItsmServiceWorkUserDepartmentSourceService;
import com.skyjun.datamigration.target.entity.ItsmServiceWorkUserDepartmentTarget;
import com.skyjun.datamigration.target.mapper.ItsmServiceWorkUserDepartmentTargetMapper;
import org.springframework.stereotype.Component;

/**
 * Created by alan on 2022/8/16.
 */
@Component
public class ItsmServiceWorkUserDepartmentEntityActuatorImpl extends AbstractDataEntityActuator<ItsmServiceWorkUserDepartmentSource, ItsmServiceWorkUserDepartmentTarget> {

    private ItsmServiceWorkUserDepartmentSourceService itsmServiceWorkUserDepartmentSourceService;
    private ItsmServiceWorkUserDepartmentTargetMapper itsmServiceWorkUserDepartmentTargetMapper;

    public ItsmServiceWorkUserDepartmentEntityActuatorImpl(ItsmServiceWorkUserDepartmentSourceService itsmServiceWorkUserDepartmentSourceService, ItsmServiceWorkUserDepartmentTargetMapper itsmServiceWorkUserDepartmentTargetMapper) {
        this.itsmServiceWorkUserDepartmentSourceService = itsmServiceWorkUserDepartmentSourceService;
        this.itsmServiceWorkUserDepartmentTargetMapper = itsmServiceWorkUserDepartmentTargetMapper;
    }

    @Override
    protected String getTableName() {
        return "itsm_service_work_user_department";
    }

    @Override
    protected Class<ItsmServiceWorkUserDepartmentTarget> getTargetClass() {
        return ItsmServiceWorkUserDepartmentTarget.class;
    }

    @Override
    public IService<ItsmServiceWorkUserDepartmentSource> getSourceService() {
        return itsmServiceWorkUserDepartmentSourceService;
    }

    @Override
    public CustomBaseMapper<ItsmServiceWorkUserDepartmentTarget> getTargetMapper() {
        return itsmServiceWorkUserDepartmentTargetMapper;
    }
}
