package com.example.MovieRecommendation.api.movies.MoviesAPIService.controllers;

import com.example.MovieRecommendation.api.movies.MoviesAPIService.model.Genre;
import com.example.MovieRecommendation.api.movies.MoviesAPIService.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/genres")
public class GenresController {
    @Autowired
    GenreService genreService;

    @GetMapping("/")
    public List<Genre> findAll() {
        return genreService.findAll();
    }
}