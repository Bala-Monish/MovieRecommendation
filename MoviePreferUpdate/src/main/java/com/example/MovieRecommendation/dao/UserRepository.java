package com.example.MovieRecommendation.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.MovieRecommendation.model.UserDetails;

public interface UserRepository extends CrudRepository<UserDetails, Integer> {

}
