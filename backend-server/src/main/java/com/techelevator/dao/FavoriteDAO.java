package com.techelevator.dao;

import com.techelevator.model.Favorite;

public interface FavoriteDAO {

   Favorite[] allFavorites(int id);

//    Favorite getFavorite(int account_id);

    void addFavorite(Favorite aFavorite);

    void deleteFavorite(int id, int movie_id);
}

