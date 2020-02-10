package com.example.MovieRecommendation.api.movies.MoviesAPIService.data;

import com.example.MovieRecommendation.api.movies.MoviesAPIService.model.Genre;

import java.io.Serializable;

public class MovieEntity implements Serializable {
    private static final long serialVersionUID = 4522931824413280088L;
    private long movie_id;
    private String movie_name;
    private String cast;
    private String description;
    private String image_link;
    private Genre genre_id;
}
