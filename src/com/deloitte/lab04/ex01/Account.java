package com.deloitte.lab04.ex01;


class Account{
	private static long accNumCounter = 1000;
    long accNum;
    double balance;
    Person accHolder;

    
    public Account(Person accHolder, double initialBalance) {
        this.accNum = accNumCounter++;
        this.balance = initialBalance;
        this.accHolder = accHolder;
        }
    
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if (balance - amount >= 500) {
            balance -= amount;
        } else {
            System.out.println("Cannot withdraw. Minimum balance of INR 500 must be maintained.");
        }
    }
    
    long getAccountNumber() {
        return accNum;
    }
    
    double getBalance() {
        return balance;
    }
    
    Person getAccountHolder() {
        return accHolder;
    }
}