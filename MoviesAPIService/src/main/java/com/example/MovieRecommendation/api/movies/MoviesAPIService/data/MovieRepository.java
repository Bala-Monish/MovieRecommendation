package com.example.MovieRecommendation.api.movies.MoviesAPIService.data;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<MovieEntity, Long> {
}