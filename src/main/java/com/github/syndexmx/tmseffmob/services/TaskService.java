package com.github.syndexmx.tmseffmob.services;

import com.github.syndexmx.tmseffmob.models.Task;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface TaskService {

    Task save(Task task);

    boolean isIdExistent(UUID id);

    Optional<Task> findById(UUID id);

    List<Task> listAllTasks();

    void deleteByTaskId(UUID id);


}
