package com.techelevator.dao;

import com.techelevator.model.Account;
import com.techelevator.model.Favorite;

import java.util.List;

public interface FavoriteDAO {
    void addFavorite(Favorite aFavorite);

    List<Favorite> allFavorites();





}
