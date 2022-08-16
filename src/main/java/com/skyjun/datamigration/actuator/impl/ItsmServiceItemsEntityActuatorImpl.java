package com.skyjun.datamigration.actuator.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skyjun.datamigration.actuator.AbstractDataEntityActuator;
import com.skyjun.datamigration.core.CustomBaseMapper;
import com.skyjun.datamigration.source.entity.ItsmServiceItemsSource;
import com.skyjun.datamigration.source.service.ItsmServiceItemsSourceService;
import com.skyjun.datamigration.target.entity.ItsmServiceItemsTarget;
import com.skyjun.datamigration.target.mapper.ItsmServiceItemsTargetMapper;
import com.skyjun.datamigration.utils.PrimarykeyUtils;
import org.springframework.stereotype.Component;

/**
 * Created by alan on 2022/8/16.
 */
@Component
public class ItsmServiceItemsEntityActuatorImpl extends AbstractDataEntityActuator<ItsmServiceItemsSource, ItsmServiceItemsTarget> {

    private ItsmServiceItemsSourceService itsmServiceItemsSourceService;
    private ItsmServiceItemsTargetMapper itsmServiceItemsTargetMapper;

    public ItsmServiceItemsEntityActuatorImpl(ItsmServiceItemsSourceService itsmServiceItemsSourceService, ItsmServiceItemsTargetMapper itsmServiceItemsTargetMapper) {
        this.itsmServiceItemsSourceService = itsmServiceItemsSourceService;
        this.itsmServiceItemsTargetMapper = itsmServiceItemsTargetMapper;
    }

    @Override
    protected String getTableName() {
        return "itsm_service_items";
    }

    @Override
    protected Class<ItsmServiceItemsTarget> getTargetClass() {
        return ItsmServiceItemsTarget.class;
    }

    @Override
    public IService<ItsmServiceItemsSource> getSourceService() {
        return itsmServiceItemsSourceService;
    }

    @Override
    public CustomBaseMapper<ItsmServiceItemsTarget> getTargetMapper() {
        return itsmServiceItemsTargetMapper;
    }

    @Override
    protected ItsmServiceItemsTarget convert(ItsmServiceItemsSource itsmServiceItemsSource, Class<ItsmServiceItemsTarget> clazz) {

        ItsmServiceItemsTarget convert = super.convert(itsmServiceItemsSource, clazz);
        convert.setId(PrimarykeyUtils.generatePrimarykey(convert.getId()));
        convert.setItemTypeId(PrimarykeyUtils.generatePrimarykey(convert.getItemTypeId()));
        convert.setProcessModelId(PrimarykeyUtils.generatePrimarykey(convert.getProcessModelId()));
        convert.setServiceItemType(PrimarykeyUtils.generatePrimarykey(convert.getServiceItemType()));
        convert.setStartTaskId(PrimarykeyUtils.generatePrimarykey(convert.getStartTaskId()));

        return convert;
    }
}
