package com.movierecommendation.recommender.controller;

import java.util.Arrays;
import java.util.stream.Stream;

import com.movierecommendation.recommender.model.Genre;
import com.movierecommendation.recommender.model.Movie;
import com.movierecommendation.recommender.model.Preference;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommenderController {
    
    @GetMapping("/recommendations")
    public Movie[] getRecommendations(Preference pref) {
        Stream<Genre> genres = Arrays.stream(pref.getUserPreferences());
        Movie[] movies = pref.getMovies();
        
        return Arrays.stream(movies).filter(m -> genres.anyMatch(g -> g.getId() == m.getGenre().getId())).toArray(Movie[]::new);
    }

}