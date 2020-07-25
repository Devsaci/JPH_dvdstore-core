package org.devsaci.dvdstore.service;

import org.devsaci.dvdstore.entity.Movie;
import org.devsaci.dvdstore.repository.MovieRepository;

public class MovieService {
    private MovieRepository movieRepository=new MovieRepository();
    public  void registrationMovie(Movie movie){
    movieRepository.add(movie);
    }
}
