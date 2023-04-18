package com.techelevator.controller.capstone;

import com.techelevator.dao.FavoriteListDAO;
import com.techelevator.dao.MovieDAO;
import com.techelevator.model.FavoriteList;
import com.techelevator.model.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@PreAuthorize("isAuthenticated()") // All users must be authenticated to access (comment out for testing)
@RestController
public class FavoriteListController {

    private FavoriteListDAO favoriteListDAO;

    public FavoriteListController(FavoriteListDAO aFavoriteDao) {
        this.favoriteListDAO = aFavoriteDao;
    }

    // Need a post to handle the path from Vue database service with status created
    // use the create method that laura creates
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path="/favorite" , method = RequestMethod.POST)
    public FavoriteList favorite(@Valid @RequestBody FavoriteList favMovie) {
        return favoriteListDAO.addFavorite(favMovie);
    }
}
