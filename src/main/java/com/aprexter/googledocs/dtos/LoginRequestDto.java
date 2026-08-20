package com.aprexter.googledocs.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.service.annotation.GetExchange;

@Getter
@Setter
public class LoginRequestDto {
    @Size(min=5, max=30, message = "Password must be in between 5 and 30")
    private String password;
    @Email(message = "Email must be its form")
    private String email;
}
