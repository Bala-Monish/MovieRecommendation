package com.example.MovieRecommendation.api.movies.MoviesAPIService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MoviesApiServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(MoviesApiServiceApplication.class, args);
	}
}