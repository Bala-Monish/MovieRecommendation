package com.example.MovieRecommendation.api.movies.MoviesAPIService.services;

import com.example.MovieRecommendation.api.movies.MoviesAPIService.shared.MovieDTO;

public interface MovieService {
    MovieDTO createMovie(MovieDTO movie);
}