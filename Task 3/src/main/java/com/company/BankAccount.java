package com.company;

public class BankAccount {
    private double balance;

    public BankAccount() {
    }

    public void setBalance(double inputBalance) {
        balance = inputBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void printBalance() {

        System.out.println("Current balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount <= 5000) balance += amount;
        else System.out.println("Transaction cancelled. Max deposit - 5000 | Your deposit: " + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) System.out.println("There is not enough funds. Available funds: " + balance);
        else balance -= amount;
    }

    public void transferFrom(BankAccount from, double amount) {
        if (amount <= from.balance) {
            deposit(amount);
            from.withdraw(amount);
        } else {
            System.out.println("Transfer cancelled. You are trying to transfer " + amount + " units, but only " + from.balance + " are available.");
        }
    }

}
