package com.aprexter.googledocs.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateRequestDto {
    private String password;
    private String name;

}
