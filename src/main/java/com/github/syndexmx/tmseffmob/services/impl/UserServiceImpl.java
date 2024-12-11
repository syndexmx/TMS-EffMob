package com.github.syndexmx.tmseffmob.services.impl;

import com.github.syndexmx.tmseffmob.entities.UserEntity;
import com.github.syndexmx.tmseffmob.models.User;
import com.github.syndexmx.tmseffmob.repositories.UserRepository;
import com.github.syndexmx.tmseffmob.services.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.github.syndexmx.tmseffmob.entities.entitymappers.UserEntityMapper.userEntityToUser;
import static com.github.syndexmx.tmseffmob.entities.entitymappers.UserEntityMapper.userToUserEntity;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    UserServiceImpl(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public User create(User user) {
        UserEntity userEntity = userToUserEntity(user);
        if (userRepository.existsById(user.getId())) {
            throw new RuntimeException("User already exists");
        }
        UserEntity createdUserEntity = userRepository.save(userEntity);
        User createdUser = userEntityToUser(createdUserEntity);
        return createdUser;
    }

    @Override
    public User save(User user) {

        //TODO implement method
        throw new RuntimeException("Method not implemented");
    }

    @Override
    public boolean isIdExistent(UUID id) {

        //TODO implement method
        throw new RuntimeException("Method not implemented");
    }

    @Override
    public boolean isEmailExistent(String email) {

        //TODO implement method
        throw new RuntimeException("Method not implemented");
    }

    @Override
    public Optional<User> findById(UUID id) {

        //TODO implement method
        throw new RuntimeException("Method not implemented");
    }

    @Override
    public Optional<User> findByEmail(String email) {

        //TODO implement method
        throw new RuntimeException("Method not implemented");
    }

    @Override
    public List<User> listAllUsers() {

        //TODO implement method
        throw new RuntimeException("Method not implemented");
    }

    @Override
    public void deleteByUserId(UUID id) {

        //TODO implement method
        throw new RuntimeException("Method not implemented");
    }
}
