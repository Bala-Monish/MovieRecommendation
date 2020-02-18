package com.example.MovieRecommendation.api.movies.MoviesAPIService.controllers;

import com.example.MovieRecommendation.api.movies.MoviesAPIService.model.Movie;
import com.example.MovieRecommendation.api.movies.MoviesAPIService.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MoviesController {
    @Autowired
    MovieService movieService;

    @GetMapping("/status/check")
    public String status() {
        return "working";
    }

    @GetMapping(value = "/{movie_id}")
    public Movie getById(@PathVariable("movie_id") Integer id) {
        return movieService.findMovieById(id);
    }

    @PostMapping
    public String createMovie(@RequestBody Movie movie) {
//        ModelMapper modelMapper = new ModelMapper();
//        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//        Movie movieDTO = modelMapper.map(movie, Movie.class);
//        movieService.createMovie(movie);
        movieService.createMovie(movie);
        return "create called";
    }

    @PutMapping(value = "/{movie_id}")
    public void updateById(@PathVariable Integer id, @RequestBody Movie movie) {
        movieService.updateById(id, movie);
    }
}