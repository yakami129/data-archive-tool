package com.skyjun.archive.constant;

/**
 * Created by alan on 2022/8/26.
 */
public interface ArchiveConfigConstants {

    /**
     * 打开
     */
    Integer TURN_ON = 1;

    /**
     * 关闭
     */
    Integer TURN_OFF = 0;


    /**
     * 批量每次归档的数据数量
     */
    String DEFAULT_BATCHSIZE = "1000";

    /**
     * 指定每个事务的大小（行数）
     */
    String DEFAULT_TXNSIZE = "1000";

    /**
     * 默认归档文件路径
     */
    String DEFAULT_ARCHIVE_FILE_PATH = "/opt/archive";

}
