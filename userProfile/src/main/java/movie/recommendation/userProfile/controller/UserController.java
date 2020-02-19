package movie.recommendation.userProfile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import movie.recommendation.userProfile.model.User;
import movie.recommendation.userProfile.repository.UserRepository;



@RestController
@RequestMapping(value = "/user")
public class UserController {
	//@Autowired
	// private UserRepository  userep;
	
	 
	
	  
//	@GetMapping("/{id}")
//	  public User getUserById(@PathVariable("id") String id) {
//		 String url = discoveryClient.getNextServerFromEureka("MoviePreferences", false).getHomePageUrl();
//	        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url).pathSegment("user").pathSegment("user_id")
//	        com.example.userProfile.models.User applicationUser = restTemplate.getForObject(builder.build().toUriString(), MovieGenre[].class);
//
//	  }
	  
	  
}
