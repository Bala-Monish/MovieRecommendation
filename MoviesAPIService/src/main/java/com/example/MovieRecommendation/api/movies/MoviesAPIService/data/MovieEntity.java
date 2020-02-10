package com.example.MovieRecommendation.api.movies.MoviesAPIService.data;

import com.example.MovieRecommendation.api.movies.MoviesAPIService.model.Genre;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "movie")
public class MovieEntity implements Serializable {
    private static final long serialVersionUID = 4522931824413280088L;
    @Id
    @GeneratedValue
    private long movie_id;
    private String movie_name;
    private String cast;
    private String description;
    private String image_link;
    private Genre genre_id;

    public long getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(long movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    public Genre getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(Genre genre_id) {
        this.genre_id = genre_id;
    }
}