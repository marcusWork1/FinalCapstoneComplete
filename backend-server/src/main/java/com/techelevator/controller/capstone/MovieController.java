package com.techelevator.controller.capstone;

import com.techelevator.dao.MovieDAO;
import com.techelevator.model.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@PreAuthorize("isAuthenticated()") // All users must be authenticated to access (comment out for testing)
@RestController
public class MovieController {

    private MovieDAO movieDAO;

    public MovieController(MovieDAO aMovieDao) {
        this.movieDAO = aMovieDao;
    }

        /**
        * Returns all movies in the system
        *
        * @return all movies
        */
        @ResponseStatus(HttpStatus.ACCEPTED) // 202
        @RequestMapping(path = "/movies", method = RequestMethod.GET) // ask about optional request parameters /movies?genre=comedy
            public List<Movie> allMovies(){
                  return movieDAO.getMovies();
            }


    /**
     * restricted to those in ROLE_ADMIN
     *
     * @param newMovie
     */
        @PreAuthorize("hasRole('ADMIN')") // Only role of ADMIN can access this path
        @ResponseStatus(HttpStatus.CREATED)
        @RequestMapping(path="/movie" , method = RequestMethod.POST)
             public Movie createMovie(@Valid @RequestBody Movie newMovie) {
                 return movieDAO.addMovie(newMovie);
        }



} // End of Movie Controller
