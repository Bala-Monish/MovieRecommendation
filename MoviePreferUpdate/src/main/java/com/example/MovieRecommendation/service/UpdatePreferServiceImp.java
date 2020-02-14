package com.example.MovieRecommendation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MovieRecommendation.dao.UserRepository;
import com.example.MovieRecommendation.model.MovieGenre;
import com.example.MovieRecommendation.model.UserDetails;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UpdatePreferServiceImp implements UpdatePreferService {
	
	@Autowired
	private UserRepository userRep;
	
//	@Autowired
//	private UserPrefRepository userPref;
	
	@Override
	public MovieGenre[] findById(Integer id) {
		return userRep.findById(id).map(u -> {
			Set<MovieGenre> genres = u.getGenre();
			return genres.toArray(new MovieGenre[genres.size()]);
		}).orElse(null);
	}

	@Override
	public void updateById(Integer id, MovieGenre[] genres) {
		Optional<UserDetails> u = userRep.findById(id);
		if(u.isPresent()) {
			UserDetails user = u.get();
			Set<MovieGenre> prefs = new HashSet<MovieGenre>(Arrays.asList(genres));
			user.setGenre(prefs);
			userRep.save(user);
		}
	}
}
