package com.techelevator.dao;

import com.techelevator.model.Favorite;

public interface FavoriteDAO {

    Object[] allFavorites(int id);

//    Favorite getFavorite(int account_id);

    void addFavorite(Favorite aFavorite);

}
