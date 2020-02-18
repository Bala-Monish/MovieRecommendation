package com.example.MovieRecommendation.api.movies.MoviesAPIService.services;

import com.example.MovieRecommendation.api.movies.MoviesAPIService.data.MovieRepository;
import com.example.MovieRecommendation.api.movies.MoviesAPIService.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}