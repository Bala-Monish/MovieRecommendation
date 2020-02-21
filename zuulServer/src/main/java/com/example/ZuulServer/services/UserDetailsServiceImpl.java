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

import com.netflix.discovery.EurekaClient;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private EurekaClient discoveryClient;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       
        com.example.ZuulServer.models.User applicationUser = getUserFromLoginService(username);

        if (applicationUser == null) {
            throw new UsernameNotFoundException(username);
        }

        return new User(applicationUser.getEmail(), applicationUser.getPassword(), emptyList());
    }
    public com.example.ZuulServer.models.User getUserFromLoginService(String username) {
        String url = discoveryClient.getNextServerFromEureka("loginservice", false).getHomePageUrl();

        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url).pathSegment("user").queryParam("email", username);

        com.example.ZuulServer.models.User applicationUser = restTemplate.getForObject(builder.build().toUriString(), com.example.ZuulServer.models.User.class);
        
        return applicationUser;
    }
}