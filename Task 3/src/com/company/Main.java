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
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }

    public void transfer(BankAccount to, double amount){
        withdraw(amount);
        to.deposit(amount);
    }

}


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ok = 1;

        BankAccount bankA = new BankAccount();
        BankAccount bankB = new BankAccount();
        bankB.setBalance(1000);

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
                bankA.transfer(bankB, sc.nextDouble()); //transfer from A to B
                bankA.printBalance();
                //bankB.printBalance();
            }
            else System.out.println("PLease choose a valid option.");

            System.out.println("Do you wish to continue? (yes - 1, no - 0)");
            ok=sc.nextInt();

        }while(ok==1);

    }
}
