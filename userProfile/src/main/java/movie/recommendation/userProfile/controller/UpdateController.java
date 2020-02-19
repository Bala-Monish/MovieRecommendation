package movie.recommendation.userProfile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import movie.recommendation.userProfile.model.UserProfileDetails;
import movie.recommendation.userProfile.service.UserProfileService;

@RestController
@RequestMapping(value = "/user")
public class UpdateController {

	@Autowired
	UserProfileService userProfileService;
	
	// private UpdatePreferService updatePreSer;

	@GetMapping(value = "/{user_id}")
	public UserProfileDetails getById(@PathVariable("user_id") int id) {
		return userProfileService.getUserProfileDetails(id);

	}

//	@PutMapping(value = "/{user_id}")
//	public void updateById(@PathVariable Integer id, @RequestBody MovieGenre[] genres) {
//		updatePreSer.updateById(id, genres);
//		
//		
//		
//		@GetMapping("/{id}")
//		  public User getUserById(@PathVariable("id") String id) {
//			 String url = discoveryClient.getNextServerFromEureka("MoviePreferences", false).getHomePageUrl();
//		        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url).pathSegment("user").pathSegment("user_id")
//		        com.example.userProfile.models.User applicationUser = restTemplate.getForObject(builder.build().toUriString(), MovieGenre[].class);
//
//	}
}
