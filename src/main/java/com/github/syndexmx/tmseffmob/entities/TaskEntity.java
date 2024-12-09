package com.github.syndexmx.tmseffmob.entities;

import com.github.syndexmx.tmseffmob.models.Task;
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
@Builder
@Table(name = "tasks")
public class TaskEntity {

    @Id
    UUID taskId;

    String taskName;

    String taskContent;

    @ManyToOne
            @JoinColumn(name = "id")
    User executor;

    @Column(name = "status", length = 12)
    String status;

    @Column(name = "priority", length = 12)
    String priority;

}
