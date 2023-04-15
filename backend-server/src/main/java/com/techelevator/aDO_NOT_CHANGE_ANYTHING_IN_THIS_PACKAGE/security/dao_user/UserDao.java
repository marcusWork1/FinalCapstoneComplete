package com.techelevator.aDO_NOT_CHANGE_ANYTHING_IN_THIS_PACKAGE.security.dao_user;

import com.techelevator.aDO_NOT_CHANGE_ANYTHING_IN_THIS_PACKAGE.security.model_login.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();

    User getUserById(int userId);

    User findByUsername(String username);

    int findIdByUsername(String username);

    boolean create(String username, String password, String role);
}
