package com.example.MovieRecommendation.api.movies.MoviesAPIService.data;

import org.springframework.data.repository.CrudRepository;
import com.example.MovieRecommendation.api.movies.MoviesAPIService.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer> {
}