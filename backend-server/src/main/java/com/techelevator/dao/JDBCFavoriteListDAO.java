package com.techelevator.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;
import com.techelevator.model.Favorite;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class JDBCFavoriteListDAO implements FavoriteDAO {

    private final JdbcTemplate jdbcTemplate;

    public JDBCFavoriteListDAO(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

        @Override
        public Object[] allFavorites(int id) {
        //public List<Favorite> allFavorites(int id) {

            List<Favorite> favorites = new ArrayList<>();
            String sql = "SELECT movie_id FROM favorite_list WHERE account_id = ?;"; // test this sql
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
            while (results.next()) {
                favorites.add(mapRowToFav(results));
            }
            return favorites.toArray();
            //return favorites;
        }

        // delete favorite

//    @Override
//    public Favorite getFavorite(int account_id) {
//        Favorite fav = null;
//        String sql = "SELECT * " + "FROM favorite_list " + "WHERE account_id = ?;";
//
//        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, account_id);
//        if (results.next()) {
//            fav = mapRowToFav(results);
//        }
//        return fav;
//    }

    @Override
    public void  addFavorite(Favorite aFavorite) {
        String sql = "INSERT into favorite_list (account_id, movie_id) " +
                "VALUES (?,?);";

         jdbcTemplate.update(sql, aFavorite.getAccount_id(), aFavorite.getMovie_id());

    }

    @Override
    public void deleteFavorite(int id, int movie_id){


    }

    private Favorite mapRowToFav(SqlRowSet rowSet) {
        Favorite favorite = new Favorite();
        favorite.setMovie_id(rowSet.getInt("movie_id"));
        favorite.setAccount_id(rowSet.getInt("account_id"));

        return favorite;
    }
}
