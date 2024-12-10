package com.github.syndexmx.tmseffmob.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserWithPasswordDto {

    UUID id;
    String email;
    String password;
    Boolean isAdmin;
    List<TaskDto> tasks;
}
