package com.deloitte.lab04.ex01;


class SavingsAccount extends Account {
	
    public SavingsAccount(Person accHolder, double initialBalance) {
		super(accHolder, initialBalance);
		// TODO Auto-generated constructor stub
	}

	final double minimumBalance = 500;

    @Override
    void withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
        }
        else {
        	System.out.println("Savings account needs to have a minimum balance of "+minimumBalance);
        }
    }
}

class CurrentAccount extends Account {
    double overdraftLimit = 1000;

    public CurrentAccount(Person accHolder, double initialBalance, double overdraftLimit) {
        super(accHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

public class Exercise1 {
	
	public static void main(String[] args) {
		Person smith = new Person("Smith",30);
		Person kathy = new Person("Kathy", 28);
		
		 // Creating Accounts
     SavingsAccount smithAccount = new SavingsAccount(smith, 2000);
     CurrentAccount kathyAccount = new CurrentAccount(kathy, 3000,1000);
		
		// Deposit and Withdraw
     smithAccount.deposit(2000);
     System.out.println("Smith's account balance after deposit: INR " + smithAccount.getBalance());
     kathyAccount.withdraw(2000);
     System.out.println("Kathy's account balance after withdrawal: INR " + kathyAccount.getBalance());
     
     System.out.println("Smith account balance: " + smithAccount.getBalance());
     System.out.println("Kathy account balance: " + kathyAccount.getBalance());
	}
}

