package com.example.MovieRecommendation.api.movies.MoviesAPIService.controllers;

import com.example.MovieRecommendation.api.movies.MoviesAPIService.model.Movie;
import com.example.MovieRecommendation.api.movies.MoviesAPIService.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesController {
    @Autowired
    MovieService movieService;

    @GetMapping("/")
    public List<Movie> findAll() {
        return movieService.findAll();
    }

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
        movieService.createMovie(movie);
        return "create called";
    }

    @PutMapping(value = "/{movie_id}")
    public void updateById(@PathVariable Integer movie_id, @RequestBody Movie movie) {
        movieService.updateById(movie_id, movie);
    }

    @DeleteMapping(value = "/{movie_id}")
    public void deleteById(@PathVariable Integer movie_id) {
        movieService.deleteById(movie_id);
    }
}