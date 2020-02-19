package com.example.MovieRecommendation.api.movies.MoviesAPIService.services;

import com.example.MovieRecommendation.api.movies.MoviesAPIService.model.Genre;
import java.util.List;

public interface GenreService {
    List<Genre> findAll();
}