package com.example.MovieRecommendation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class MovieDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movie_id")
    private int id;
    
    @Column(name = "movie_name")
    private String title;
    
    @Column(name = "cast")
    private String cast;

    @Column(name = "description")
    private String description;

	@Column(name = "image_link")
    private String imageURL;
    
    @ManyToOne
    @JoinColumn(name = "id_genre")
    private MovieGenre genre;


	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getCast() {
    	return cast;
    }
    
    public void setCast(String cast) {
    	this.cast = cast;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
    
    public MovieGenre getGenre() {
    	return genre;
    }
    
    public void setGenre(MovieGenre genre) {
    	this.genre = genre;
    }
}
