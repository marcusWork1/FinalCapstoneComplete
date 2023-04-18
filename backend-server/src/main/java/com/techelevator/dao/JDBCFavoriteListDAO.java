package com.techelevator.dao;

import com.techelevator.model.FavoriteList;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;

public class JDBCFavoriteListDAO implements FavoriteListDAO{

    private final JdbcTemplate jdbcTemplate;

    public JDBCFavoriteListDAO(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);}

    public JDBCFavoriteListDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public FavoriteList getList(int favoriteId) {
        FavoriteList list = null;
        String sql = "SELECT favorite_id, account_id, movie_id" + "FROM favorite_list" + "WHERE favorite_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, favoriteId);
        if (results.next()){
            list = mapRowToFavorites(results);
        }
        return list;
    }

    @Override
    public FavoriteList getListByAccountId(int accountId) {
        FavoriteList list = null;
        String sql = "SELECT favorite_id, account_id, movie_id" + "FROM favorite_list" + "WHERE account_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, accountId);
        if (results.next()){
            list = mapRowToFavorites(results);
        }
        return list;
    }

    @Override
    public FavoriteList addFavorite(FavoriteList aFavorite) {
        String sql = "INSERT into favorite_list (account_id, movie_id) " +
                "VALUES (?,?) RETURNING favorite_id;";
        Integer id = jdbcTemplate.queryForObject(sql, Integer.class, aFavorite.getAccountId(), aFavorite.getMovieId());

        return getList(id);
    }

    private FavoriteList mapRowToFavorites(SqlRowSet rowset){
        FavoriteList list= new FavoriteList();
        list.setFavoriteId(rowset.getInt("favorite_id"));
        list.setAccountId(rowset.getInt("account_id"));
        list.setMovieId(rowset.getInt("movie_id"));
        return list;
    }
} // End of JDBCFavoriteListDAO
