package movie.recommendation.loginController;


import java.util.List;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import movie.recommendation.loginModel.Users;
import movie.recommendation.loginRepository.UsersRepository;

@RestController
@RequestMapping("/users")
public class UsersController {
  @Autowired
  private UsersRepository repository;
  private Users loggedUser;
  
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<Users> getAllUsers() {
    return repository.findAll();
  }
  

   
 
  
  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public Users loginUser(@Valid @RequestBody Users user) {
	  String enteredEmail = user.getEmail();
	  String enteredPassword = user.getPassword();
	  System.out.println("login");
	  try {
		  Users userFound = repository.findByemail(enteredEmail);
		  String passwordFound = userFound.getPassword();
		  System.out.println(passwordFound);
		  if (passwordFound.equals(enteredPassword)) {
			  loggedUser = user;
			 System.out.println("login successful"+userFound);
			  return userFound;
		  }
		  return null;
	  }
	  catch (NullPointerException e) {
		  return null;
	  }
  }
  

}