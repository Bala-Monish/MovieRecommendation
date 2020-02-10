package com.example.MovieRecommendation.api.movies.MoviesAPIService.shared;

import java.io.Serializable;

public class GenreDTO implements Serializable {
    private static final long serialVersionUID = -8791238360361449640L;
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
