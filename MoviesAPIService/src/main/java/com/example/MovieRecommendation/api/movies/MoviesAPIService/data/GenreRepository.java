package com.example.MovieRecommendation.api.movies.MoviesAPIService.data;

import org.springframework.data.repository.CrudRepository;
import com.example.MovieRecommendation.api.movies.MoviesAPIService.model.Genre;

public interface GenreRepository extends CrudRepository<Genre, Integer> {
}