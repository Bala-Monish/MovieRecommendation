package com.example.MovieRecommendation.api.movies.MoviesAPIService.controllers;

import com.example.MovieRecommendation.api.movies.MoviesAPIService.model.Movie;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MoviesController {
    @GetMapping("/status/check")
    public String status() {
        return "working";
    }

    @PostMapping
    public String createMovie(@RequestBody Movie movie) {
        return "";
    }
}