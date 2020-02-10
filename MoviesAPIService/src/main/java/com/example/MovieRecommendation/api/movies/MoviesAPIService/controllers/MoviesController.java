package com.example.MovieRecommendation.api.movies.MoviesAPIService.controllers;

import com.example.MovieRecommendation.api.movies.MoviesAPIService.model.Movie;
import com.example.MovieRecommendation.api.movies.MoviesAPIService.services.MovieService;
import com.example.MovieRecommendation.api.movies.MoviesAPIService.shared.MovieDTO;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MoviesController {
    @Autowired
    private Environment env;

    @Autowired
    MovieService movieService;

    @GetMapping("/status/check")
    public String status() {
        return "working";
    }

    @PostMapping
    public String createMovie(@RequestBody Movie movie) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        MovieDTO movieDTO = modelMapper.map(movie, MovieDTO.class);
        movieService.createMovie(movieDTO);
        return "create called";
    }
}