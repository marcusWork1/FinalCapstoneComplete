package com.techelevator.dao;

import com.techelevator.model.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class JDBCAccountDao implements AccountDAO {

    private List<Account> listOfAccounts = new ArrayList<>();

    private final JdbcTemplate jdbcTemplate;

    public JDBCAccountDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);}


    @Override
    public List<Account> allAccounts() {
        return null;
    }

    @Override
    public Account getAccount(int account_id) {
        Account user = null;
        String sql = "SELECT account_id, user_id, username, email_address, genre, adult_only, popularity " + "FROM account " + "WHERE account_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, account_id);
        if(results.next()){
            user = mapRowToUser(results);
        }
        return user;
    }


    @Override
    public Account createAccount(Account account) {
        String sql = "INSERT INTO account (user_id, username, email_address, genre, adult_only, popularity )" + "VALUES (?, ?, ?, ?, ?, ?) RETURNING account_id;";
        Integer newAccountId = jdbcTemplate.queryForObject(sql, Integer.class, account.getAccount_id(), account.getUsername(), account.getEmail_address(), account.getGenre(), account.isAdult_only(), account.getPopularity());

        return getAccount(newAccountId);
    }

    @Override
    public void updateAccount(Account account) {
        String sql = "UPDATE account " + "SET email = ?, username = ?, genre = ?, popularity = ? " +
                "WHERE account_id = ?;";
        jdbcTemplate.update(sql, account.getEmail_address(), account.getUsername(), account.getGenre(), account.getPopularity(), account.getAccount_id());
        }



    private Account mapRowToUser(SqlRowSet rowSet){
        Account account = new Account();
        account.setAccount_id(rowSet.getInt("account_id"));
        account.setUser_id(rowSet.getInt("user_id"));
        account.setUsername(rowSet.getString("username"));
        account.setEmail_address(rowSet.getString("email_address"));
        account.setGenre(rowSet.getString("genre"));
        account.setAdult_only(rowSet.getBoolean("adult_only"));
        account.setPopularity(rowSet.getInt("popularity"));
        return account;
    }
}// End of JDBCAccountDao class
