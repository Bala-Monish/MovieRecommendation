package movie.recommendation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import movie.recommendation.model.User;
import movie.recommendation.repository.UserRepository;



@RestController
@RequestMapping("/mrs/users")
public class UserController {
	@Autowired
	 private UserRepository  userep;
	
	 
	
	  
	@GetMapping("/{id}")
	  public User getUserById(@PathVariable("id") String id) {
	    return userep.findByid(id);
	  }
	  
	  
}
