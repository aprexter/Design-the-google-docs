package com.aprexter.googledocs.service;

import com.aprexter.googledocs.dtos.UserRegisterDto;
import com.aprexter.googledocs.dtos.UserResponseDto;
import com.aprexter.googledocs.dtos.UserUpdateRequestDto;
import com.aprexter.googledocs.models.User;
import com.aprexter.googledocs.repositry.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    private ModelMapper modelMapper;
    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }
    public UserResponseDto addUser(UserRegisterDto registerDto){

        User user=modelMapper.map(registerDto,User.class);
        user.setDeleted(false);
        return  modelMapper.map(userRepository.save(user),UserResponseDto.class);
    }

    public UserResponseDto updateUser(UserUpdateRequestDto  updateRequest){
        User user=new User();
        if(updateRequest.getName()!=null){

        }
        return  modelMapper.map(userRepository.save(user),UserResponseDto.class);
    }

}
