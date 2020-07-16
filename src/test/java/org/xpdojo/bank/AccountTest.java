package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void newAccountHasZeroBalance() {
        Account account = new Account();
        assertThat(account.getBalance()).isEqualTo(0);
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(10);
        assertThat(account.getBalance()).isEqualTo(10);
    }

    @Test
    public void withdrawWorksWithSufficientBalance() {
        Account account = new Account(20);
        account.withdraw(10);
        assertThat(account.getBalance()).isEqualTo(10);
    }

    @Test
    public void withdrawDoesNotWorkWithInsufficientBalance() {
        Account account = new Account(10);
        account.withdraw(20);
        assertThat(account.getBalance()).isEqualTo(10);
        // TODO add exception raised
    }
}
