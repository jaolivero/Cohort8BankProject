package BankTools;

import com.Bank.Account;
import com.Bank.CheckingAccount;
import com.Bank.SavingsAccount;

import java.util.*;

public class DebitCard {
    private String pin;
    private CheckingAccount primary;
    //    private Calendar expDate;
    private String cvv;
    private String cardOwner;
    private String cardNum;
    private List<Account> atmAccounts;

    public DebitCard(String cardNum, String pin, String cvv, String cardOwner, CheckingAccount primary) {
        this.cardNum = cardNum;
        this.pin = pin;
        this.cvv = cvv;
        this.cardOwner = cardOwner;
        this.primary = primary;
        this.atmAccounts = new ArrayList<>();
    }

    public Boolean charge(int amt, String pin) {
        if (this.pin == pin && primary.getBalance() >= amt) {
            primary.withdraw(amt);
            return true;
        }
        return false;
    }
    public void addAccount(Account account) {
        atmAccounts.add(account);
    }

    public String toString() {
        return "cardNum: " + cardNum;
    }
}
