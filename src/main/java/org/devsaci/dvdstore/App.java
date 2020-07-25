package org.devsaci.dvdstore;

import org.devsaci.dvdstore.entity.Movie;
import org.devsaci.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * Management Movie
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "What is the movie title?" );
        Scanner sc=new Scanner(System.in);
        String tille=sc.nextLine();
        System.out.println( "What is the movie genre?" );
        String genre=sc.nextLine();
        Movie movie=new Movie();
        movie.setTitle(tille);
        movie.setGenre(genre);
        MovieService movieService=new MovieService();
        movieService.registrationMovie(movie);



    }
}
