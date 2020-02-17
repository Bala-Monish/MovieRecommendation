package com.example.MovieRecommendation.api.movies.MoviesAPIService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genre")
public class Genre {
    @Id
    @Column(name = "genre_id")
    private int id;

    @Column(name = "genre_name")
    private String genreName;

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }
}