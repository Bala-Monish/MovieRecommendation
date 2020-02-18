package movie.recommendation.loginController;

import java.util.List;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import movie.recommendation.loginModel.User;
import movie.recommendation.loginRepository.UserRepository;

@RestController
public class UsersController {
  @Autowired
  private UserRepository repository;
  
  @GetMapping("/users")
  public List<User> getAllUsers() {
    return repository.findAll();
  }
  @GetMapping("/user")
  public User getUserByEmail(@RequestParam("email") String email) {
	return repository.findByEmail(email);	
  }
  
  @PostMapping("/login")
  public User loginUser(@Valid @RequestBody User user) {
	  String enteredEmail = user.getEmail();
	  String enteredPassword = user.getPassword();
	  try {
		  User userFound = repository.findByEmail(enteredEmail);
		  String passwordFound = userFound.getPassword();
		  if(passwordFound.equals(enteredPassword)) {
				return userFound;
		  }
		  return null;
	  }
	  catch (NullPointerException e) {
		  e.printStackTrace();
		  return null;
	  }
  }
  

}