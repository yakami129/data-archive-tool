package com.skyjun.archive.enums;

/**
 * Created by alan on 2022/8/25.
 * 运行的状态
 */
public enum ExecStatusEnum {

    /**
     * 初始状态
     */
    INITIAL,

    /**
     * 执行中
     */
    RUNNING,

    /**
     * 检查不通过
     */
    CHECK_FAILED,

    /**
     * 等待超时
     */
    WAIT_TIMEOUT,

    /**
     * 已执行
     */
    DONE;

}
