package movie.recommendation.userProfile.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.netflix.discovery.DiscoveryClient;

import movie.recommendation.userProfile.model.MovieGenre;
import movie.recommendation.userProfile.model.UserDetails;
import movie.recommendation.userProfile.model.UserProfileDetails;
import movie.recommendation.userProfile.repository.UserRepository;

@Service
public class UserProfileService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	DiscoveryClient discoveryClient;
	public UserProfileDetails getUserProfileDetails(int id)
	{
		UserProfileDetails userProfileDetails = new UserProfileDetails();
		
		// STEP 1: GET url for movie preferences from Eureka
		 String url = discoveryClient.getNextServerFromEureka("MoviePreferences", false).getHomePageUrl();
		 // STEP 2.1: Use the homepage URL to create the complete URL with the /user/1
		 UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url).pathSegment("user").pathSegment(String.valueOf(id));
		 // STEP 2.2: Use the complete url to make a request to MoviePreferences service using RestTemplate
		 MovieGenre[]  genres = restTemplate.getForObject(builder.build().toUriString(), MovieGenre[].class);
	
		 // STEP 3: Find the user with id using Repository - this user is missing genre information
		UserDetails user=userRepository.findByid(id);
		
		// STEP 4: Convert from UserDetails to UserProfileDetails
		userProfileDetails.setFirstName(user.getFirstName());
		userProfileDetails.setLastName(user.getLastName());
		userProfileDetails.setEmail(user.getEmail());
		
		// STEP 5: Set the genre information for the user obtained from MoviePreference service
		userProfileDetails.setMovieGenre(genres);

		return userProfileDetails;
	}

}
