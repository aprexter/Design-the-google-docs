package com.aprexter.googledocs.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateRequestDto {
    @NotBlank(message = "Password can't be Blank or Empty")
    @Size(min=5,max=30,message = "Password must be between 5 and 30")
    private String oldPassword;
    @NotBlank(message = "New Password can't be Blank or Empty")
    @Size(min=5,max=30,message = "Password must be between 5 and 30")
    private String newPassword;

}
