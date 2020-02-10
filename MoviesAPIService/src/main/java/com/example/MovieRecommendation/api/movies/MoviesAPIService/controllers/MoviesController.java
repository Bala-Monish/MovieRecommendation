package com.example.MovieRecommendation.api.movies.MoviesAPIService.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MoviesController {
    @GetMapping("/status/check")
    public String status() {
        return "working";
    }
}