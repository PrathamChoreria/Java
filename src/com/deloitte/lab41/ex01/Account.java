package com.deloitte.lab04.ex01;

import java.util.concurrent.atomic.AtomicLong;

abstract class Account {
    private static final AtomicLong accountNumberGenerator = new AtomicLong(1000); // Starting accNum
    protected long accNum;
    protected double balance;
    protected Person accHolder;

    public Account(Person accHolder, double initialBalance) {
        this.accNum = accountNumberGenerator.getAndIncrement();
        this.accHolder = accHolder;
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);

    public abstract boolean withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public long getAccNum() {
        return accNum;
    }

    public Person getAccHolder() {
        return accHolder;
    }
}

