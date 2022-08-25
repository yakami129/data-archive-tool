package com.skyjun.archive.task.execute;

import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.io.IoUtil;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * Created by alan on 2022/8/25.
 * <p>
 * shell 命令执行器
 */
public class ShellCommandActuator {

    /**
     * 执行Shell 命令
     *
     * @param shellCmd shell命令字符串
     * @return
     */
    public static String exec(String shellCmd) {

        // 执行命令
        Process process = execCmd(shellCmd);

        // 获取日志
        return getLogs(process);
    }

    private static String getLogs(Process process) {
        InputStream in = null;
        try {
            in = process.getInputStream();
            return IoUtil.read(in, Charset.forName("UTF-8"));
        } finally {
            IoUtil.close(in);
            process.destroy();
        }
    }

    private static Process execCmd(String shellCmd) {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(shellCmd);
        } catch (IOException e) {
            throw new IORuntimeException(e.getMessage());
        }
        return process;
    }

}
