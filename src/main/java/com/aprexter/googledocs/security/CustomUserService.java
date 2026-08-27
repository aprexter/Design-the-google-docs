package com.aprexter.googledocs.security;

import com.aprexter.googledocs.models.User;
import com.aprexter.googledocs.repositry.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserService implements UserDetailsService {

    private UserRepository  userRepository;

    public CustomUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username).orElseThrow(
                () ->
                        new UsernameNotFoundException("UserName not found with this : " + username));



        return new UserDetail(user);
    }
}
