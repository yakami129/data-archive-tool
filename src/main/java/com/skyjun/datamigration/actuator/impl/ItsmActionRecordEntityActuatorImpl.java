package com.skyjun.datamigration.actuator.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skyjun.datamigration.actuator.AbstractDataEntityActuator;
import com.skyjun.datamigration.core.CustomBaseMapper;
import com.skyjun.datamigration.source.entity.ItsmActionRecordSource;
import com.skyjun.datamigration.source.service.ItsmActionRecordSourceService;
import com.skyjun.datamigration.target.entity.ItsmActionRecordTarget;
import com.skyjun.datamigration.target.mapper.ItsmActionRecordTargetMapper;
import org.springframework.stereotype.Component;

/**
 * Created by alan on 2022/8/16.
 */
@Component
public class ItsmActionRecordEntityActuatorImpl extends AbstractDataEntityActuator<ItsmActionRecordSource, ItsmActionRecordTarget> {

    private ItsmActionRecordSourceService itsmActionRecordSourceService;
    private ItsmActionRecordTargetMapper itsmActionRecordTargetMapper;

    public ItsmActionRecordEntityActuatorImpl(ItsmActionRecordSourceService itsmActionRecordSourceService, ItsmActionRecordTargetMapper itsmActionRecordTargetMapper) {
        this.itsmActionRecordSourceService = itsmActionRecordSourceService;
        this.itsmActionRecordTargetMapper = itsmActionRecordTargetMapper;
    }

    @Override
    protected String getTableName() {
        return "itsm_action_record";
    }

    @Override
    protected Class<ItsmActionRecordTarget> getTargetClass() {
        return ItsmActionRecordTarget.class;
    }

    @Override
    public IService<ItsmActionRecordSource> getSourceService() {
        return itsmActionRecordSourceService;
    }

    @Override
    public CustomBaseMapper<ItsmActionRecordTarget> getTargetMapper() {
        return itsmActionRecordTargetMapper;
    }

    @Override
    protected ItsmActionRecordTarget convert(ItsmActionRecordSource itsmActionRecordSource, Class<ItsmActionRecordTarget> clazz) {
        ItsmActionRecordTarget convert = super.convert(itsmActionRecordSource, clazz);
        convert.setSource(false);
        return convert;
    }
}
