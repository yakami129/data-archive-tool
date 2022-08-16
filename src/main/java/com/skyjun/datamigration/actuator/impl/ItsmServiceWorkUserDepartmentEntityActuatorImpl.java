package com.skyjun.datamigration.actuator.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skyjun.datamigration.actuator.AbstractDataEntityActuator;
import com.skyjun.datamigration.common.PersonComponent;
import com.skyjun.datamigration.core.CustomBaseMapper;
import com.skyjun.datamigration.source.entity.ItsmServiceWorkUserDepartmentSource;
import com.skyjun.datamigration.source.service.ItsmServiceWorkUserDepartmentSourceService;
import com.skyjun.datamigration.target.entity.ItsmPersonTarget;
import com.skyjun.datamigration.target.entity.ItsmServiceWorkUserDepartmentTarget;
import com.skyjun.datamigration.target.mapper.ItsmServiceWorkUserDepartmentTargetMapper;
import com.skyjun.datamigration.utils.PrimarykeyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Created by alan on 2022/8/16.
 */
@Component
public class ItsmServiceWorkUserDepartmentEntityActuatorImpl extends AbstractDataEntityActuator<ItsmServiceWorkUserDepartmentSource, ItsmServiceWorkUserDepartmentTarget> {

    @Autowired
    private ItsmServiceWorkUserDepartmentSourceService itsmServiceWorkUserDepartmentSourceService;
    @Autowired
    private ItsmServiceWorkUserDepartmentTargetMapper itsmServiceWorkUserDepartmentTargetMapper;
    @Autowired
    private PersonComponent personComponent;

    @Override
    protected String getTableName() {
        return "itsm_service_work_user_department";
    }

    @Override
    protected Class<ItsmServiceWorkUserDepartmentTarget> getTargetClass() {
        return ItsmServiceWorkUserDepartmentTarget.class;
    }

    @Override
    public IService<ItsmServiceWorkUserDepartmentSource> getSourceService() {
        return itsmServiceWorkUserDepartmentSourceService;
    }

    @Override
    public CustomBaseMapper<ItsmServiceWorkUserDepartmentTarget> getTargetMapper() {
        return itsmServiceWorkUserDepartmentTargetMapper;
    }

    @Override
    protected ItsmServiceWorkUserDepartmentTarget convert(ItsmServiceWorkUserDepartmentSource itsmServiceWorkUserDepartmentSource, Class<ItsmServiceWorkUserDepartmentTarget> clazz) {
        ItsmServiceWorkUserDepartmentTarget convert = super.convert(itsmServiceWorkUserDepartmentSource, clazz);
        convert.setId(PrimarykeyUtils.generatePrimarykey(convert.getId()));
        convert.setDepartmentId(PrimarykeyUtils.generatePrimarykey(convert.getDepartmentId()));
        convert.setServiceWorkId(PrimarykeyUtils.generatePrimarykey(convert.getServiceWorkId()));

        ItsmPersonTarget targetPerson = personComponent.getTargetPerson(convert.getUserId());
        if (Objects.nonNull(targetPerson)) {
            convert.setUserId(targetPerson.getItsmId());
        }

        return convert;
    }
}
