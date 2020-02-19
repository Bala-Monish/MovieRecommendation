package movie.recommendation.userProfile.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
	
	public UserProfileDetails getUserProfileDetails(int id)
	{
		UserProfileDetails userProfileDetails = new UserProfileDetails();
		UserDetails user=userRepository.findByid(id);
		MovieGenre[] response = restTemplate.getForObject("http://MoviePreferences/user/"+String.valueOf(id), MovieGenre[].class);		
		List<String> values= new ArrayList<>();
		for(MovieGenre mg : response)
		{
			values.add(mg.getGenreName());
		}
		
	//userProfileDetails.setMovieGenre(response);
		userProfileDetails.setFirstName(user.getFirstName());
		userProfileDetails.setLastName(user.getLastName());
		userProfileDetails.setEmail(user.getEmail());
		
		
		userProfileDetails.setMovieGenre(values);
		
		//comment to get data from db 
//		userProfileDetails.setFirstName("ghfdhgs");
//		userProfileDetails.setLastName("ghfhjagsh");
//		userProfileDetails.setEmail("jhadsgh@hdsajkh");
		return userProfileDetails;
	}

}
