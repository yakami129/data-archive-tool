package com.skyjun.datamigration.actuator.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skyjun.datamigration.actuator.AbstractDataEntityActuator;
import com.skyjun.datamigration.core.CustomBaseMapper;
import com.skyjun.datamigration.source.entity.ItsmFieldSource;
import com.skyjun.datamigration.source.service.ItsmFieldSourceService;
import com.skyjun.datamigration.target.entity.ItsmFieldTarget;
import com.skyjun.datamigration.target.mapper.ItsmFieldTargetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by alan on 2022/8/15.
 */
@Component
public class ItsmFieldEntityActuatorImpl extends AbstractDataEntityActuator<ItsmFieldSource, ItsmFieldTarget> {

    @Autowired
    protected ItsmFieldSourceService itsmFieldSourceService;

    @Autowired
    protected ItsmFieldTargetMapper itsmFieldTargetMapper;

    @Override
    protected String getTableName() {
        return "itsm_field";
    }

    @Override
    protected Class<ItsmFieldTarget> getTargetClass() {
        return ItsmFieldTarget.class;
    }

    @Override
    public IService<ItsmFieldSource> getSourceService() {
        return itsmFieldSourceService;
    }

    @Override
    public CustomBaseMapper<ItsmFieldTarget> getTargetMapper() {
        return itsmFieldTargetMapper;
    }

    @Override
    protected ItsmFieldTarget convert(ItsmFieldSource itsmFieldSource, Class<ItsmFieldTarget> clazz) {
        ItsmFieldTarget convert = super.convert(itsmFieldSource, clazz);
        convert.setColIndex(1);
        convert.setRowIndex(convert.getId().intValue());
        return convert;
    }
}
