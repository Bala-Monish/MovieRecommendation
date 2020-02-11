package com.example.MovieRecommendation.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.MovieRecommendation.model.MovieDetails;

public interface MovieRepository extends CrudRepository<MovieDetails, Integer> {

}