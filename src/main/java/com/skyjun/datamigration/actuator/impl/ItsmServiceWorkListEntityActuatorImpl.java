package com.skyjun.datamigration.actuator.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.IService;
import com.skyjun.datamigration.actuator.AbstractDataEntityActuator;
import com.skyjun.datamigration.common.PersonComponent;
import com.skyjun.datamigration.target.entity.ItsmPersonTarget;
import com.skyjun.datamigration.utils.PrimarykeyUtils;
import com.skyjun.datamigration.core.CustomBaseMapper;
import com.skyjun.datamigration.source.entity.ItsmServiceWorkListSource;
import com.skyjun.datamigration.source.service.ItsmServiceWorkListSourceService;
import com.skyjun.datamigration.target.entity.ItsmServiceWorkListTarget;
import com.skyjun.datamigration.target.mapper.ItsmServiceWorkListTargetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Created by alan on 2022/8/15.
 */
@Component
public class ItsmServiceWorkListEntityActuatorImpl extends AbstractDataEntityActuator<ItsmServiceWorkListSource, ItsmServiceWorkListTarget> {

    @Autowired
    private ItsmServiceWorkListSourceService itsmServiceWorkListSourceService;
    @Autowired
    private ItsmServiceWorkListTargetMapper itsmServiceWorkListTargetMapper;
    @Autowired
    private PersonComponent personComponent;

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

    @Override
    protected Wrapper<ItsmServiceWorkListSource> getSourceQueryWrapper() {
        return Wrappers
                .lambdaQuery(ItsmServiceWorkListSource.class)
                .eq(ItsmServiceWorkListSource::getHiStatus, 0L);
    }

    @Override
    protected Wrapper<ItsmServiceWorkListTarget> getTargetQueryWrapper() {
        return Wrappers
                .lambdaQuery(ItsmServiceWorkListTarget.class)
                .eq(ItsmServiceWorkListTarget::getHiStatus, 0L);
    }

    @Override
    protected ItsmServiceWorkListTarget convert(ItsmServiceWorkListSource itsmServiceWorkListSource, Class<ItsmServiceWorkListTarget> clazz) {
        ItsmServiceWorkListTarget convert = super.convert(itsmServiceWorkListSource, clazz);
        convert.setId(PrimarykeyUtils.generatePrimarykey(convert.getId()));
        convert.setServiceItemId(PrimarykeyUtils.generatePrimarykey(convert.getServiceItemId()));
        convert.setItemTypeId(PrimarykeyUtils.generatePrimarykey(convert.getItemTypeId()));
        convert.setProcessModelId(PrimarykeyUtils.generatePrimarykey(convert.getProcessModelId()));
        convert.setCurrentTaskId(PrimarykeyUtils.generatePrimarykey(convert.getCurrentTaskId()));
        convert.setServiceDeskId(PrimarykeyUtils.generatePrimarykey(convert.getServiceDeskId()));

        ItsmPersonTarget targetPerson = personComponent.getTargetPerson(convert.getInitiatorId());
        if (Objects.nonNull(targetPerson)) {
            convert.setInitiatorId(targetPerson.getItsmId());
            convert.setInitiatorName(targetPerson.getItsmName());
        }

        return convert;
    }
}
