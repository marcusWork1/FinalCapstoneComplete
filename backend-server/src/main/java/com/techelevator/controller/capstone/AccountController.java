package com.techelevator.controller.capstone;

import com.techelevator.dao.AccountDAO;
import com.techelevator.generalpurposelogger.APILogger;
import com.techelevator.model.Account;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.annotation.security.PermitAll;
import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin

//@PreAuthorize("isAuthenticated()") // All users must be authenticated to access (comment out for testing)
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

         APILogger.logAPICall("GET for path /account/" + id );

        // return accountDAO.getAccount(id);
         Account account = accountDAO.getAccount(id);
         if (account == null){
             throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Account not found."); // 404 code
         } else {
             return account;
         }
     }

    /**
     * Return account information
     *
     * @param user_id the id of the user
     * @return all info for a given account
     */
    @ResponseStatus(HttpStatus.OK) //200
    @RequestMapping(path="/account/user/{user_id}", method = RequestMethod.GET)
    public Account accountByUser(@PathVariable int user_id) {

        APILogger.logAPICall("GET for path /account/user/" + user_id );

        // return accountDAO.getAccount(id);
        Account account = accountDAO.getAccountByUserId(user_id);
//        if (account == null){
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Account not found."); // 404 code
//        } else {
            return account;
       // }
    }

    /**
     * create account for a user
     *
     * @param newAccount
     */
  //  @PermitAll // Anyone can create an account
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path="/account",method = RequestMethod.POST)
    public Account createAccount2(@Valid @RequestBody Account newAccount){
        APILogger.logAPICall("POST for path /create account for username: " + newAccount.getUsername() );
        Account theNewAccount = accountDAO.createAccount(newAccount); // to see what this holds when we debug
        return theNewAccount;
    }

    //@PreAuthorize("hasRole('USER')") -- Do we even need to preauthorize user, Does annotation up top already control that

    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "/account/{id}", method = RequestMethod.PUT)
    public Account updateAccount (@Valid @RequestBody Account updateAccount,
                                  @PathVariable int id) {
        APILogger.logAPICall( "PUT path to updated account at User ID:" + updateAccount.getUser_id());
         Account updatedAccount = accountDAO.updateAccount(updateAccount);
         return updatedAccount;
    }

    // get account by user id
} // End of Account Controller



