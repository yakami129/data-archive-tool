package com.skyjun.datamigration.common;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * Created by alan on 2022/8/16.
 */
public class PrimarykeyConstants {

    private static final String PREFIX = "10000";

    public static Long generatePrimarykey(Long primarykey) {
        return NumberUtils.toLong(PREFIX + primarykey);
    }

}
