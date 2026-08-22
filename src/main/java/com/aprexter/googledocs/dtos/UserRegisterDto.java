package com.aprexter.googledocs.dtos;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.bridge.IMessage;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@Getter
@Setter
public class UserRegisterDto {
    @NotBlank(message = "Name can't be Blank or Empty")
    @Size(min=3,max=30, message = "Name must be larger and Smaller than 3 and 30")
    private String userName;
    @NotBlank(message = "Password can't be Blank or Empty")
    @Size(min=5,max=30,message = "Password must be between 5 and 30")
    private String password;
    @Email(message = "Write Email in correct form")
    private String email;
}
