package com.skyjun.datamigration.target.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skyjun.datamigration.target.entity.ItsmFieldTarget;
import com.skyjun.datamigration.target.mapper.ItsmFieldTargetMapper;
import com.skyjun.datamigration.target.service.ItsmFieldTargetService;
import org.springframework.stereotype.Service;

/**
 * @author zhangyajun
 * @description 针对表【itsm_field】的数据库操作Service实现
 * @createDate 2022-08-12 16:31:48
 */
@Service

public class ItsmFieldTargetServiceImpl extends ServiceImpl<ItsmFieldTargetMapper, ItsmFieldTarget>
        implements ItsmFieldTargetService {

}
