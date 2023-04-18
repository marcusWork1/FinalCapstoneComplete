package com.techelevator.model;

public class Account {

    private int accountId;
    private int userId;
    private String userName;
    private String emailAddress;

    public Account(int accountId, int userId, String userName, String emailAddress) {
        this.accountId = accountId;
        this.userId = userId;
        this.userName = userName;
        this.emailAddress = emailAddress;
    }

    public Account() {

    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
} // End of Account class
