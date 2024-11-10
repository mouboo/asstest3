package com.ass3;

public class Test {

    public static void main(String args[]) {

        // "Create one instance of PersonRegister,"
        PersonRegister register = new PersonRegister();

        // Print confirmation
        System.out.println("register object created: " + register);

        // "create two instances of Person, adding them to the PersonRegister instance,"
        Person personA = new Person("P0", "Arne Alfredsson", 34);
        register.addPerson(personA);
        Person personB = new Person("P1", "Bertil Bengtsson", 19);
        register.addPerson(personB);

        // create and add two instances of BankAccount for each person,
        BankAccount account0 = new BankAccount("BA0", 100);
        BankAccount account1 = new BankAccount("BA1", 101);
        BankAccount account2 = new BankAccount("BA2", 102);
        BankAccount account3 = new BankAccount("BA3", 103);

        personA.addAccount(account0);
        personA.addAccount(account1);
        personA.addAccount(account2); // Testing business logic: max number of accounts
        personA.addAccount(account3); // Testing business logic: max number of accounts
        personB.addAccount(account2);
        personB.addAccount(account3);

        // Testing BankAccount.deposit() method
        register.findAccount("BA3").deposit(123);

        // Testing BankAccount.withdraw() method with error checking
        register.findAccount("BA3").withdraw(50);                       
        System.out.println(register.findAccount("BA3").getBalance());   // Should be 103+123-50 = 176
        register.findAccount("BA3").withdraw(100);
        System.out.println(register.findAccount("BA3").getBalance());   // Should give error

        // Testing BankAccount.getBalance() method
        System.out.println(register.findAccount("BA3").getBalance());

        System.out.println(register.findPerson("P0").getAge());
    }
    
}