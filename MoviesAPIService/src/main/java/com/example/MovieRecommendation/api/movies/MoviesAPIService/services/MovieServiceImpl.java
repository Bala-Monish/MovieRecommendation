package com.example.MovieRecommendation.api.movies.MoviesAPIService.services;

import com.example.MovieRecommendation.api.movies.MoviesAPIService.data.MovieRepository;
import com.example.MovieRecommendation.api.movies.MoviesAPIService.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {
    MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie createMovie(Movie movie) {
//        ModelMapper modelMapper = new ModelMapper();
//        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//        Movie movieEntity = modelMapper.map(movie, Movie.class);
//        movieRepository.save(movieEntity);
        movieRepository.save(movie);
        return null;
    }

    @Override
    public Movie findMovieById(Integer id) {
        return movieRepository.findById(id).map(m -> {
            Movie mov = new Movie();
            mov.setId(m.getId());
            mov.setCast(m.getCast());
            mov.setDescription(m.getDescription());
            mov.setGenre(m.getGenre());
            mov.setTitle(m.getTitle());
            mov.setImageURL(m.getImageURL());
            return mov;
        }).orElse(null);
    }

    @Override
    public void updateById(Integer id, Movie movie) {
        Optional<Movie> m = movieRepository.findById(id);
        if(m.isPresent()) {
            Movie thisMovie = m.get();
            thisMovie.setImageURL(movie.getImageURL());
            thisMovie.setTitle(movie.getTitle());
            thisMovie.setGenre(movie.getGenre());
            thisMovie.setDescription(movie.getDescription());
            thisMovie.setCast(movie.getCast());
            movieRepository.save(thisMovie);
        }
    }

    @Override
    public void deleteById(Integer id) {
        Optional<Movie> m = movieRepository.findById(id);
        if(m.isPresent()) {
            movieRepository.deleteById(id);
        }
    }

    @Override
    public List<Movie> findAll() {
         List<Movie> movies = new ArrayList<Movie>();
        Iterable<Movie> movieIterable = movieRepository.findAll();
        Iterator<Movie> movieCursor = movieIterable.iterator();
        while(movieCursor.hasNext()) {
            Movie movie = movieCursor.next();
            movies.add(movie);
        }
        return movies;
    }
}