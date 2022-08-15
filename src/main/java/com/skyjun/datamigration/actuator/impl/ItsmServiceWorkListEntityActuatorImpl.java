package com.skyjun.datamigration.actuator.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skyjun.datamigration.actuator.AbstractDataEntityActuator;
import com.skyjun.datamigration.core.CustomBaseMapper;
import com.skyjun.datamigration.source.entity.ItsmServiceWorkListSource;
import com.skyjun.datamigration.source.service.ItsmServiceWorkListSourceService;
import com.skyjun.datamigration.target.entity.ItsmServiceWorkListTarget;
import com.skyjun.datamigration.target.mapper.ItsmServiceWorkListTargetMapper;
import com.skyjun.datamigration.target.service.ItsmServiceWorkListTargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by alan on 2022/8/15.
 */
@Component
public class ItsmServiceWorkListEntityActuatorImpl extends AbstractDataEntityActuator<ItsmServiceWorkListSource, ItsmServiceWorkListTarget> {

    @Autowired
    private ItsmServiceWorkListSourceService itsmServiceWorkListSourceService;

    @Autowired
    private ItsmServiceWorkListTargetMapper itsmServiceWorkListTargetMapper;

    @Override
    protected String getTableName() {
        return "itsm_service_work_list";
    }

    @Override
    protected Class<ItsmServiceWorkListTarget> getTargetClass() {
        return ItsmServiceWorkListTarget.class;
    }

    @Override
    public IService<ItsmServiceWorkListSource> getSourceService() {
        return itsmServiceWorkListSourceService;
    }

    @Override
    public CustomBaseMapper<ItsmServiceWorkListTarget> getTargetMapper() {
        return itsmServiceWorkListTargetMapper;
    }

}
