package com.example.Registration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Registration.Model.UserRegistrationModel;
import com.example.Registration.dao.RegistrationRepository;

@RestController
@RequestMapping(path="/mrs")
public class RegistrationController {

	@Autowired
	private RegistrationRepository regrep;
	
	 @PostMapping("/user") 
	 		public int save (@RequestBody UserRegistrationModel user) {
			regrep.save(user);
			return user.getId();
	 
//	UserRegistrationModel n = new UserRegistrationModel();
//			n.setName(firstName);
//			n.setEmail(emailId);
//			n.setPassword(password);
//			n.setGenre(genre);
//			regrep.save(n);
//			return "Saved";
	 }
		@GetMapping("/status/check")
		public String status() {
			return "working";
		}
}
