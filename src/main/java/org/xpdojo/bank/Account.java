package org.xpdojo.bank;

public class Account {

    private Long accountNumber;

    private int balance;

    private boolean isAccountOpen;

    public Account() {
    }

    public Account(int balance) {
        this.balance = balance;
    }

    public Account(Long accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.isAccountOpen = true;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (this.balance >= amount ) {
            this.balance -= amount;
        }
        // TODO add Exception raised on insufficient funds
    }
}
