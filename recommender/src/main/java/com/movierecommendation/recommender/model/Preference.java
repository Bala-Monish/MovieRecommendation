package com.movierecommendation.recommender.model;

public class Preference {
    private Genre[] userPreferences;
    private Movie[] movies;

    public Genre[] getUserPreferences() {
        return userPreferences;
    }

    public void setUserPreferences(Genre[] userPreferences) {
        this.userPreferences = userPreferences;
    }

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }
}