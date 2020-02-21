package com.movierecommendation.recommender.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.movierecommendation.recommender.model.Genre;
import com.movierecommendation.recommender.model.Movie;
import com.netflix.discovery.EurekaClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class RecommenderController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    EurekaClient discoveryClient;

    @GetMapping("/recommendations")
    public Movie[] getRecommendations(@RequestParam("prefs") int[] prefs) {
        IntStream userPrefs = IntStream.of(prefs);

        String url = discoveryClient.getNextServerFromEureka("movies-ws", false).getHomePageUrl();
        
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url).pathSegment("genres/");

        Genre[] allGenres = restTemplate.getForObject(builder.build().toUriString(), Genre[].class);
        
        builder = UriComponentsBuilder.fromUriString(url).pathSegment("movies/");

        Movie[] movies = restTemplate.getForObject(builder.build().toUriString(), Movie[].class);
        ArrayList<Movie> result = new ArrayList<Movie>();
        for(Movie movie: movies){
            if(IntStream.of(prefs).anyMatch(p -> p == movie.getGenre().getId()))
                result.add(movie);
        }
        return result.toArray(new Movie[result.size()]);
    }
}