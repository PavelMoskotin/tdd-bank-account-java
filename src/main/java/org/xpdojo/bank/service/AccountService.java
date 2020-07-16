package org.xpdojo.bank.service;

import org.xpdojo.bank.Account;

public class AccountService {

    public static void transferBetweenAccounts(Account accountFrom, Account accountTo, int amount) {
        if (accountFrom.getBalance() >= amount) {
            accountFrom.withdraw(amount);
            accountTo.deposit(amount);
        }
    }

}
