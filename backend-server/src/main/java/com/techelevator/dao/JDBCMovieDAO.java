package com.techelevator.dao;


import com.techelevator.model.FavoriteList;
import com.techelevator.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class JDBCMovieDAO implements MovieDAO {

    private final JdbcTemplate jdbcTemplate;

    public JDBCMovieDAO(DataSource datasource){
        this.jdbcTemplate = new JdbcTemplate(datasource);
    }

    @Override
    public Movie getMovie(int movieId) {
        Movie movie = null;
        String sql = "SELECT movie_id, title, release_date, overview, genre, adult_only, popularity " +
                "FROM movie " + "WHERE movie_id = ?;";
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

    @Override
    public Movie addMovie(Movie aMovie){

            String sql = "INSERT into movie (title, release_date, overview, genre, adult_only, popularity) " +
                          "VALUES (?,?,?,?,?,?) RETURNING movie_id;";
            Integer id = jdbcTemplate.queryForObject(sql, Integer.class, aMovie.getTitle(), aMovie.getRelease_date(),
                 aMovie.getOverview(), aMovie.getGenre(), aMovie.getAdult_only(), aMovie.getPopularity());

            return getMovie(id);
    }
//    @Override
//    public FavoriteList getList(int favoriteId) {
//        FavoriteList list = null;
//        String sql = "SELECT favorite_id, account_id, movie_id" + "FROM favorite_list" + "WHERE favorite_id = ?;";
//        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, favoriteId);
//        if (results.next()){
//            list = mapRowToFavorites(results);
//        }
//        return list;
//    }
//@Override
//public FavoriteList getListByAccountId(int accountId) {
//    FavoriteList list = null;
//    String sql = "SELECT favorite_id, account_id, movie_id" + "FROM favorite_list" + "WHERE account_id = ?;";
//    SqlRowSet results = jdbcTemplate.queryForRowSet(sql, accountId);
//    if (results.next()){
//        list = mapRowToFavorites(results);
//    }
//    return list;
//}
//@Override
    // need inner joins
//public Movie addFavorite(Movie aMovie) {
//    String sql = "INSERT into favorite_list (account_id, movie_id) " +
//            "VALUES (?,?) RETURNING account_id;";
//    Integer id = jdbcTemplate.queryForObject(sql, Integer.class, aMovie.getAccountId, aMovie.getMovieId());
//
//    return addFavorite();
//}


    private Movie mapRowToMovie(SqlRowSet rowSet){
        Movie movie = new Movie();
        movie.setMovieId(rowSet.getInt("movie_id"));
        movie.setTitle(rowSet.getString("title"));
        movie.setRelease_date(rowSet.getDate("release_date"));
        movie.setOverview(rowSet.getString("overview"));
        movie.setGenre(rowSet.getString("genre"));
        movie.setAdult_only(rowSet.getBoolean("adult_only"));
        movie.setPopularity(rowSet.getInt("popularity"));
        return movie;
    }
} // End of JDBCMovieDAO