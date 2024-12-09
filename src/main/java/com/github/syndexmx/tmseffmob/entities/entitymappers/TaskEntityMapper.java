package com.github.syndexmx.tmseffmob.entities.entitymappers;

import com.github.syndexmx.tmseffmob.entities.TaskEntity;
import com.github.syndexmx.tmseffmob.models.Task;

import static com.github.syndexmx.tmseffmob.entities.entitymappers.UserEntityMapper.userEntityToUser;
import static com.github.syndexmx.tmseffmob.entities.entitymappers.UserEntityMapper.userToUserEntity;

public class TaskEntityMapper {

    public static TaskEntity taskToTaskEntity(Task task){
        return TaskEntity.builder()
                .taskId(task.getTaskId())
                .taskName(task.getTaskName())
                .taskContent(task.getTaskContent())
                .executor(userToUserEntity(task.getExecutor()))
                .priority(task.getPriority().name())
                .status(task.getStatus().name())
                .build();
    }

    public static Task taskEntityToTask(TaskEntity taskEntity) {
        return Task.builder()
                .taskId(taskEntity.getTaskId())
                .taskName(taskEntity.getTaskName())
                .taskContent(taskEntity.getTaskContent())
                .executor(userEntityToUser(taskEntity.getExecutor()))
                .priority(Task.TaskPriority.valueOf(taskEntity.getPriority()))
                .status(Task.TaskStatus.valueOf(taskEntity.getStatus()))
                .build();
    }

}
