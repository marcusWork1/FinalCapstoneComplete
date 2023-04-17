package com.techelevator.dao;


import com.techelevator.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JDBCMovieDAO implements MovieDAO {

    private final JdbcTemplate jdbcTemplate;

    public JDBCMovieDAO(DataSource datasource){
        this.jdbcTemplate = new JdbcTemplate(datasource);
    }

    @Override
    public Movie getMovie(int movieId) {
        Movie movie = null;
        String sql = "SELECT movie_id, title, release_date, overview, genre, adult_only, popularity" +
                "FROM movie" + "WHERE movie_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, movieId);
        if (results.next()){
            movie = mapRowToMovie(results);
        }
        return movie;
    }

    @Override
    public Movie getMovieByTitle(String title) {
        Movie movieBytitle = null;
        String sql = "SELECT movie_id, title, release_date, overview, genre, adult_only, popularity" +
                "FROM movie" + "WHERE title = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, title);
        if (results.next()){
            movieBytitle = mapRowToMovie(results);
        }
        return movieBytitle;
    }

    @Override
    public List<Movie> getMovies() {
        List<Movie> movies = new ArrayList();
        SqlRowSet results = jdbcTemplate.queryForRowSet("SELECT title FROM movie;");
        while (results.next()) {
            movies.add(mapRowToMovie(results));
        }
        return movies;
    }

    private Movie mapRowToMovie(SqlRowSet rowSet){
        Movie movie = new Movie();
        movie.setMovieId(rowSet.getInt("movie_id"));
        movie.setTitle(rowSet.getString("title"));
        movie.setReleaseDate(rowSet.getDate("release_date"));
        movie.setOverview(rowSet.getString("overview"));
        movie.setGenre(rowSet.getString("genre"));
        movie.setAdultOnly(rowSet.getBoolean("adult_only"));
        movie.setPopularity(rowSet.getInt("popularity"));
        return movie;
    }
} // End of JDBCMovieDAO