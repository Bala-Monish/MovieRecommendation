package com.example.ZuulServer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import static java.util.Collections.emptyList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String url = "http://login/mrs/users";
        
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url).queryParam("username", username);

        com.example.ZuulServer.models.User applicationUser = restTemplate.getForObject(builder.build().toUriString(), com.example.ZuulServer.models.User.class);

        if (applicationUser == null) {
            throw new UsernameNotFoundException(username);
        }

        return new User(applicationUser.getEmail(), applicationUser.getPassword(), emptyList());
    }
}