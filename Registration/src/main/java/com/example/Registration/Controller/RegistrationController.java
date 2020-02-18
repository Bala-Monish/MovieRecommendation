package com.example.Registration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.Registration.Model.UserRegistrationModel;
import com.example.Registration.dao.RegistrationRepository;

@Controller
public class RegistrationController {

	@Autowired
	private RegistrationRepository regrep;
	
	@PostMapping 
	@ResponseStatus(value = HttpStatus.CREATED)
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
}
