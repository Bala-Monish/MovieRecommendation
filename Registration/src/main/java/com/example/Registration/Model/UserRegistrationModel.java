package com.example.Registration.Model;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;

public class UserRegistrationModel {
	
	@Id
	private String id;
	private String FirstName;
	private String EmailId;
	private String Password;
	private Set<MovieGenre> genre = new HashSet<>();

	

	public Set<MovieGenre> getGenre() {
		return genre;
	}
	
	public void setGenre(Set<MovieGenre> genre) {
		this.genre = genre;
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
