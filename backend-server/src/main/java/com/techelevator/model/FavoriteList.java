package com.techelevator.model;

public class FavoriteList {

    private int favoriteId;
    private int accountId;
    private int movieId;

    public FavoriteList(int favoriteId, int accountId, int movieId) {
        this.favoriteId = favoriteId;
        this.accountId = accountId;
        this.movieId = movieId;
    }

    public FavoriteList() {

    }

    public int getFavoriteId() {
        return favoriteId;
    }

    public void setFavoriteId(int favoriteId) {
        this.favoriteId = favoriteId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    @Override
    public String toString() {
        return "FavoriteList{" +
                "favoriteId=" + favoriteId +
                ", accountId=" + accountId +
                ", movieId=" + movieId +
                '}';
    }
}
