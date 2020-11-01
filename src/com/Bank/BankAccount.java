package com.Bank;

public class BankAccount implements Account {
    private int accountNum;
    private Client owner;
    protected int balance;
    private String type;


    public BankAccount(int accountNum, int balance, Client owner, String type) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.owner = owner;
        this.type = type;
    }

    public void deposit(int amt) {
        balance += amt;
    }

    public void withdraw(int amt) {
        if (balance >= amt) {
            balance -= amt;
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getAccountNum() {return accountNum;}

    @Override
    public Client getOwner() {
        return owner;
    }

    public String getDetails() {
        return type + " Account, Owner: " + owner + "\tAccount Number: " + accountNum + "\tBalance: " + balance;
    }
}
