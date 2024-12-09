package com.github.syndexmx.tmseffmob.dtos;

import com.github.syndexmx.tmseffmob.models.Task;
import com.github.syndexmx.tmseffmob.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Data
public class TaskDto {

    UUID taskId;
    String taskName;
    String taskContent;
    UserDto executor;
    String status;
    String priority;
}
