package org.fasttrackit.curs11homework.security;

import lombok.RequiredArgsConstructor;
import org.fasttrackit.curs11homework.repository.MyUserDepository;
import org.fasttrackit.curs11homework.security.model.MyUserDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {

    private final MyUserDepository repository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByUsername(username)
                .map(myUser -> new MyUserDetails(myUser.username(),myUser.password(),myUser.roles()))
                .orElseThrow(()-> new UsernameNotFoundException("Invalid credentials"));
    }
}
