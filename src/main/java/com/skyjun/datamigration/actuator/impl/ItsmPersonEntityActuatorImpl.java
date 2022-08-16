package com.skyjun.datamigration.actuator.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skyjun.datamigration.actuator.AbstractDataEntityActuator;
import com.skyjun.datamigration.common.PrimarykeyConstants;
import com.skyjun.datamigration.core.CustomBaseMapper;
import com.skyjun.datamigration.source.entity.ItsmPersonSource;
import com.skyjun.datamigration.source.service.ItsmPersonSourceService;
import com.skyjun.datamigration.target.entity.ItsmPersonTarget;
import com.skyjun.datamigration.target.mapper.ItsmPersonTargetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by alan on 2022/8/16.
 */
//@Component
public class ItsmPersonEntityActuatorImpl extends AbstractDataEntityActuator<ItsmPersonSource, ItsmPersonTarget> {

    @Autowired
    private ItsmPersonSourceService itsmPersonSourceService;
    @Autowired
    private ItsmPersonTargetMapper itsmPersonTargetMapper;

    @Override
    protected String getTableName() {
        return "itsm_person";
    }

    @Override
    protected Class<ItsmPersonTarget> getTargetClass() {
        return ItsmPersonTarget.class;
    }

    @Override
    public IService<ItsmPersonSource> getSourceService() {
        return itsmPersonSourceService;
    }

    @Override
    public CustomBaseMapper<ItsmPersonTarget> getTargetMapper() {
        return itsmPersonTargetMapper;
    }

    @Override
    protected ItsmPersonTarget convert(ItsmPersonSource itsmPersonSource, Class<ItsmPersonTarget> clazz) {
        ItsmPersonTarget convert = super.convert(itsmPersonSource, clazz);
        convert.setItsmId(PrimarykeyConstants.generatePrimarykey(convert.getItsmId()));
        return convert;
    }
}
