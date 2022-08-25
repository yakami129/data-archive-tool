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
    archive("--bulk-delete"),

    /**
     * (慢模式，兼容性高)
     */
    archive_slow("-- archive"),

    /**
     * delete(只删除不归档)
     */
    delete("-- archive"),

    /**
     * archive-to-file(归档到文件)
     */
    archive_to_file("-- archive");

    private String cmd;

    ArchiveModeEnum(String cmd) {
        this.cmd = cmd;
    }

    public String getCmd() {
        return cmd;
    }
}
