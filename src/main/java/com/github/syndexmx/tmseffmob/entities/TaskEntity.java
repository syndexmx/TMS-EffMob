package com.github.syndexmx.tmseffmob.entities;

import com.github.syndexmx.tmseffmob.models.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
@Table(name = "tasks")
public class TaskEntity {

    @Id
            @Column(name = "task_id")
    UUID taskId;

    @Column(name = "task_name")
    String taskName;

    @Column(name = "task_content")
    String taskContent;

    @ManyToOne
            @JoinColumn(name = "id")
    UserEntity executor;

    @Column(name = "status", length = 12)
    String status;

    @Column(name = "priority", length = 12)
    String priority;

}
