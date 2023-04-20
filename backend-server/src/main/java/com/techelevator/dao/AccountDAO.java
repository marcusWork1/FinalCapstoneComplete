package com.techelevator.dao;

import com.techelevator.model.Account;

public interface AccountDAO {

    Account getAccount(int account_id);

    Account createAccount(Account account);

} // End of AccountDAO
