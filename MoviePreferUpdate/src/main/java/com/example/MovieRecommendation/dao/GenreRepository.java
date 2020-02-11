package com.example.MovieRecommendation.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.MovieRecommendation.model.MovieGenre;

public interface GenreRepository extends CrudRepository<MovieGenre, Integer> {

}