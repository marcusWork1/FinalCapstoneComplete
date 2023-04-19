package com.techelevator.dao;

import com.techelevator.model.FavoriteList;
import com.techelevator.model.Movie;

import java.util.List;

public interface MovieDAO {

    Movie getMovie(int movieId);

    Movie getMovieByTitle(String title);

    List<Movie> getMovies();

    Movie addMovie(Movie aMovie);

     List<Movie> getList(int accountId);

    Movie addFavorite(int accountId, int movieId);
}
