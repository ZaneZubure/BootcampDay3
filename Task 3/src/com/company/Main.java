package com.company;

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(){
    }

    public void setBalance(double inputBalance){
        balance = inputBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void printBalance(){
        System.out.println("Current balance: " + balance);
    }

    public void deposit(double amount){
        if(amount<=5000) balance += amount;
        else System.out.println("Transaction cancelled. Max deposit - 5000 | Your deposit: " + amount);
    }
    public void withdraw(double amount){
        if(amount>balance) System.out.println("There is not enough funds. Available funds: " + balance);
        else balance -= amount;
    }

    public void transferFrom(BankAccount from, double amount){
        if(amount <= from.balance){
            deposit(amount);
            from.withdraw(amount);
        }
        else {
            System.out.println("Transfer cancelled. You are trying to transfer " + amount + " units, but only " + from.balance + " are available.");
        }
    }

}


public class Main {

    public static void main(String[] args) {

        BankAccount bankA = new BankAccount();
        BankAccount bankB = new BankAccount();
        bankA.setBalance(500);
        bankB.setBalance(1000);

        bankA.withdraw(600);
        bankA.deposit(6000);
        bankA.transferFrom(bankB, 2000);



/*
        Scanner sc = new Scanner(System.in);
        int ok = 1;
        do{
            int choice;
            System.out.println("What do yo wish to do?\nSet balance(1)\nDeposit(2)\nWithdraw(3)\nTransfer(4)");
            choice = sc.nextInt();

            if(choice==1){
                System.out.println("Set balance: ");
                bankA.setBalance(sc.nextDouble());
                bankA.printBalance();
            }
            else if(choice==2){
                System.out.println("Deposit: ");
                bankA.deposit(sc.nextDouble());
                bankA.printBalance();
            }
            else if(choice==3){
                System.out.println("Withdraw: ");
                bankA.withdraw(sc.nextDouble());
                bankA.printBalance();
            }
            else if(choice==4){
                System.out.println("Transfer amount: ");
                bankA.transferFrom(bankB, sc.nextDouble()); //transfer from B to A
                bankA.printBalance();
                System.out.println("Other account balance: " + bankB.getBalance());
            }
            else System.out.println("PLease choose a valid option.");

            System.out.println("Do you wish to continue? (yes - 1, no - 0)");
            ok=sc.nextInt();

        }while(ok==1);*/

    }
}