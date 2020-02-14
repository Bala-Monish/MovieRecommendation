package com.example.MovieRecommendation.api.movies.MoviesAPIService.model;

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
public class Movie {
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
    private Genre genre;


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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}

//public class Movie {
//    private long movie_id;
//    private String movie_name;
//    private String cast;
//    private String description;
//    private String image_link;
//    private Genre genre;
//
//    public long getMovie_id() {
//        return movie_id;
//    }
//
//    public void setMovie_id(long movie_id) {
//        this.movie_id = movie_id;
//    }
//
//    public String getMovie_name() {
//        return movie_name;
//    }
//
//    public void setMovie_name(String movie_name) {
//        this.movie_name = movie_name;
//    }
//
//    public String getCast() {
//        return cast;
//    }
//
//    public void setCast(String cast) {
//        this.cast = cast;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getImage_link() {
//        return image_link;
//    }
//
//    public void setImage_link(String image_link) {
//        this.image_link = image_link;
//    }
//
//    public Genre getGenre() {
//        return genre;
//    }
//
//    public void setGenre(Genre genre) {
//        this.genre = genre;
//    }
//}