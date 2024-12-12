package com.github.syndexmx.tmseffmob.controllers;

import com.github.syndexmx.tmseffmob.dtos.CreateUserDto;
import com.github.syndexmx.tmseffmob.dtos.TaskDto;
import com.github.syndexmx.tmseffmob.entities.TaskEntity;
import com.github.syndexmx.tmseffmob.models.Task;
import com.github.syndexmx.tmseffmob.models.User;
import com.github.syndexmx.tmseffmob.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.github.syndexmx.tmseffmob.dtos.dtomappers.CreateUserDtoMapper.userToCreateUserDto;
import static com.github.syndexmx.tmseffmob.dtos.dtomappers.TaskDtoMapper.taskDtoToTask;
import static com.github.syndexmx.tmseffmob.dtos.dtomappers.TaskDtoMapper.taskToTaskDto;

@RestController
@RequestMapping
public class TaskController {

    TaskService taskService;

    public TaskController(@Autowired TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("api/v0/tasks")
    ResponseEntity<Object> saveTask(@RequestBody TaskDto taskDto){
        Task savedTask;
        try {
            savedTask = taskService.save(taskDtoToTask(taskDto));
        } catch (Exception e) {
            String error = e.getMessage();
            return new ResponseEntity(error, HttpStatus.NOT_MODIFIED);
        }
        TaskDto savedTaskDto = taskToTaskDto(savedTask);
        return new ResponseEntity<>(savedTaskDto, HttpStatus.CREATED);
    }


}
