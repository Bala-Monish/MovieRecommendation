package com.example.Registration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Registration.Model.UserRegistrationModel;
import com.example.Registration.dao.RegistrationRepository;

@Controller
@RequestMapping(path="/mrs")
public class RegistrationController {

	@Autowired
	private RegistrationRepository regrep;
	
	 @PostMapping("/") 
	 		public String save (@RequestBody UserRegistrationModel user) {
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
}
