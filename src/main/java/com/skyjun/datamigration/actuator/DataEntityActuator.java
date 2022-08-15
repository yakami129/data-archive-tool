package com.skyjun.datamigration.actuator;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skyjun.datamigration.core.CustomBaseMapper;

/**
 * Created by alan on 2022/8/11.
 */
public interface DataEntityActuator<E, T> {

    IService<E> getSourceService();

    CustomBaseMapper<T> getTargetMapper();

    void execute();

}
