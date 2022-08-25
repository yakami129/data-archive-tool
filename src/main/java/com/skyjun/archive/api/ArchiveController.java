package com.skyjun.archive.api;

import com.skyjun.archive.task.execute.ExecuteArchiveTasksService;
import com.skyjun.archive.task.generate.GenerateArchiveTasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alan on 2022/8/25.
 */
@RestController
@RequestMapping("/api")
public class ArchiveController {

    @Autowired
    private GenerateArchiveTasksService generateArchiveTasksService;
    @Autowired
    private ExecuteArchiveTasksService executeArchiveTasksService;

    @GetMapping("/archiveTasks/generate")
    public String generateArchiveTasks() {
        generateArchiveTasksService.generateArchiveTasks();
        return "OK";
    }

    @GetMapping("/archiveTasks/execute")
    public String executeArchiveTasks() {
        executeArchiveTasksService.executeArchiveTasks();
        return "OK";
    }

}
