package com.company;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    public void shouldCreateBankAccount(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(100);
        //Tests if balance is not 0
        Assertions.assertTrue(bankAccount.getBalance()!=0);
        //Tests if balance is set correctly
        Assertions.assertEquals(100, bankAccount.getBalance());
    }

    @Test
    public void shouldDeposit(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(100);
        bankAccount.deposit(100);
        Assertions.assertEquals(200,bankAccount.getBalance());
    }

    @Test
    public void shouldWithdraw(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(100);
        bankAccount.withdraw(50);
        Assertions.assertEquals(50, bankAccount.getBalance());
    }

    @Test
    public void shouldTransfer(){
        BankAccount bankAccountA = new BankAccount();
        bankAccountA.setBalance(500);
        BankAccount bankAccountB = new BankAccount();
        bankAccountB.setBalance(500);
        bankAccountA.transferFrom(bankAccountB, 500);
        Assertions.assertEquals(1000, bankAccountA.getBalance());
        Assertions.assertEquals(0, bankAccountB.getBalance());
    }
}