package com.techelevator.controller.capstone;

import com.techelevator.dao.AccountDAO;
import com.techelevator.model.Account;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.annotation.security.PermitAll;
import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@PreAuthorize("isAuthenticated()") // All users must be authenticated to access (comment out for testing)
@RestController
public class AccountController {

    private AccountDAO accountDAO;

    public AccountController(AccountDAO anAccountDao) {
        this.accountDAO = anAccountDao;
    }


    /**
     * Return account information
     *
     * @param id the id of the account
     * @return all info for a given account
     */
     @ResponseStatus(HttpStatus.OK) //200
     @RequestMapping(path="/account/{id}", method = RequestMethod.GET)
     public Account account(@PathVariable int id) {
        // return accountDAO.getAccount(id);
         Account account = accountDAO.getAccount(id);
         if (account == null){
             throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Account not found."); // 404 code
         } else {
             return account;
         }
     }

    /**
     * create account for a user
     *
     * @param newAccount
     */
    @PermitAll // Anyone can create an account
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path="/account",method = RequestMethod.POST)
    public Account createAccount(@Valid @RequestBody Account newAccount){
        return accountDAO.createAccount(newAccount);
    }

} // End of Account Controller



