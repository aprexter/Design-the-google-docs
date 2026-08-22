package com.aprexter.googledocs.security;

import com.aprexter.googledocs.repositry.UserRepository;
import org.hibernate.boot.model.naming.ImplicitEntityNameSource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class ImplementUserservice implements UserDetailsService {

    private UserRepository  userRepository;

    public ImplementUserservice(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
