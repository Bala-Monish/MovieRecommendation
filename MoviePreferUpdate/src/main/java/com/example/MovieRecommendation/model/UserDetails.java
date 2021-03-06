package com.example.MovieRecommendation.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserDetails {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "user_id")
	 private int id;
	 
	 @Column(name = "first_name")
	 private String firstName;
	 
	 @Column(name = "last_name")
	 private String lastName;
	 
	 @Column(name = "email")
	 private String email;
	 
	 @Column(name = "password")
	 private String password;
	 
	 @ManyToMany
	 @JoinTable(name = "user_genre", joinColumns = { @JoinColumn(name = "user_id") },
	            inverseJoinColumns = { @JoinColumn(name = "genre_id") })
	 private Set<MovieGenre> genre = new HashSet<>();



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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	 
	public Set<MovieGenre> getGenre() {
		return genre;
	}
	
	public void setGenre(Set<MovieGenre> genre) {
		this.genre = genre;
	}

}
