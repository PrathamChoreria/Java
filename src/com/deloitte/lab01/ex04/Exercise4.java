package com.deloitte.lab01.ex04;

import java.util.Scanner;

public class Exercise4 {
	
	public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true; 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        try {
        System.out.print("Enter an integer: ");
        int limit = sc.nextInt();

        if (limit < 2) {
            System.out.println("There are no prime numbers till =" + limit);
        } else {
        	
            System.out.println("Prime numbers till = " + limit + ":");
            for (int i = 2; i <= limit; i++) {
                if (isPrime(i)) {
                    System.out.println(i + " ");
                }
            }
            System.out.println();
        }
       }
        catch(Exception e) {
        	System.out.println(e.getMessage());
        }
        finally {
        	sc.close();
        }
	}

}
