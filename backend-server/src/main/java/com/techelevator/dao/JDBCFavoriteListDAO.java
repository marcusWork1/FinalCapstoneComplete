package com.techelevator.dao;

import com.techelevator.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;
import com.techelevator.model.Favorite;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

@Component
public class JDBCFavoriteListDAO implements FavoriteDAO {

    private final JdbcTemplate jdbcTemplate;

    public JDBCFavoriteListDAO(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Favorite> allFavorites() {

        List<Favorite> favorites = new ArrayList();
        SqlRowSet results = jdbcTemplate.queryForRowSet("SELECT movie_id FROM favorite_list WHERE account_id = ?;");
        while (results.next()) {
            favorites.add(mapRowToFav(results));
        }
        return favorites;
    }

    @Override
    public Favorite getFavorite(int account_id) {
        Favorite fav = null;
        String sql = "SELECT * " + "FROM favorite_list " + "WHERE account_id = ?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, account_id);
        if (results.next()) {
            fav = mapRowToFav(results);
        }
        return fav;
    }

    @Override
    public void  addFavorite(Favorite aFavorite) {
        String sql = "INSERT into favorite_list (account_id, movie_id) " +
                "VALUES (?,?);";

         jdbcTemplate.update(sql, aFavorite.getAccount_id(), aFavorite.getMovie_id());

    }

    private Favorite mapRowToFav(SqlRowSet rowSet) {
        Favorite favorite = new Favorite();
        favorite.setMovie_id(rowSet.getInt("movie_id"));
        favorite.setAccount_id(rowSet.getInt("account_id"));

        return favorite;
    }
}