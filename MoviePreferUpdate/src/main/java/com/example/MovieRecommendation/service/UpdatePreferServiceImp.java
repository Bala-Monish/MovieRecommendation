package com.example.MovieRecommendation.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MovieRecommendation.dao.UserRepository;
import com.example.MovieRecommendation.model.UserDetails;

@Service
public class UpdatePreferServiceImp implements UpdatePreferService {
	
	@Autowired
	private UserRepository userRep;
	
//	@Autowired
//	private UserPrefRepository userPref;
	
	@Override
	public UserDetails findUserById(Integer id) {
		return userRep.findById(id).map(u -> {
			UserDetails us = new UserDetails();
			//MovieGenre mg= new MovieGenre();
			us.setId(u.getId());
			us.setFirstName(u.getFirstName());
			us.setLastName(u.getLastName());
			us.setEmail(u.getEmail());
			us.setGenre(u.getGenre());
			return us;
		}).orElse(null);
	}
	
//	@Override
//	public UserDetails findPerfById(Integer id) {
//		return userRep.findById(id).map(u -> {
//			UserPrefer us = new UserPrefer();
//			us.setGenre(u.getGenre());
//			us.setUserDetails(u.getUserDetails());
//			return us;
//		}).orElse(null);
//	}
	
	@Override
	public void updateById(UserDetails userP) {
		UserDetails prefer = new UserDetails();
		prefer.setEmail(userP.getEmail());
		prefer.setGenre(userP.getGenre());
		userRep.save(prefer);
	}

}
