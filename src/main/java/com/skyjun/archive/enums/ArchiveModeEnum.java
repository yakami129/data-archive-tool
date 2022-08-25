package com.skyjun.archive.enums;

/**
 * Created by alan on 2022/8/25.
 * <p>
 * 归档模式
 */
public enum ArchiveModeEnum {

    /**
     * archive（归档）
     */
    ARCHIVE("--bulk-delete"),

    /**
     * (慢模式，兼容性高)
     */
    ARCHIVE_SLOW("-- archive"),

    /**
     * delete(只删除不归档)
     */
    DELETE("--purge"),

    /**
     * archive-to-file(归档到文件)
     */
    ARCHIVE_TO_FILE("--file '/opt/archive/%Y-%m-%d-%D.%t'");

    private String cmd;

    ArchiveModeEnum(String cmd) {
        this.cmd = cmd;
    }

    public String getCmd() {
        return cmd;
    }
}
