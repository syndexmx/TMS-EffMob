package com.github.syndexmx.tmseffmob.entities.entitymappers;

import com.github.syndexmx.tmseffmob.entities.UserEntity;
import com.github.syndexmx.tmseffmob.models.User;

public class UserEntityMapper {

    public static UserEntity userToUserEntity(User user) {
        return UserEntity.builder()
                .id(user.getId())
                .email(user.getEmail())
                .isAdmin(user.getIsAdmin())
                .password(user.getPassword())
                .build();
    }

    public static User userEntityToUser(UserEntity userEntity) {
        return User.builder()
                .id(userEntity.getId())
                .email(userEntity.getEmail())
                .isAdmin(userEntity.getIsAdmin())
                .password(userEntity.getPassword())
                .build();
    }

}
