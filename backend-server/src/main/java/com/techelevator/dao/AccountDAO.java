package com.techelevator.dao;

import com.techelevator.model.Account;

public interface AccountDAO {

    Account getAccount(int accountId);

    Account createUser(Account account);

} // End of AccountDAO
