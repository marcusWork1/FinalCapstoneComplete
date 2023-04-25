package com.techelevator.dao;

import com.techelevator.model.Account;
import com.techelevator.model.Favorite;

import java.util.List;

public interface FavoriteDAO {

    List<Favorite> allFavorites();

    Favorite getFavorite(int account_id);

    void addFavorite(Favorite aFavorite);

}
