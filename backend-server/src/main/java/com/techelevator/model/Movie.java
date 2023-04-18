package com.techelevator.model;

import java.util.Date;

public class Movie {

    private int movieId;
    private String title;
    private Date releaseDate;
    private String overview;
    private String genre;
    private Boolean adultOnly;
    private Integer popularity;

    public Movie(int movieId, String title, Date releaseDate, String overview, String genre, Boolean adultOnly, int popularity) {
        this.movieId = movieId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.overview = overview;
        this.genre = genre;
        this.adultOnly = adultOnly;
        this.popularity = popularity;
    }

    public Movie() {

    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Boolean getAdultOnly() {
        return adultOnly;
    }

    public void setAdultOnly(Boolean adultOnly) {
        this.adultOnly = adultOnly;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", overview='" + overview + '\'' +
                ", genre='" + genre + '\'' +
                ", adultOnly=" + adultOnly +
                ", popularity='" + popularity + '\'' +
                '}';
    }
} // End of Movie class
