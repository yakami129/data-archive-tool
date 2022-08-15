package com.skyjun.datamigration.core;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * Created by alan on 2022/8/15.
 */
public interface CustomBaseMapper<T> extends BaseMapper<T> {

    /**
     * 批量插入 仅适用于mysql
     *
     * @param entityList 实体列表
     * @return 影响行数
     */
    Integer insertBatchSomeColumn(List<T> entityList);
}
