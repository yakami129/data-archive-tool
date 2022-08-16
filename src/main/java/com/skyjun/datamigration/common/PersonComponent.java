package com.skyjun.datamigration.common;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.skyjun.datamigration.source.entity.ItsmPersonSource;
import com.skyjun.datamigration.source.service.ItsmPersonSourceService;
import com.skyjun.datamigration.target.entity.ItsmPersonTarget;
import com.skyjun.datamigration.target.service.ItsmPersonTargetService;
import com.skyjun.datamigration.utils.LambdaUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by alan on 2022/8/16.
 */
@Component
@Slf4j
public class PersonComponent {

    private ItsmPersonSourceService itsmPersonSourceService;
    private ItsmPersonTargetService itsmPersonTargetService;

    private static final ConcurrentHashMap<Long, ItsmPersonTarget> cache = new ConcurrentHashMap<>();

    public PersonComponent(ItsmPersonSourceService itsmPersonSourceService, ItsmPersonTargetService itsmPersonTargetService) {
        this.itsmPersonSourceService = itsmPersonSourceService;
        this.itsmPersonTargetService = itsmPersonTargetService;
    }

    public void initCache() {

        List<ItsmPersonSource> personSources = itsmPersonSourceService.list();
        List<ItsmPersonTarget> personTargets = itsmPersonTargetService.list(Wrappers
                .lambdaQuery(ItsmPersonTarget.class)
                .eq(ItsmPersonTarget::getUserStatus, 0));

        Map<String, ItsmPersonTarget> stringItsmPersonTargetMap = LambdaUtil.list2map(personTargets, ItsmPersonTarget::getItsmLogin);
        personSources.parallelStream().forEach(a -> {
            ItsmPersonTarget personTarget = stringItsmPersonTargetMap.get(a.getItsmLogin());
            if (Objects.nonNull(personTarget)) {
                cache.put(a.getItsmId(), personTarget);
            }
        });

        log.info("[BIZ] 成功初始化Person缓存信息{}条", cache.size());
    }

    public ItsmPersonTarget getTargetPerson(Long sourcePersonId) {
        return cache.get(sourcePersonId);
    }

}
