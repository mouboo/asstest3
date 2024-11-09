package com.ass3;

public class BankAccount{
    
    // Instance fields
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount (String accNum, double balance) {
        this.accountNumber = accNum;
        this.balance = balance;
    }

    // Increase balance by amount
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Decrease balance by amount
    public void withdraw(double amount) {
        if (this.balance >= 0){
            if (amount < this.balance / 2) {
                this.balance -= amount;
            } else {
                System.out.println("Error: Cannot withdraw more than 50% of balance.");
            }
        } else {
            System.out.println("Error: Cannot withdraw when balance is negative.");
        }
    }

    // Getters and setters.

    public String getAccountNumber() {
        return this.accountNumber;  
    }

    public void setAccountNumber(String accNum) {
        this.accountNumber = accNum;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double bal) {
        this.balance = bal;
    }

}