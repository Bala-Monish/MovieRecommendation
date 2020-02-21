package com.example.ZuulServer;

public class SecurityConstants {
    public static final String SECRET = "yourStrong(!)Password1";
    public static final int EXPIRATION_TIME = 300000;
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/mrs/registration/user";
}