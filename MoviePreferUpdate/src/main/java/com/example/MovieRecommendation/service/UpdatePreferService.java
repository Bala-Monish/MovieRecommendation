package com.example.MovieRecommendation.service;

import com.example.MovieRecommendation.model.UserDetails;
//import com.example.MovieRecommendation.model.UserPrefer;

public interface UpdatePreferService {

	UserDetails findUserById(Integer id);
	
//	UserDetails findPerfById(Integer id);
	
	void updateById(UserDetails userPref);

}
