package com.Bank;

import java.util.*;

public class Client {
    private String name;
    private String firstName;
    private String lastName;
    private String clientId;
    private HashMap<Integer, Account> accounts;
    private List<DebitCard> cards;

    public Client(String name, List<BankAccount> accounts) {
        this.name = firstName + " " + lastName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientId = clientId;
        accounts = new HashMap<Integer, Account>();
        cards = new ArrayList<DebitCard>();
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNum(), account);
    }



// create a Client class
// 2 of your own properties
// listArray of CheckingAccounts
// listArray of SavingsAccounts
// a method to add an account to the client (try to use overloading) addAccount()
}
