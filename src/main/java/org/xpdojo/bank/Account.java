package org.xpdojo.bank;

public class Account {

    private int balance;

    public Account() {
    }

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
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
