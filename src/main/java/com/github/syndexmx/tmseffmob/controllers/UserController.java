package com.github.syndexmx.tmseffmob.controllers;

import com.github.syndexmx.tmseffmob.dtos.CreateUserDto;
import com.github.syndexmx.tmseffmob.models.User;
import com.github.syndexmx.tmseffmob.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.github.syndexmx.tmseffmob.dtos.dtomappers.CreateUserDtoMapper.createUserDtoToUser;
import static com.github.syndexmx.tmseffmob.dtos.dtomappers.CreateUserDtoMapper.userToCreateUserDto;

@RestController
@RequestMapping
public class UserController {

    private final UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "api/v0/users")
    public ResponseEntity<Object> createUser(@RequestBody CreateUserDto userDto) {
        User createdUser;
        try {
            createdUser = userService.create(createUserDtoToUser(userDto));
        } catch (Exception e) {
            String error = e.getMessage();
            return new ResponseEntity(error, HttpStatus.NOT_ACCEPTABLE);
        }
        CreateUserDto createdUserDto = userToCreateUserDto(createdUser);
        return new ResponseEntity<>(createdUserDto, HttpStatus.CREATED);
    }

}
