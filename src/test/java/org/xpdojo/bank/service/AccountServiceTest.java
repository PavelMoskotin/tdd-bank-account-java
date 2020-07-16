package org.xpdojo.bank.service;

import org.junit.jupiter.api.Test;
import org.xpdojo.bank.Account;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountServiceTest {

    @Test
    public void transferWorksOnSufficientFunds() {
        Account accountFrom = new Account(20);
        Account accountTo = new Account(0);
        AccountService.transferBetweenAccounts(accountFrom, accountTo, 10);
        assertThat(accountFrom.getBalance()).isEqualTo(10);
        assertThat(accountTo.getBalance()).isEqualTo(10);
    }

    @Test
    public void transferDoesNotWorkOnInsufficientFunds() {
        Account accountFrom = new Account(0);
        Account accountTo = new Account(20);
        AccountService.transferBetweenAccounts(accountFrom, accountTo, 10);
        assertThat(accountFrom.getBalance()).isEqualTo(0);
        assertThat(accountTo.getBalance()).isEqualTo(20);
    }

}
