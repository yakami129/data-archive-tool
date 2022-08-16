package com.skyjun.datamigration.actuator.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skyjun.datamigration.actuator.AbstractDataEntityActuator;
import com.skyjun.datamigration.core.CustomBaseMapper;
import com.skyjun.datamigration.source.entity.ItsmProcessModelSource;
import com.skyjun.datamigration.source.service.ItsmProcessModelSourceService;
import com.skyjun.datamigration.target.entity.ItsmProcessModelTarget;
import com.skyjun.datamigration.target.mapper.ItsmProcessModelTargetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by alan on 2022/8/15.
 */
@Component
public class ItsmProcessModelEntityActuatorImpl extends AbstractDataEntityActuator<ItsmProcessModelSource, ItsmProcessModelTarget> {

    @Autowired
    protected ItsmProcessModelSourceService itsmProcessModelSourceService;

    @Autowired
    protected ItsmProcessModelTargetMapper itsmProcessModelTargetMapper;

    @Override
    protected String getTableName() {
        return "itsm_process_model";
    }

    @Override
    protected Class<ItsmProcessModelTarget> getTargetClass() {
        return ItsmProcessModelTarget.class;
    }

    @Override
    public IService<ItsmProcessModelSource> getSourceService() {
        return itsmProcessModelSourceService;
    }

    @Override
    public CustomBaseMapper<ItsmProcessModelTarget> getTargetMapper() {
        return itsmProcessModelTargetMapper;
    }

    @Override
    protected ItsmProcessModelTarget convert(ItsmProcessModelSource itsmProcessModelSource, Class<ItsmProcessModelTarget> clazz) {
        ItsmProcessModelTarget target = super.convert(itsmProcessModelSource, clazz);
        target.setVersion(1);
        //target.setHiStatus(1L);
        target.setBpmn(null);
        target.setConfiguration(null);
        return target;
    }
}
