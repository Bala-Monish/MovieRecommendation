package com.example.MovieRecommendation.api.movies.MoviesAPIService.services;

import com.example.MovieRecommendation.api.movies.MoviesAPIService.data.GenreRepository;
import com.example.MovieRecommendation.api.movies.MoviesAPIService.model.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {
    GenreRepository genreRepository;

    @Autowired
    public GenreServiceImpl(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public List<Genre> findAll() {
        List<Genre> genres = new ArrayList<Genre>();
        Iterable<Genre> genreIterable = genreRepository.findAll();
        Iterator<Genre> genreCursor = genreIterable.iterator();
        while(genreCursor.hasNext()) {
            Genre genre = genreCursor.next();
            genres.add(genre);
        }
        return genres;
    }
}