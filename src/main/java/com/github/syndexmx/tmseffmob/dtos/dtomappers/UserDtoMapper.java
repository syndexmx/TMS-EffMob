package com.github.syndexmx.tmseffmob.dtos.dtomappers;


import com.github.syndexmx.tmseffmob.dtos.UserDto;
import com.github.syndexmx.tmseffmob.models.User;

import static com.github.syndexmx.tmseffmob.dtos.dtomappers.TaskDtoMapper.taskDtoToTask;
import static com.github.syndexmx.tmseffmob.dtos.dtomappers.TaskDtoMapper.taskToTaskDto;


public class UserDtoMapper {
    public static UserDto userToUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .isAdmin(user.getIsAdmin())
                .tasks(user.getTasks().stream()
                        .map((task -> taskToTaskDto(task)))
                        .toList())
                .build();
    }

    public static User userDtoToUser(UserDto userDto) {
        return User.builder()
                .id(userDto.getId())
                .email(userDto.getEmail())
                .isAdmin(userDto.getIsAdmin())
                .tasks(userDto.getTasks().stream()
                        .map((taskDto -> taskDtoToTask(taskDto)))
                        .toList())
                .build();
    }
}
