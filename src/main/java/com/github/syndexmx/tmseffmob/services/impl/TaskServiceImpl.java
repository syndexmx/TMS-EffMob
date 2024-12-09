package com.github.syndexmx.tmseffmob.services.impl;

import com.github.syndexmx.tmseffmob.models.Task;
import com.github.syndexmx.tmseffmob.repositories.TaskRepository;
import com.github.syndexmx.tmseffmob.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    TaskServiceImpl(@Autowired TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task save(Task task) {
        //TODO implement method
        throw new RuntimeException("Method not implemented");
    }

    @Override
    public boolean isIdExistent(UUID id) {
        //TODO implement method
        throw new RuntimeException("Method not implemented");
    }

    @Override
    public Optional<Task> findById(UUID id) {
        //TODO implement method
        throw new RuntimeException("Method not implemented");
    }

    @Override
    public List<Task> listAllTasks() {
        //TODO implement method
        throw new RuntimeException("Method not implemented");
    }

    @Override
    public void deleteByTaskId(UUID id) {
        //TODO implement method
        throw new RuntimeException("Method not implemented");
    }
}
