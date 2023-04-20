package com.techelevator.model;

public class Account {

    private int account_id;
    private int user_id;
    private String username;
    private String email_address;
    private String genre;
    private boolean adult_only;
    private int popularity;

    public Account(int account_id, int user_id, String username, String email_address, String genre, boolean adult_only, int popularity) {
        this.account_id = account_id;
        this.user_id = user_id;
        this.username = username;
        this.email_address = email_address;
        this.genre = genre;
        this.adult_only = adult_only;
        this.popularity = popularity;
    }

    public Account() {
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isAdult_only() {
        return adult_only;
    }

    public void setAdult_only(boolean adult_only) {
        this.adult_only = adult_only;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account_id=" + account_id +
                ", user_id=" + user_id +
                ", username='" + username + '\'' +
                ", email_address='" + email_address + '\'' +
                ", genre='" + genre + '\'' +
                ", adult_only=" + adult_only +
                ", popularity=" + popularity +
                '}';
    }
} // End of Account class
