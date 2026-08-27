package com.aprexter.googledocs.security;

import com.aprexter.googledocs.dtos.LoginRequestDto;
import com.aprexter.googledocs.dtos.UserResponseDto;
import com.aprexter.googledocs.models.User;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    public AuthService(AuthenticationManager authenticationManager,JwtService jwtService){
        this.authenticationManager=authenticationManager;
        this.jwtService=jwtService;
    }

    public UserResponseDto login(LoginRequestDto loginRequestDto) {
        Authentication requestAuthentication=new UsernamePasswordAuthenticationToken(loginRequestDto.getEmail(),loginRequestDto.getPassword());
        Authentication responsePrincipal=authenticationManager.authenticate(requestAuthentication);
        User user=(User)responsePrincipal.getPrincipal();
        String token=jwtService.generateToken(responsePrincipal);
        return new UserResponseDto(token);
    }
}
