package com.skyjun.datamigration.actuator.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skyjun.datamigration.actuator.AbstractDataEntityActuator;
import com.skyjun.datamigration.common.PrimarykeyConstants;
import com.skyjun.datamigration.core.CustomBaseMapper;
import com.skyjun.datamigration.source.entity.ItsmServiceWorkEssentialSource;
import com.skyjun.datamigration.source.service.ItsmServiceWorkEssentialSourceService;
import com.skyjun.datamigration.target.entity.ItsmServiceWorkEssentialTarget;
import com.skyjun.datamigration.target.mapper.ItsmServiceWorkEssentialTargetMapper;
import org.springframework.stereotype.Component;

/**
 * Created by alan on 2022/8/16.
 */
@Component
public class ItsmServiceWorkEssentialEntityActuatorImpl extends AbstractDataEntityActuator<ItsmServiceWorkEssentialSource, ItsmServiceWorkEssentialTarget> {

    private ItsmServiceWorkEssentialSourceService itsmServiceWorkEssentialSourceService;
    private ItsmServiceWorkEssentialTargetMapper itsmServiceWorkEssentialTargetMapper;

    public ItsmServiceWorkEssentialEntityActuatorImpl(ItsmServiceWorkEssentialSourceService itsmServiceWorkEssentialSourceService, ItsmServiceWorkEssentialTargetMapper itsmServiceWorkEssentialTargetMapper) {
        this.itsmServiceWorkEssentialSourceService = itsmServiceWorkEssentialSourceService;
        this.itsmServiceWorkEssentialTargetMapper = itsmServiceWorkEssentialTargetMapper;
    }

    @Override
    protected String getTableName() {
        return "itsm_service_work_essential";
    }

    @Override
    protected Class<ItsmServiceWorkEssentialTarget> getTargetClass() {
        return ItsmServiceWorkEssentialTarget.class;
    }

    @Override
    public IService<ItsmServiceWorkEssentialSource> getSourceService() {
        return itsmServiceWorkEssentialSourceService;
    }

    @Override
    public CustomBaseMapper<ItsmServiceWorkEssentialTarget> getTargetMapper() {
        return itsmServiceWorkEssentialTargetMapper;
    }

    @Override
    protected ItsmServiceWorkEssentialTarget convert(ItsmServiceWorkEssentialSource itsmServiceWorkEssentialSource, Class<ItsmServiceWorkEssentialTarget> clazz) {
        ItsmServiceWorkEssentialTarget convert = super.convert(itsmServiceWorkEssentialSource, clazz);
        convert.setId(PrimarykeyConstants.generatePrimarykey(convert.getId()));
        return convert;
    }
}
