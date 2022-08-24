package com.skyjun.archive;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

class DataMigrationToolApplicationTests {

    @Test
    void contextLoads() throws IOException {

        String shell = IoUtil.read(FileUtil.getReader("/Users/zhangyajun/Documents/CodeWorkSpace/skyjun/data-archive-tool/src/test/resources/archiver.sh", Charset.forName("utf-8")));
        Process pwd = Runtime.getRuntime().exec(shell);
        try (InputStream inputStream = pwd.getInputStream();) {
            String read = IoUtil.read(inputStream, Charset.forName("utf-8"));
            System.out.println(read);
        }
    }

}
