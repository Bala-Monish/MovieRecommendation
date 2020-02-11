package com.example.MovieRecommendation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MovieRecommendation.model.UserDetails;
//import com.example.MovieRecommendation.model.UserPrefer;
import com.example.MovieRecommendation.service.UpdatePreferService;

@RestController
@RequestMapping(value = "/update")
public class UpdateController {
	
	@Autowired
	private UpdatePreferService updatePreSer;
	
	@GetMapping(value = "/{user_id}")
	public UserDetails getById(@PathVariable("user_id") Integer id){
		return updatePreSer.findUserById(id);
	}
	
	@PutMapping(value = "/userid/{user_id}")
	public UserDetails updateById(@RequestBody UserDetails usPref) {
		updatePreSer.updateById(usPref);
		return usPref;
	}
}
