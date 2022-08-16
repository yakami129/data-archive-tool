package com.skyjun.datamigration.actuator.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skyjun.datamigration.actuator.AbstractDataEntityActuator;
import com.skyjun.datamigration.core.CustomBaseMapper;
import com.skyjun.datamigration.source.entity.ItsmProcessmodelStaffScopeSource;
import com.skyjun.datamigration.source.service.ItsmProcessmodelStaffScopeSourceService;
import com.skyjun.datamigration.target.entity.ItsmProcessmodelStaffScopeTarget;
import com.skyjun.datamigration.target.mapper.ItsmProcessmodelStaffScopeTargetMapper;

/**
 * Created by alan on 2022/8/16.
 */
//@Component
public class ItsmProcessModelStaffScopeEntityActuatorImpl extends AbstractDataEntityActuator<ItsmProcessmodelStaffScopeSource, ItsmProcessmodelStaffScopeTarget> {

    private ItsmProcessmodelStaffScopeSourceService itsmProcessmodelStaffScopeSourceService;
    private ItsmProcessmodelStaffScopeTargetMapper itsmProcessmodelStaffScopeTargetMapper;

    public ItsmProcessModelStaffScopeEntityActuatorImpl(ItsmProcessmodelStaffScopeSourceService itsmProcessmodelStaffScopeSourceService, ItsmProcessmodelStaffScopeTargetMapper itsmProcessmodelStaffScopeTargetMapper) {
        this.itsmProcessmodelStaffScopeSourceService = itsmProcessmodelStaffScopeSourceService;
        this.itsmProcessmodelStaffScopeTargetMapper = itsmProcessmodelStaffScopeTargetMapper;
    }

    @Override
    protected String getTableName() {
        return "itsm_processmodel_staff_scope";
    }

    @Override
    protected Class<ItsmProcessmodelStaffScopeTarget> getTargetClass() {
        return ItsmProcessmodelStaffScopeTarget.class;
    }

    @Override
    public IService<ItsmProcessmodelStaffScopeSource> getSourceService() {
        return itsmProcessmodelStaffScopeSourceService;
    }

    @Override
    public CustomBaseMapper<ItsmProcessmodelStaffScopeTarget> getTargetMapper() {
        return itsmProcessmodelStaffScopeTargetMapper;
    }
}
