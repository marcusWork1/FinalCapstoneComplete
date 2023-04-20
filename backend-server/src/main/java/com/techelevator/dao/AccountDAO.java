package com.techelevator.dao;

import com.techelevator.model.Account;

import java.util.List;

public interface AccountDAO {

    List<Account> allAccounts();

    Account getAccount(int account_id);

    Account createAccount(Account account);

    Account updateAccount(Account account, int account_id);

} // End of AccountDAO
