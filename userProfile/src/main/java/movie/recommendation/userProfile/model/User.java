package movie.recommendation.userProfile.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {
	
	@Id
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String firstName;
	private String lastName;
	private String email;
	@Transient
	private MovieGenre[];
	
	public String getFirstname() {
		return firstName;
	}
	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}
	public String getLastname() {
		return lastName;
	}
	public void setLastname(String lastname) {
		this.lastName = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
