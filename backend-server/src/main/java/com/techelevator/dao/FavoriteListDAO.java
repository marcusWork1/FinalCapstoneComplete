package com.techelevator.dao;

import com.techelevator.model.FavoriteList;

public interface FavoriteListDAO {

    FavoriteList getList(int favoriteId);

    FavoriteList getListByAccountId(int accountId);

    FavoriteList addFavorite(FavoriteList aFavorite);


} // End of FavoriteListDAO
