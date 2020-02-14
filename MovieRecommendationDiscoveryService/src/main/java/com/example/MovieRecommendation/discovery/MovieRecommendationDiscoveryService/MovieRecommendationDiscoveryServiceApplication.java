package com.example.MovieRecommendation.discovery.MovieRecommendationDiscoveryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MovieRecommendationDiscoveryServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(MovieRecommendationDiscoveryServiceApplication.class, args);
	}
}