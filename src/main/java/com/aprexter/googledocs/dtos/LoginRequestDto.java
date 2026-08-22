package com.aprexter.googledocs.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.service.annotation.GetExchange;

@Getter
@Setter
public class LoginRequestDto {
    @NotBlank(message = "Name can't be Blank or Empty")
    @Size(min=3,max=30, message = "Name must be larger and Smaller than 3 and 30")
    private String userName;
    @NotBlank
    @Size(min=5, max=30, message = "Password must be in between 5 and 30")
    private String password;
    @Email(message = "Email must be its form")
    private String email;
}
