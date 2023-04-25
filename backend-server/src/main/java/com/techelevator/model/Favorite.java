package com.techelevator.model;

public class Favorite {

    private int account_id;
    private int movie_id;

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    @Override
    public String toString() {
        return "Favorite{" +
                "account_id=" + account_id +
                ", movie_id=" + movie_id +
                '}';
    }
}
