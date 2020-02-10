package com.example.MovieRecommendation.api.movies.MoviesAPIService.services;

import com.example.MovieRecommendation.api.movies.MoviesAPIService.data.MovieEntity;
import com.example.MovieRecommendation.api.movies.MoviesAPIService.data.MovieRepository;
import com.example.MovieRecommendation.api.movies.MoviesAPIService.shared.MovieDTO;
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
    public MovieDTO createMovie(MovieDTO movie) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        MovieEntity movieEntity = modelMapper.map(movie, MovieEntity.class);
        movieRepository.save(movieEntity);
        return null;
    }
}