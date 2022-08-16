package com.skyjun.datamigration.actuator.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skyjun.datamigration.actuator.AbstractDataEntityActuator;
import com.skyjun.datamigration.common.PersonComponent;
import com.skyjun.datamigration.core.CustomBaseMapper;
import com.skyjun.datamigration.source.entity.ItsmActionRecordSource;
import com.skyjun.datamigration.source.service.ItsmActionRecordSourceService;
import com.skyjun.datamigration.target.entity.ItsmActionRecordTarget;
import com.skyjun.datamigration.target.entity.ItsmPersonTarget;
import com.skyjun.datamigration.target.mapper.ItsmActionRecordTargetMapper;
import com.skyjun.datamigration.utils.PrimarykeyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Created by alan on 2022/8/16.
 */
@Component
public class ItsmActionRecordEntityActuatorImpl extends AbstractDataEntityActuator<ItsmActionRecordSource, ItsmActionRecordTarget> {

    @Autowired
    private ItsmActionRecordSourceService itsmActionRecordSourceService;
    @Autowired
    private ItsmActionRecordTargetMapper itsmActionRecordTargetMapper;
    @Autowired
    private PersonComponent personComponent;


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
        convert.setId(PrimarykeyUtils.generatePrimarykey(convert.getId()));
        convert.setSource(false);

        convert.setTaskId(PrimarykeyUtils.generatePrimarykey(convert.getTaskId()));
        convert.setServiceDeskId(PrimarykeyUtils.generatePrimarykey(convert.getServiceDeskId()));
        convert.setWorkId(PrimarykeyUtils.generatePrimarykey(convert.getWorkId()));

        ItsmPersonTarget targetPerson = personComponent.getTargetPerson(convert.getId());
        if (Objects.nonNull(targetPerson)) {
            convert.setUserId(targetPerson.getItsmId());
            convert.setUserName(targetPerson.getItsmName());
        }

        return convert;
    }
}
