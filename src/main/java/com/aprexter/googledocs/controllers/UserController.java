package com.aprexter.googledocs.controllers;

import com.aprexter.googledocs.dtos.LoginRequestDto;
import com.aprexter.googledocs.dtos.UserRegisterDto;
import com.aprexter.googledocs.dtos.UserResponseDto;
import com.aprexter.googledocs.dtos.UserUpdateRequestDto;
import com.aprexter.googledocs.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public ResponseEntity<UserResponseDto> createUser(@Validated @RequestBody UserRegisterDto userRequestDto) {
        UserResponseDto userResponseDto = userService.addUser(userRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(userResponseDto);
    }
    @PostMapping("/login")
    public ResponseEntity<UserResponseDto> login(@Validated @RequestBody LoginRequestDto loginRequestDto) {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PatchMapping
    public ResponseEntity<UserResponseDto> updatePassword(@RequestBody UserUpdateRequestDto userUpdateRequestDto) {
        UserResponseDto updatedUser= userService.updateUser(userUpdateRequestDto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
