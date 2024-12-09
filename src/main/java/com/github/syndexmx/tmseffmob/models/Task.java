package com.github.syndexmx.tmseffmob.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Task {

    UUID taskId;
    String taskName;
    String taskContent;
    User executor;
    TaskStatus status;
    TaskPriority priority;

    public static enum TaskStatus {
        WAITING,
        UNDERWAY,
        FINISHED;
    }

    public static enum TaskPriority {
        LOW,
        MEDIUM,
        HIGH;
    }

}