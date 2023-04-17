package com.techelevator.controller.capstone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private AccountDAO accountDAO;

    public AccountController(AccountDAO anAccountDao) {
        this.accountDAO = anAccountDao;
    }




} // End of Account Controller



