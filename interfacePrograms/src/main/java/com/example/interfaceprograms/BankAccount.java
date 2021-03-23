package com.example.interfaceprograms;

public class BankAccount {
    private double balance;
    private int accountnumber;
    private static int LastAssignedNumber = 1000;

    public BankAccount(double balance) {
        this.balance=balance;
        LastAssignedNumber++;
        accountnumber=LastAssignedNumber;
    }

    public double getBalance() {
        return balance;
    }
}
