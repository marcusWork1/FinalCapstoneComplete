package com.techelevator.controller.capstone;

import com.techelevator.dao.FavoriteDAO;
import com.techelevator.dao.MovieDAO;
import com.techelevator.model.Account;
import com.techelevator.model.Favorite;
import com.techelevator.model.Favorite;
import com.techelevator.model.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@PreAuthorize("isAuthenticated()") // All users must be authenticated to access (comment out for testing)
@RestController
public class FavoriteListController {

    private FavoriteDAO favoriteDAO;

    public FavoriteListController(FavoriteDAO aFavoriteDao) {
        this.favoriteDAO = aFavoriteDao;
    }

    // Need a post to handle the path from Vue database service with status created
    // use the create method that laura creates
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path="/favorite_list" , method = RequestMethod.POST)
    public void createFavorite(@Valid @RequestBody Favorite favMovie) {

        favoriteDAO.addFavorite(favMovie);

    }


}
