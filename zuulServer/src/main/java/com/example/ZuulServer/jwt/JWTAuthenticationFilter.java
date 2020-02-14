package com.example.ZuulServer.jwt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.example.ZuulServer.models.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import static com.auth0.jwt.algorithms.Algorithm.HMAC512;
import static com.example.ZuulServer.SecurityConstants.EXPIRATION_TIME;
import static com.example.ZuulServer.SecurityConstants.SECRET;


public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    AuthenticationManager authenticationManager;
    public JWTAuthenticationFilter(AuthenticationManager authManager) {
        this.authenticationManager = authManager;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res)
            throws AuthenticationException {
      try {
        User u = new ObjectMapper().readValue(req.getInputStream(), User.class);
          
        return authenticationManager.authenticate(
          new UsernamePasswordAuthenticationToken(
                  u.getEmail(),
                  u.getPassword(),
                  new ArrayList<>()));
      }
      catch(IOException e) {
        e.printStackTrace();
        throw new RuntimeException();
      }
    }  

    @Override
    protected void successfulAuthentication(HttpServletRequest req, HttpServletResponse res, FilterChain chain, Authentication auth) throws IOException {
    
      String token = JWT.create()
                        .withSubject(((UserDetails) auth.getPrincipal()).getUsername())
                        .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                        .sign(HMAC512(SECRET.getBytes()));
      res.setContentType("application/json");
      res.getOutputStream().print("\""+token+"\"");      
    }
}
