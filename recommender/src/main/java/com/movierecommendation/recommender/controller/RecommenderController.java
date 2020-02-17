package com.movierecommendation.recommender.controller;

import java.util.Arrays;
import java.util.stream.Stream;

import com.movierecommendation.recommender.model.Genre;
import com.movierecommendation.recommender.model.Movie;
import com.netflix.discovery.EurekaClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    public Movie[] getRecommendations(Genre[] prefs) {
        Stream<Genre> genres = Arrays.stream(prefs);

        String url = discoveryClient.getNextServerFromEureka("movies-ws", false).getHomePageUrl();
        
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url).pathSegment("movies");

        Movie[] movies = restTemplate.getForObject(builder.build().toUriString(), Movie[].class);

        return Arrays.stream(movies).filter(m -> genres.anyMatch(g -> g.getId() == m.getGenre().getId())).limit(3).toArray(Movie[]::new);
    }

}