package com.example.MovieRecommendation.api.movies.MoviesAPIService.services;

import com.example.MovieRecommendation.api.movies.MoviesAPIService.data.MovieRepository;
import com.example.MovieRecommendation.api.movies.MoviesAPIService.model.Movie;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie createMovie(Movie movie) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Movie movieEntity = modelMapper.map(movie, Movie.class);
        movieRepository.save(movieEntity);
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
}