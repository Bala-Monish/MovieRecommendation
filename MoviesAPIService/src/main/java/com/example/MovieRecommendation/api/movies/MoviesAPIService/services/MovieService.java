package com.example.MovieRecommendation.api.movies.MoviesAPIService.services;

import com.example.MovieRecommendation.api.movies.MoviesAPIService.model.Movie;

public interface MovieService {
    Movie createMovie(Movie movie);
    Movie findMovieById(Integer id);
    void updateById(Integer id, Movie movie);
}