package com.example.MovieRecommendation.api.movies.MoviesAPIService.services;

import com.example.MovieRecommendation.api.movies.MoviesAPIService.model.Movie;

import java.util.List;

public interface MovieService {
    Movie createMovie(Movie movie);
    Movie findMovieById(Integer id);
    void updateById(Integer id, Movie movie);
    void deleteById(Integer id);
    List<Movie> findAll();
}