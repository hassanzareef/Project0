package com.revature.models;



import java.util.List;
import java.util.ArrayList;

public class User {

    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int accountNum;
    private String type;
    private List<Transaction> transaction;

    public User() {
    }

    public User(int userId, String firstName, String lastName, String email, String password, int accountNum, String type, List<Transaction> transaction) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.accountNum = accountNum;
        this.type = type;
        this.transaction = transaction;
    }

    public User(int userId, String firstName, String lastName, String email, String password, String type) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
       // this.accountNum = accountNum;
        this.type = type;
        this.transaction = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", accountNum=" + accountNum +
                ", type='" + type + '\'' +
                ", transaction=" + transaction +
                '}';
    }
}
