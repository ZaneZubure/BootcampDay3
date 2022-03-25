package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bankA = new BankAccount();
        BankAccount bankB = new BankAccount();
        bankA.setBalance(500);
        bankB.setBalance(1000);

        bankA.withdraw(600);
        bankA.deposit(6000);
        bankA.transferFrom(bankB, 2000);

    }
}