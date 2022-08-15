package com.skyjun.datamigration.target.service.impl;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skyjun.datamigration.target.entity.ItsmFieldDataTarget;
import com.skyjun.datamigration.target.service.ItsmFieldDataTargetervice;
import com.skyjun.datamigration.target.mapper.ItsmFieldDataTargetMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyajun
* @description 针对表【itsm_field_data】的数据库操作Service实现
* @createDate 2022-08-12 16:31:48
*/
@Service
@DS("target")
public class ItsmFieldDataTargeterviceImpl extends ServiceImpl<ItsmFieldDataTargetMapper, ItsmFieldDataTarget>
implements ItsmFieldDataTargetervice {

}
