package com.skyjun.archive.task.generate;

import cn.hutool.core.bean.BeanUtil;
import com.skyjun.archive.enums.ArchiveModeEnum;
import com.skyjun.archive.infrastructure.config.DataArchiveProperties;
import com.skyjun.archive.infrastructure.db.entity.ArchiveConfigEntity;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.StringWriter;
import java.util.Map;

/**
 * Created by alan on 2022/8/25.
 */
public class GeneratePtArchiverCmd {

    private static final String TEMPLATE_NAME = "templates/archiverShell.vm";

    static {
        Velocity.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        Velocity.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
    }

    public static String generateCmd(DataArchiveProperties dataArchiveProperties, ArchiveConfigEntity archiveConfigEntity) {

        VelocityContext context = buildVelocityContext(dataArchiveProperties, archiveConfigEntity);

        // 将VelocityContext写入到模版
        StringWriter sw = new StringWriter();
        Template tpl = Velocity.getTemplate(TEMPLATE_NAME, "UTF-8");
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

        // 填充到VelocityContext，提供给模版使用
        VelocityContext context = new VelocityContext(param);
        return context;
    }

}
