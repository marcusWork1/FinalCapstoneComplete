package com.techelevator.controller.capstone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    private MovieDAO movieDAO;

    public MovieController(MovieDAO aMovieDao) {
        this.movieDAO = aMovieDao;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET){

    }

}
