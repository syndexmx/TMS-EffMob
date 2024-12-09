package com.github.syndexmx.tmseffmob.dtos;

import com.github.syndexmx.tmseffmob.models.Task;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Data
public class UserDto {

    UUID id;
    String email;
    Boolean isAdmin;
    List<TaskDto> tasks;

}
