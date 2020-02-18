package com.example.Registration.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserRegistrationModel {
	
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private MovieGenre[] genres;

	public MovieGenre[] getGenres() {
		return genres;
	}
	
	public void setGenres(MovieGenre[] genres) {
		this.genres = genres;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailId() {
		return email;
	}

	public void setEmailId(String emailId) {
		email = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
