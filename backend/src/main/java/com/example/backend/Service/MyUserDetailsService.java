package com.example.backend.Service;

import com.example.backend.ApiResponse.ApiException;
import com.example.backend.Model.MyUser;
import com.example.backend.Repository.MyUserRepository;

// import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
// @RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {

    private final MyUserRepository myUserRepository;

      public MyUserDetailsService(MyUserRepository myUserRepository) {
        this.myUserRepository = myUserRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MyUser myUser = myUserRepository.findMyUserByUsername(username);
        if (myUser == null) {
            throw new ApiException("username or password is incorrect");
        }

        return myUser;
    }
}