package com.Bank;

import java.util.*;

public class Client {
    private String name;
    private byte age;
    public String accountType;
    private List<BankAccount> accounts;

    public Client(String name, List<BankAccount> accounts) {
        this.name = name;
        this.accounts = accounts;
    }


    public void addAccount(accountType) {
        accounts.add(accountType);
    }



// create a Client class
// 2 of your own properties
// listArray of CheckingAccounts
// listArray of SavingsAccounts
// a method to add an account to the client (try to use overloading) addAccount()
}
