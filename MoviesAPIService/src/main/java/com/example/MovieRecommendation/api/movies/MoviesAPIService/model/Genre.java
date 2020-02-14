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

//public class Genre {
//    private int genre_id;
//    private String genre_name;
//
//    public int getGenre_id() {
//        return genre_id;
//    }
//
//    public void setGenre_id(int genre_id) {
//        this.genre_id = genre_id;
//    }
//
//    public String getGenre_name() {
//        return genre_name;
//    }
//
//    public void setGenre_name(String genre_name) {
//        this.genre_name = genre_name;
//    }
//}