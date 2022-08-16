package com.skyjun.datamigration.actuator.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skyjun.datamigration.actuator.AbstractDataEntityActuator;
import com.skyjun.datamigration.common.PrimarykeyConstants;
import com.skyjun.datamigration.core.CustomBaseMapper;
import com.skyjun.datamigration.source.entity.ItsmTaskSource;
import com.skyjun.datamigration.source.service.ItsmTaskSourceService;
import com.skyjun.datamigration.target.entity.ItsmTaskTarget;
import com.skyjun.datamigration.target.mapper.ItsmTaskTargetMapper;
import org.springframework.stereotype.Component;

/**
 * Created by alan on 2022/8/16.
 */
@Component
public class ItsmTaskEntityActuatorImpl extends AbstractDataEntityActuator<ItsmTaskSource, ItsmTaskTarget> {

    private ItsmTaskSourceService itsmTaskSourceService;
    private ItsmTaskTargetMapper itsmTaskTargetMapper;

    public ItsmTaskEntityActuatorImpl(ItsmTaskSourceService itsmTaskSourceService, ItsmTaskTargetMapper itsmTaskTargetMapper) {
        this.itsmTaskSourceService = itsmTaskSourceService;
        this.itsmTaskTargetMapper = itsmTaskTargetMapper;
    }

    @Override
    protected String getTableName() {
        return "itsm_task";
    }

    @Override
    protected Class<ItsmTaskTarget> getTargetClass() {
        return ItsmTaskTarget.class;
    }

    @Override
    public IService<ItsmTaskSource> getSourceService() {
        return itsmTaskSourceService;
    }

    @Override
    public CustomBaseMapper<ItsmTaskTarget> getTargetMapper() {
        return itsmTaskTargetMapper;
    }

    @Override
    protected ItsmTaskTarget convert(ItsmTaskSource itsmTaskSource, Class<ItsmTaskTarget> clazz) {
        ItsmTaskTarget convert = super.convert(itsmTaskSource, clazz);
        convert.setId(PrimarykeyConstants.generatePrimarykey(convert.getId()));
        return convert;
    }
}
