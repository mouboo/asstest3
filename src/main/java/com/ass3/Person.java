package com.ass3;

import java.util.ArrayList;

public class Person {

    // Instance fields
    private String identificationNumber;
    private String name;
    private int age;
    private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

    // Constructor

    public Person (String id, String name, int age) {
        this.identificationNumber = id;
        this.name = name;
        this.age = age;
    }

    // Getters and setters

    public String getIdentificationNumber() {
        return this.identificationNumber;
    }

    public void setIdentificationNumber(String idNum) {
        this.identificationNumber = idNum;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Instance methods

    public void addAccount(BankAccount account) {
        if (accounts.size() < 3 ) {
            if (this.age >= 18) {
                accounts.add(account);
            } else {
                System.out.println("Error: Person must be 18 years or older to open an account.");
            }
        } else {
            System.out.println("Error: " + this.name + " has " + accounts.size() + " accounts already.");
        }
    }

    public BankAccount findAccount (String accID) {
        for (BankAccount a : accounts) {
            if (a.getAccountNumber().equals(accID)) {
                return a;
            }
        }
        return null;
    }

    public double calculateTotalBalance() {
        double total = 0;
        for (BankAccount b : accounts) {
            total += b.getBalance();
        }
        return total;
    }

}
