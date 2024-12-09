package com.github.syndexmx.tmseffmob.dtos.dtomappers;

import com.github.syndexmx.tmseffmob.dtos.TaskDto;
import com.github.syndexmx.tmseffmob.models.Task;

import static com.github.syndexmx.tmseffmob.dtos.dtomappers.UserDtoMapper.userDtoToUser;
import static com.github.syndexmx.tmseffmob.dtos.dtomappers.UserDtoMapper.userToUserDto;

public class TaskDtoMapper {

    public static TaskDto taskToTaskDto(Task task){
        return TaskDto.builder()
                .taskId(task.getTaskId())
                .taskName(task.getTaskName())
                .taskContent(task.getTaskContent())
                .executor(userToUserDto(task.getExecutor()))
                .priority(task.getPriority().name())
                .status(task.getStatus().name())
                .build();
    }

    public static Task taskDtoToTask(TaskDto taskDto) {
        return Task.builder()
                .taskId(taskDto.getTaskId())
                .taskName(taskDto.getTaskName())
                .taskContent(taskDto.getTaskContent())
                .executor(userDtoToUser(taskDto.getExecutor()))
                .priority(Task.TaskPriority.valueOf(taskDto.getPriority()))
                .status(Task.TaskStatus.valueOf(taskDto.getStatus()))
                .build();
    }
}
