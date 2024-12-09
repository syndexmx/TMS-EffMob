package com.github.syndexmx.tmseffmob.entities;

import com.github.syndexmx.tmseffmob.models.Task;
import com.github.syndexmx.tmseffmob.models.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "tasks")
public class TaskEntity {

    @Id
    UUID taskId;

    String taskName;

    String taskContent;

    User executor;

    Integer status;

    Integer priority;

}
