package com.deloitte.lab01.ex03;

import java.util.Scanner;

public class Exercise3 {

	public static int fibonacciRecursive(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	public static int fibonacciIterative(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}

		int prev1 = 1, prev2 = 1, current = 0;
		for (int i = 3; i <= n; i++) {
			current = prev1 + prev2;
			prev2 = prev1;
			prev1 = current;
		}
		return current;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter the position of the Fibonacci sequence (n): ");
			int n = sc.nextInt();

			if (n <= 0) {
				System.out.println("Please enter a positive integer.");
			} else {
				System.out.println("Fibonacci number at position " + n + " (Recursive): " + fibonacciRecursive(n));
				System.out.println("Fibonacci number at position " + n + " (Iterative): " + fibonacciIterative(n));
			}
		} catch (Exception e) {
			System.out.println("Enter a valid number/choice please");
		} finally {
			sc.close();
		}

	}

}
