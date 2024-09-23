package com.deloitte.lab04.ex01;


// Savings Account Class
class SavingsAccount extends Account {
    private final double minimumBalance = 500;

    public SavingsAccount(Person accHolder, double initialBalance) {
        super(accHolder, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            return true;
        }
        System.out.println("Withdrawal denied. Minimum balance of " + minimumBalance + " must be maintained.");
        return false;
    }
}

// Current Account Class
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(Person accHolder, double initialBalance, double overdraftLimit) {
        super(accHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            return true;
        }
        System.out.println("Withdrawal denied. Overdraft limit reached.");
        return false;
    }
}

public class Ex01 {
	
	public static void main(String[] args) {
		Person smith = new Person("Smith",30);
		Person kathy = new Person("Kathy", 28);
		
		 // Creating Accounts
        SavingsAccount smithAccount = new SavingsAccount(smith, 2000);
        CurrentAccount kathyAccount = new CurrentAccount(kathy, 3000, 1000);
		
		// Deposit and Withdraw
        smithAccount.deposit(2000);
        kathyAccount.withdraw(2000);
        
        System.out.println("Smith account balance: " + smithAccount.getBalance());
        System.out.println("Kathy account balance: " + kathyAccount.getBalance());
	}
	
}
