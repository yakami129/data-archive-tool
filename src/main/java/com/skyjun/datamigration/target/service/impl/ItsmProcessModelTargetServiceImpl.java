package com.skyjun.datamigration.target.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skyjun.datamigration.target.entity.ItsmProcessModelTarget;
import com.skyjun.datamigration.target.mapper.ItsmProcessModelTargetMapper;
import com.skyjun.datamigration.target.service.ItsmProcessModelTargetService;
import org.springframework.stereotype.Service;

/**
 * @author zhangyajun
 * @description 针对表【itsm_process_model】的数据库操作Service实现
 * @createDate 2022-08-12 16:31:48
 */
@Service

public class ItsmProcessModelTargetServiceImpl extends ServiceImpl<ItsmProcessModelTargetMapper, ItsmProcessModelTarget>
        implements ItsmProcessModelTargetService {

}
