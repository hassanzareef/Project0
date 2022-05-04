package com.revature.models;

import java.sql.Date;

public class Transaction {
    private int toAccountNum;
    private int userId;
    private Date transactionDate;
    private int fromAccountNum;

    public Transaction() {
    }

    public Transaction(int toAccountNum, int userId, Date transactionDate, int fromAccountNum) {
        this.toAccountNum = toAccountNum;
        this.userId = userId;
        this.transactionDate = transactionDate;
        this.fromAccountNum = fromAccountNum;
    }

    public int getToAccountNum() {
        return toAccountNum;
    }

    public void setToAccountNum(int toAccountNum) {
        this.toAccountNum = toAccountNum;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public int getFromAccountNum() {
        return fromAccountNum;
    }

    public void setFromAccountNum(int fromAccountNum) {
        this.fromAccountNum = fromAccountNum;
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "toAccountNum=" + toAccountNum +
                ", userId=" + userId +
                ", transactionDate=" + transactionDate +
                ", fromAccountNum=" + fromAccountNum +
                '}';
    }
}
