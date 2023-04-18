package com.techelevator.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Movie {

    private int movieId;
    private String title;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date release_date;
    private String overview;
    private String genre;
    private Boolean adult_only;
    private Integer popularity;

    public Movie(int movieId, String title, Date releaseDate, String overview, String genre, Boolean adultOnly, int popularity) {
        this.movieId = movieId;
        this.title = title;
        this.release_date = releaseDate;
        this.overview = overview;
        this.genre = genre;
        this.adult_only = adultOnly;
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

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
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

    public Boolean getAdult_only() {
        return adult_only;
    }

    public void setAdult_only(Boolean adult_only) {
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
        return "Movie{" +
                "movieId=" + movieId +
                ", title='" + title + '\'' +
                ", releaseDate=" + release_date +
                ", overview='" + overview + '\'' +
                ", genre='" + genre + '\'' +
                ", adultOnly=" + adult_only +
                ", popularity='" + popularity + '\'' +
                '}';
    }
} // End of Movie class
