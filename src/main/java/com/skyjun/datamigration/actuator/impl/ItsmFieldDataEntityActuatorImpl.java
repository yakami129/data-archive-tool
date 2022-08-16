package com.skyjun.datamigration.actuator.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skyjun.datamigration.actuator.AbstractDataEntityActuator;
import com.skyjun.datamigration.common.PersonComponent;
import com.skyjun.datamigration.utils.PrimarykeyUtils;
import com.skyjun.datamigration.core.CustomBaseMapper;
import com.skyjun.datamigration.source.entity.ItsmFieldDataSource;
import com.skyjun.datamigration.source.service.ItsmFieldDataSourceService;
import com.skyjun.datamigration.target.entity.ItsmFieldDataTarget;
import com.skyjun.datamigration.target.entity.ItsmPersonTarget;
import com.skyjun.datamigration.target.mapper.ItsmFieldDataTargetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Created by alan on 2022/8/16.
 */
@Component
public class ItsmFieldDataEntityActuatorImpl extends AbstractDataEntityActuator<ItsmFieldDataSource, ItsmFieldDataTarget> {

    @Autowired
    private ItsmFieldDataSourceService itsmFieldDataSourceService;
    @Autowired
    private ItsmFieldDataTargetMapper itsmFieldDataTargetMapper;
    @Autowired
    private PersonComponent personComponent;

    @Override
    protected String getTableName() {
        return "itsm_field_data";
    }

    @Override
    protected Class<ItsmFieldDataTarget> getTargetClass() {
        return ItsmFieldDataTarget.class;
    }

    @Override
    public IService<ItsmFieldDataSource> getSourceService() {
        return itsmFieldDataSourceService;
    }

    @Override
    public CustomBaseMapper<ItsmFieldDataTarget> getTargetMapper() {
        return itsmFieldDataTargetMapper;
    }

    @Override
    protected ItsmFieldDataTarget convert(ItsmFieldDataSource itsmFieldDataSource, Class<ItsmFieldDataTarget> clazz) {

        ItsmFieldDataTarget convert = super.convert(itsmFieldDataSource, clazz);
        convert.setId(PrimarykeyUtils.generatePrimarykey(convert.getId()));
        convert.setItsmFieidModelId(PrimarykeyUtils.generatePrimarykey(convert.getItsmFieidModelId()));
        convert.setItsmTaskId(PrimarykeyUtils.generatePrimarykey(convert.getItsmTaskId()));
        convert.setItsmWorkId(PrimarykeyUtils.generatePrimarykey(convert.getItsmWorkId()));
        convert.setProModelId(PrimarykeyUtils.generatePrimarykey(convert.getProModelId()));
        convert.setServiceDeskId(PrimarykeyUtils.generatePrimarykey(convert.getServiceDeskId()));
        convert.setServiceDirectoryId(PrimarykeyUtils.generatePrimarykey(convert.getServiceDirectoryId()));
        convert.setServiceItemId(PrimarykeyUtils.generatePrimarykey(convert.getServiceItemId()));

        ItsmPersonTarget targetPerson = personComponent.getTargetPerson(convert.getItsmOperatorId());
        if (Objects.nonNull(targetPerson)) {
            convert.setItsmOperatorId(targetPerson.getItsmId());
            convert.setItsmOperatorName(targetPerson.getItsmName());
        }
        return convert;
    }
}
