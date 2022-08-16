package com.skyjun.datamigration.target.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skyjun.datamigration.target.entity.ItsmTaskTarget;
import com.skyjun.datamigration.target.mapper.ItsmTaskTargetMapper;
import com.skyjun.datamigration.target.service.ItsmTaskTargetService;
import org.springframework.stereotype.Service;

/**
 * @author zhangyajun
 * @description 针对表【itsm_task】的数据库操作Service实现
 * @createDate 2022-08-12 16:31:48
 */
@Service

public class ItsmTaskTargetServiceImpl extends ServiceImpl<ItsmTaskTargetMapper, ItsmTaskTarget>
        implements ItsmTaskTargetService {

}
