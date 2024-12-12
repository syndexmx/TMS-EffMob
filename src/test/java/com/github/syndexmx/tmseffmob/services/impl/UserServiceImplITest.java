package com.github.syndexmx.tmseffmob.services.impl;

import com.github.syndexmx.tmseffmob.entities.TaskEntity;
import com.github.syndexmx.tmseffmob.entities.UserEntity;
import com.github.syndexmx.tmseffmob.models.Task;
import com.github.syndexmx.tmseffmob.models.User;
import com.github.syndexmx.tmseffmob.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplITest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl underTest;

    @Test
    public void testUserIsCreated() {
        User user = User.builder()
                .email("newemail@gmail.com")
                .password("0123456789")
                .tasks(new ArrayList<Task>())
                .build();
        UserEntity userEntityIn = UserEntity.builder()
                .email(user.getEmail())
                .password(user.getPassword())
                .tasks(new ArrayList<TaskEntity>())
                .isAdmin(false)
                .build();
        UserEntity userEntityOut = UserEntity.builder()
                .email(user.getEmail())
                .password(user.getPassword())
                .tasks(new ArrayList<TaskEntity>())
                .isAdmin(false)
                .build();
        doReturn(userEntityOut).when(userRepository.save(eq(userEntityIn)));
        User result = underTest.create(user);
        user.setId(result.getId());
        assertEquals(user, result);
    }

}
