package com.skyjun.datamigration.actuator;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by alan on 2022/8/18.
 */
public class DatamigrationCentext {

    private final static ConcurrentHashMap<String, String> errorMap;

    private final static CopyOnWriteArrayList<String> inconformity;

    static {
        errorMap = new ConcurrentHashMap<>();
        inconformity = new CopyOnWriteArrayList<>();
    }

    public static ConcurrentHashMap<String, String> getErrorMap() {
        return errorMap;
    }

    public static CopyOnWriteArrayList<String> getInconformity() {
        return inconformity;
    }
}
