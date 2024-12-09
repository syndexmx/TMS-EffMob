package com.github.syndexmx.tmseffmob.services;

import com.github.syndexmx.tmseffmob.models.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface UserService {

    User save(User user);

    boolean isIdExistent(UUID id);

    boolean isEmailExistent(String email);

    Optional<User> findById(UUID id);

    Optional<User> findByEmail(String email);

    List<User> listAllUsers();

    void deleteByUserId(UUID id);

}
