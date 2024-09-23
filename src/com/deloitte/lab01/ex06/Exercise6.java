package com.deloitte.lab01.ex06;

import java.util.stream.IntStream;

public class Exercise6 {
	public static int calculateDifference(int n) {
		int sumOfSquares = IntStream.rangeClosed(1, n)// creates a stream of n integers from 1,n
				.map(i -> i * i)// converts the numbers to their square
				.sum();// and then finally their sum
		
		int sum = IntStream.rangeClosed(1, n).sum();
		int squareOfSum = sum * sum;
		//System.out.println(sumOfSquares +" "+sum);
		
		return squareOfSum - sumOfSquares;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println("The difference between the square of the sum and the sum of squares of the first " + n
				+ " natural numbers is: " + calculateDifference(n));

	}

}
