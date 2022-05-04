package com.revature.models;

public class Account {

    private int userId;
    private int accountNum;
    private int balance;

    private User accountUser;

    public Account() {
    }

    public Account(int userId, int accountNum, int balance) {
        this.userId = userId;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userId=" + userId +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
