package movie.recommendation.loginController;


import java.util.List;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import movie.recommendation.loginModel.User;
import movie.recommendation.loginRepository.UsersRepository;

@RestController
@RequestMapping("/mrs")
public class UsersController {
  @Autowired
  private UsersRepository repository;
  
  @RequestMapping(value = "/users", method = RequestMethod.GET)
  public List<User> getAllUsers() {
    return repository.findAll();
  }
  
  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public User loginUser(@Valid @RequestBody User user) {
	  String enteredEmail = user.getEmail();
	  String enteredPassword = user.getPassword();
	  try {
		  User userFound = repository.findByemail(enteredEmail);
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