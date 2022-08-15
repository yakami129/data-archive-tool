package com.skyjun.datamigration.actuator.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skyjun.datamigration.actuator.AbstractDataEntityActuator;
import com.skyjun.datamigration.core.CustomBaseMapper;
import com.skyjun.datamigration.source.entity.ItsmFieldModelSource;
import com.skyjun.datamigration.source.service.ItsmFieldModelSourceService;
import com.skyjun.datamigration.target.entity.ItsmFieldModelTarget;
import com.skyjun.datamigration.target.mapper.ItsmFieldModelTargetMapper;
import com.skyjun.datamigration.target.service.ItsmFieldModelTargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by alan on 2022/8/15.
 */
@Component
public class ItsmFieldModelEntityActuatorImpl extends AbstractDataEntityActuator<ItsmFieldModelSource, ItsmFieldModelTarget> {

    @Autowired
    protected ItsmFieldModelSourceService itsmFieldModelSourceService;

    @Autowired
    protected ItsmFieldModelTargetMapper itsmFieldModelTargetMapper;

    @Override
    protected String getTableName() {
        return "itsm_field_model";
    }

    @Override
    protected Class<ItsmFieldModelTarget> getTargetClass() {
        return ItsmFieldModelTarget.class;
    }

    @Override
    public IService<ItsmFieldModelSource> getSourceService() {
        return itsmFieldModelSourceService;
    }

    @Override
    public CustomBaseMapper<ItsmFieldModelTarget> getTargetMapper() {
        return itsmFieldModelTargetMapper;
    }
}
