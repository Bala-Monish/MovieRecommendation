package movie.recommendation.userProfile.model;

import java.util.Arrays;
import java.util.List;

public class UserProfileDetails {
	

	 private String firstName;
	 

	 private String lastName;

	private String email;
	//array 
	// private MovieGenre[] movieGenre;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
// for array id and genre name
//	@Override
//	public String toString() {
//		return "UserProfileDetails [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
//				+ ", movieGenre=" + Arrays.toString(movieGenre) + "]";
//	}
//
//	public MovieGenre[] getMovieGenre() {
//		return movieGenre;
//	}
//
//	public void setMovieGenre(MovieGenre[] movieGenre) {
//		this.movieGenre = movieGenre;
//	}

	
	//gnre name 
	 private List<String> movieGenre;

	public List<String> getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(List<String> movieGenre) {
		this.movieGenre = movieGenre;
	}

	@Override
	public String toString() {
		return "UserProfileDetails [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", movieGenre=" + movieGenre + "]";
	}
	 
}
