package com.techelevator.dao;

import com.techelevator.model.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class JDBCAccountDao implements AccountDAO {

    private final JdbcTemplate jdbcTemplate;

    public JDBCAccountDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);}


    @Override
    public Account getAccount(int accountId) {
        Account user = null;
        String sql = "SELECT account_id, user_id, username, email_address" + "FROM account" + "WHERE account_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, accountId);
        if(results.next()){
            user = mapRowToUser(results);
        }
        return user;
    }


    @Override
    public Account createAccount(Account account) {
        String sql = "INSERT INTO account (username, email_address)" + "VALUES (?, ?) RETURNING account_id;";
        Integer newId = jdbcTemplate.queryForObject(sql, Integer.class, account.getUserName(), account.getEmailAddress());

        return getAccount(newId);
    }

    private Account mapRowToUser(SqlRowSet rowSet){
        Account account = new Account();
        account.setAccountId(rowSet.getInt("account_id"));
        account.setUserId(rowSet.getInt("user_id"));
        account.setUserName(rowSet.getString("username"));
        account.setEmailAddress(rowSet.getString("email_address"));
        return account;
    }
}// End of JDBCAccountDao class
