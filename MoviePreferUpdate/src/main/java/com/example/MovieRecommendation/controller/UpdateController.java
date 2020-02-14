package com.example.MovieRecommendation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MovieRecommendation.model.MovieGenre;
import com.example.MovieRecommendation.model.UserDetails;
//import com.example.MovieRecommendation.model.UserPrefer;
import com.example.MovieRecommendation.service.UpdatePreferService;

@RestController
@RequestMapping(value = "/user")
public class UpdateController {
	
	@Autowired
	private UpdatePreferService updatePreSer;
	
	@GetMapping(value = "/{user_id}")
	public MovieGenre[] getById(@PathVariable("user_id") Integer id) {
		return updatePreSer.findById(id);
	}
	
	@PutMapping(value = "/{user_id}")
	public void updateById(@PathVariable Integer id, @RequestBody MovieGenre[] genres) {
		updatePreSer.updateById(id, genres);
	}
}
