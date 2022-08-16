package com.skyjun.datamigration.actuator.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skyjun.datamigration.actuator.AbstractDataEntityActuator;
import com.skyjun.datamigration.common.PersonComponent;
import com.skyjun.datamigration.core.CustomBaseMapper;
import com.skyjun.datamigration.source.entity.ItsmServiceWorkEssentialSource;
import com.skyjun.datamigration.source.service.ItsmServiceWorkEssentialSourceService;
import com.skyjun.datamigration.target.entity.ItsmPersonTarget;
import com.skyjun.datamigration.target.entity.ItsmServiceWorkEssentialTarget;
import com.skyjun.datamigration.target.mapper.ItsmServiceWorkEssentialTargetMapper;
import com.skyjun.datamigration.utils.PrimarykeyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Created by alan on 2022/8/16.
 */
@Component
public class ItsmServiceWorkEssentialEntityActuatorImpl extends AbstractDataEntityActuator<ItsmServiceWorkEssentialSource, ItsmServiceWorkEssentialTarget> {

    @Autowired
    private ItsmServiceWorkEssentialSourceService itsmServiceWorkEssentialSourceService;
    @Autowired
    private ItsmServiceWorkEssentialTargetMapper itsmServiceWorkEssentialTargetMapper;
    @Autowired
    private PersonComponent personComponent;

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
        convert.setId(PrimarykeyUtils.generatePrimarykey(convert.getId()));
        convert.setItemTypeId(PrimarykeyUtils.generatePrimarykey(convert.getItemTypeId()));
        convert.setServiceItemId(PrimarykeyUtils.generatePrimarykey(convert.getServiceItemId()));
        convert.setWorkId(PrimarykeyUtils.generatePrimarykey(convert.getWorkId()));

        ItsmPersonTarget targetPerson = personComponent.getTargetPerson(convert.getInitiatorId());
        if (Objects.nonNull(targetPerson)) {
            convert.setInitiatorId(targetPerson.getItsmId());
            convert.setInitiatorName(targetPerson.getItsmName());
        }

        ItsmPersonTarget requestPerson = personComponent.getTargetPerson(convert.getRequestPersonId());
        if (Objects.nonNull(requestPerson)) {
            convert.setRequestPersonId(requestPerson.getItsmId());
            convert.setRequestPersonName(requestPerson.getItsmName());
        }

        ItsmPersonTarget getCloseAssignor = personComponent.getTargetPerson(convert.getCloseAssignorId());
        if (Objects.nonNull(getCloseAssignor)) {
            convert.setCloseAssignorId(getCloseAssignor.getItsmId());
            convert.setCloseAssignorName(getCloseAssignor.getItsmName());
        }
        return convert;
    }
}
