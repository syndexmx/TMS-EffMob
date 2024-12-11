package com.github.syndexmx.tmseffmob.dtos.dtomappers;

import com.github.syndexmx.tmseffmob.dtos.CreateUserDto;
import com.github.syndexmx.tmseffmob.models.User;

import java.util.ArrayList;
import java.util.UUID;

import static com.github.syndexmx.tmseffmob.dtos.dtomappers.TaskDtoMapper.taskToTaskDto;

public class CreateUserDtoMapper {
    public static CreateUserDto userToCreateUserDto(User user) {
        return CreateUserDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .password(user.getPassword())
                .isAdmin(user.getIsAdmin())
                .tasks(user.getTasks().stream()
                        .map((task -> taskToTaskDto(task)))
                        .toList())
                .build();
    }

    public static User createUserDtoToUser(CreateUserDto userDto) {
        return User.builder()
                .id(UUID.randomUUID())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .isAdmin(false)
                .tasks(new ArrayList<>())
                .build();
    }
}
