package com.Bank;

public interface Account {
    public void withdraw(int amt);
    public void deposit(int amt);
    public Client getOwner();
    public String getDetails();
    public int getBalance();
    public int getAccountNum();
}
