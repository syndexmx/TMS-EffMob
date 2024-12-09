package com.github.syndexmx.tmseffmob.entities.entitymappers;

import com.github.syndexmx.tmseffmob.entities.TaskEntity;
import com.github.syndexmx.tmseffmob.entities.UserEntity;
import com.github.syndexmx.tmseffmob.models.User;

import static com.github.syndexmx.tmseffmob.entities.entitymappers.TaskEntityMapper.taskEntityToTask;
import static com.github.syndexmx.tmseffmob.entities.entitymappers.TaskEntityMapper.taskToTaskEntity;

public class UserEntityMapper {

    public static UserEntity userToUserEntity(User user) {
        return UserEntity.builder()
                .id(user.getId())
                .email(user.getEmail())
                .isAdmin(user.getIsAdmin())
                .password(user.getPassword())
                .tasks(user.getTasks().stream()
                        .map((task -> taskToTaskEntity(task)))
                        .toList())
                .build();
    }

    public static User userEntityToUser(UserEntity userEntity) {
        return User.builder()
                .id(userEntity.getId())
                .email(userEntity.getEmail())
                .isAdmin(userEntity.getIsAdmin())
                .password(userEntity.getPassword())
                .tasks(userEntity.getTasks().stream()
                        .map((taskEntity -> taskEntityToTask(taskEntity)))
                        .toList())
                .build();
    }

}
