package com.Bank;

import BankTools.DebitCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Client {
    private String name;
    private String firstName;
    private String lastName;
    private String clientId;
    private Account account;
    private HashMap<Integer, Account> accounts;
    private List<DebitCard> debitCards;

    public Client(String firstName, String lastName, String clientId) {
        this.name = firstName + " " + lastName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientId = clientId;
        accounts = new HashMap<>();
        debitCards = new ArrayList<DebitCard>();
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNum(), account);
    }

    public void addDebitCard(int accountNum) {
        Account account = accounts.get(accountNum);
        if (account instanceof CheckingAccount) {
            DebitCard newCard = new DebitCard("12341234", "1234", "987", this.name, (CheckingAccount) account);
            debitCards.add(newCard);
        } else {
            System.out.println("Invalid account");
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (int accountNum : accounts.keySet()) {
            output += accounts.get(accountNum).getDetails() + "\n";
        }
        String cardsOutput = "";
        for (var debitCard : debitCards) {
            cardsOutput += debitCard.toString();
        }
        return "Accounts of " + name + "\n" + output + "Cards\n" + cardsOutput;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

}



// create a Client class
// 2 of your own properties
// listArray of CheckingAccounts
// listArray of SavingsAccounts
// a method to add an account to the client (try to use overloading) addAccount()
}
