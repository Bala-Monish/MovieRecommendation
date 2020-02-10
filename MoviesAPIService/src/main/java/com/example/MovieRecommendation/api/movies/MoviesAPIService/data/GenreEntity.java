package com.example.MovieRecommendation.api.movies.MoviesAPIService.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "genre")
public class GenreEntity implements Serializable {
    private static final long serialVersionUID = -785807813274624999L;
    @Id
    private int genre_id;
    private String genre_name;

    public int getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(int genre_id) {
        this.genre_id = genre_id;
    }

    public String getGenre_name() {
        return genre_name;
    }

    public void setGenre_name(String genre_name) {
        this.genre_name = genre_name;
    }
}
