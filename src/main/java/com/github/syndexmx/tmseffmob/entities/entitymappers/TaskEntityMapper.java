package com.github.syndexmx.tmseffmob.entities.entitymappers;

import com.github.syndexmx.tmseffmob.entities.TaskEntity;
import com.github.syndexmx.tmseffmob.models.Task;

public class TaskEntityMapper {

    public static TaskEntity taskToTaskEntity(Task task){
        return TaskEntity.builder()
                .taskId(task.getTaskId())
                .taskName(task.getTaskName())
                .taskContent(task.getTaskContent())
                .executor(task.getExecutor())
                .priority(task.getPriority().name())
                .status(task.getStatus().name())
                .build();
    }

    public static Task taskEntityToTask(TaskEntity taskEntity) {
        return Task.builder()
                .taskId(taskEntity.getTaskId())
                .taskName(taskEntity.getTaskName())
                .taskContent(taskEntity.getTaskContent())
                .executor(taskEntity.getExecutor())
                .priority(Task.TaskPriority.valueOf(taskEntity.getPriority()))
                .status(Task.TaskStatus.valueOf(taskEntity.getStatus()))
                .build();
    }

}
