package com.ass3;

import java.util.ArrayList;

public class PersonRegister {

    // Instance fields
    private ArrayList<Person> persons = new ArrayList<Person>();

    // Constructor
    public PersonRegister() {
        // (Empty)
    }

   

    // Instance methods
    public void addPerson(Person p) {
            persons.add(p);
    }

    public Person findPerson(String idNum) {
        Person pToReturn = null;
        for (Person p : persons) {
            if (p.getIdentificationNumber().equals(idNum)) {
                pToReturn = p;
                return pToReturn;
            }
        }
        return pToReturn;
    }

    public BankAccount findAccount(String accountNumber) {
        BankAccount bToReturn = null;
        for (Person p : persons) {
            bToReturn = p.findAccount(accountNumber);
            if (bToReturn != null) {
                return bToReturn;
            }
        }
        return bToReturn;
    }

    public double calculateTotalBalance() {
        double totalToReturn = 0 ;
        for (Person p : persons){
            totalToReturn += p.calculateTotalBalance();
        }
        return totalToReturn;
    }

}
