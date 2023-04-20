package com.techelevator.dao;

import com.techelevator.model.Account;

import java.util.List;

public interface AccountDAO {

    List<Account> allAccounts();

    Account getAccount(int account_id);

    Account createAccount(Account account);

    void updateAccount(Account account);

} // End of AccountDAO
