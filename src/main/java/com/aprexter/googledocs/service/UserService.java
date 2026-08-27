package com.aprexter.googledocs.service;

import com.aprexter.googledocs.dtos.UserRegisterDto;
import com.aprexter.googledocs.dtos.UserResponseDto;
import com.aprexter.googledocs.dtos.UserUpdateRequestDto;
import com.aprexter.googledocs.models.User;
import com.aprexter.googledocs.repositry.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    private ModelMapper modelMapper;
    private PasswordEncoder passwordEncoder;
    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }
    public UserResponseDto addUser(UserRegisterDto registerDto){
        User user=new User();
        user.setEmail(registerDto.getEmail());
        user.setPassword(passwordEncoder.encode(registerDto.getPassword()));
        user.setDeleted(false);
        user.setUserName(registerDto.getUserName());
        return  modelMapper.map(userRepository.save(user),UserResponseDto.class);
    }

    public UserResponseDto updateUser(UserUpdateRequestDto  updateRequest){
        User user=new User();

        return  modelMapper.map(userRepository.save(user),UserResponseDto.class);
    }

}
