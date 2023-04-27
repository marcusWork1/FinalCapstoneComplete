package com.techelevator.controller.capstone;

import com.techelevator.dao.FavoriteDAO;
import com.techelevator.generalpurposelogger.APILogger;
import com.techelevator.model.Favorite;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
//@PreAuthorize("isAuthenticated()") // All users must be authenticated to access (comment out for testing)
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
        APILogger.logAPICall("POST for path  /favorite_list/" + "id" + " Successfully added to Favorites");
        favoriteDAO.addFavorite(favMovie);

    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path="/favorite_list/{account_id}" , method = RequestMethod.GET)
    public Favorite[] favoriteMovies(@PathVariable int account_id) {
        return favoriteDAO.allFavorites(account_id);
    }

  @ResponseStatus(HttpStatus.OK)
   @RequestMapping(path="/favorite_list/{id}&{movie_id}", method = RequestMethod.DELETE)
    public void deleteFavorite(@PathVariable int id, @PathVariable int movie_id){

       APILogger.logAPICall("DELETE for path /favorite_list/" + id + "&" + movie_id );

       favoriteDAO.deleteFavorite(id,movie_id);
   } 
   // getting error when testing in postman:
   //[org.springframework.web.HttpRequestMethodNotSupportedException: Request method 'DELETE' not supported]

//    @ResponseStatus(HttpStatus.ACCEPTED)
//    @Re
}
/*
 @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path="/favorite_list/{id}" , method = RequestMethod.GET)
    public List<Favorite> favoriteMovies( @RequestParam int id) {
        return favoriteDAO.allFavorites(id);
    }

}
 */
