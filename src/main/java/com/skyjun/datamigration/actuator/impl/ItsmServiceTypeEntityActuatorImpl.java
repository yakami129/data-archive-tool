package com.skyjun.datamigration.actuator.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skyjun.datamigration.actuator.AbstractDataEntityActuator;
import com.skyjun.datamigration.core.CustomBaseMapper;
import com.skyjun.datamigration.source.entity.ItsmServiceTypeSource;
import com.skyjun.datamigration.source.service.ItsmServiceTypeSourceService;
import com.skyjun.datamigration.target.entity.ItsmServiceTypeTarget;
import com.skyjun.datamigration.target.mapper.ItsmServiceTypeTargetMapper;
import org.springframework.stereotype.Component;

/**
 * Created by alan on 2022/8/16.
 */
@Component
public class ItsmServiceTypeEntityActuatorImpl extends AbstractDataEntityActuator<ItsmServiceTypeSource, ItsmServiceTypeTarget> {

    private ItsmServiceTypeSourceService itsmServiceTypeSourceService;
    private ItsmServiceTypeTargetMapper itsmServiceTypeTargetMapper;

    public ItsmServiceTypeEntityActuatorImpl(ItsmServiceTypeSourceService itsmServiceTypeSourceService, ItsmServiceTypeTargetMapper itsmServiceTypeTargetMapper) {
        this.itsmServiceTypeSourceService = itsmServiceTypeSourceService;
        this.itsmServiceTypeTargetMapper = itsmServiceTypeTargetMapper;
    }

    @Override
    protected String getTableName() {
        return "itsm_service_type";
    }

    @Override
    protected Class<ItsmServiceTypeTarget> getTargetClass() {
        return ItsmServiceTypeTarget.class;
    }

    @Override
    public IService<ItsmServiceTypeSource> getSourceService() {
        return itsmServiceTypeSourceService;
    }

    @Override
    public CustomBaseMapper<ItsmServiceTypeTarget> getTargetMapper() {
        return itsmServiceTypeTargetMapper;
    }
}
