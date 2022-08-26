package com.skyjun.archive.task.generate;

import cn.hutool.core.bean.BeanUtil;
import com.skyjun.archive.constant.ArchiveConfigConstants;
import com.skyjun.archive.enums.ArchiveModeEnum;
import com.skyjun.archive.infrastructure.config.ArchiveConfig;
import com.skyjun.archive.infrastructure.config.ArchiveToFileConfig;
import com.skyjun.archive.infrastructure.config.DataArchiveProperties;
import com.skyjun.archive.infrastructure.config.DeleteConfig;
import com.skyjun.archive.infrastructure.db.entity.ArchiveConfigEntity;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.StringWriter;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/**
 * Created by alan on 2022/8/25.
 */
public class GeneratePtArchiverCmd {

    private static final String TEMPLATE_NAME = "templates/archiverShell-";

    static {
        Velocity.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        Velocity.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
    }

    public static String generateCmd(DataArchiveProperties dataArchiveProperties, ArchiveConfigEntity archiveConfigEntity) {

        VelocityContext context = buildVelocityContext(dataArchiveProperties, archiveConfigEntity);

        // 将VelocityContext写入到模版
        StringWriter sw = new StringWriter();
        Template tpl = Velocity.getTemplate(TEMPLATE_NAME + archiveConfigEntity.getArchiveMode().toLowerCase(Locale.ROOT) + ".vm", "UTF-8");
        tpl.merge(context, sw);

        return sw.toString();
    }

    private static VelocityContext buildVelocityContext(DataArchiveProperties dataArchiveProperties, ArchiveConfigEntity archiveConfigEntity) {

        // 将配置Bean转换为Map
        Map<String, Object> param = BeanUtil.beanToMap(dataArchiveProperties);
        param.putAll(BeanUtil.beanToMap(archiveConfigEntity));

        // 转换归档模式
        param.put("archiveModeEnum", ArchiveModeEnum.valueOf(archiveConfigEntity.getArchiveMode()).getCmd());
        param.put("extensionCmd", StringUtils.EMPTY);

        // 去除空格
        param.put("archiveCondition", StringUtils.trim(archiveConfigEntity.getArchiveCondition()));

        // 初始化ARCHIVE模式的归档配置
        initArchiveConfig(param, dataArchiveProperties, archiveConfigEntity);

        // 初始化ARCHIVE_TO_FILE模式的归档配置
        initArchiveToFileConfig(param, dataArchiveProperties, archiveConfigEntity);

        // 初始化DELETE模式的归档配置
        initDeleteConfig(param, dataArchiveProperties, archiveConfigEntity);

        // 填充到VelocityContext，提供给模版使用
        VelocityContext context = new VelocityContext(param);
        return context;
    }

    private static void initDeleteConfig(Map<String, Object> param, DataArchiveProperties dataArchiveProperties, ArchiveConfigEntity archiveConfigEntity) {

        DeleteConfig deleteConfig = dataArchiveProperties.getDeleteConfig();
        if (Objects.isNull(deleteConfig)) {
            defaultConfig(param);
            return;
        }

        param.putAll(BeanUtil.beanToMap(deleteConfig));

        // 填充默认的批量每次归档的数据数量
        if (StringUtils.isBlank(deleteConfig.getBatchSize())) {
            param.put("batchSize", ArchiveConfigConstants.DEFAULT_BATCHSIZE);
        }

        // 填充默认的指定每个事务的大小（行数）
        if (StringUtils.isBlank(deleteConfig.getTxnSize())) {
            param.put("txnSize", ArchiveConfigConstants.DEFAULT_TXNSIZE);
        }

    }

    private static void initArchiveToFileConfig(Map<String, Object> param, DataArchiveProperties dataArchiveProperties, ArchiveConfigEntity archiveConfigEntity) {

        ArchiveToFileConfig archiveToFileConfig = dataArchiveProperties.getArchiveToFileConfig();
        if (Objects.isNull(archiveToFileConfig)) {
            defaultConfig(param);
            return;
        }

        param.putAll(BeanUtil.beanToMap(archiveToFileConfig));

        // 填充默认的归档文件路径
        if (StringUtils.isBlank(archiveToFileConfig.getArchiveFilePath())) {
            param.put("archiveFilePath", ArchiveConfigConstants.DEFAULT_ARCHIVE_FILE_PATH);
        }

        // 填充默认的批量每次归档的数据数量
        if (StringUtils.isBlank(archiveToFileConfig.getBatchSize())) {
            param.put("batchSize", ArchiveConfigConstants.DEFAULT_BATCHSIZE);
        }

        // 填充默认的指定每个事务的大小（行数）
        if (StringUtils.isBlank(archiveToFileConfig.getTxnSize())) {
            param.put("txnSize", ArchiveConfigConstants.DEFAULT_TXNSIZE);
        }

    }

    private static void initArchiveConfig(Map<String, Object> param, DataArchiveProperties dataArchiveProperties, ArchiveConfigEntity archiveConfigEntity) {

        ArchiveConfig archiveConfig = dataArchiveProperties.getArchiveConfig();
        if (Objects.isNull(archiveConfig)) {
            defaultConfig(param);
            return;
        }

        param.putAll(BeanUtil.beanToMap(archiveConfig));

        // 填充默认的批量每次归档的数据数量
        if (StringUtils.isBlank(archiveConfig.getBatchSize())) {
            param.put("batchSize", ArchiveConfigConstants.DEFAULT_BATCHSIZE);
        }

        // 填充默认的指定每个事务的大小（行数）
        if (StringUtils.isBlank(archiveConfig.getTxnSize())) {
            param.put("txnSize", ArchiveConfigConstants.DEFAULT_TXNSIZE);
        }

    }

    private static void defaultConfig(Map<String, Object> param) {
        param.put("archiveFilePath", ArchiveConfigConstants.DEFAULT_ARCHIVE_FILE_PATH);
        param.put("batchSize", ArchiveConfigConstants.DEFAULT_BATCHSIZE);
        param.put("txnSize", ArchiveConfigConstants.DEFAULT_TXNSIZE);
    }

}
