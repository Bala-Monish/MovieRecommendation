package com.example.MovieRecommendation.service;

import com.example.MovieRecommendation.model.MovieGenre;

public interface UpdatePreferService {

	MovieGenre[] findById(Integer id);
	
//	UserDetails findPerfById(Integer id);
	
	void updateById(Integer id, MovieGenre[] genres);

}
