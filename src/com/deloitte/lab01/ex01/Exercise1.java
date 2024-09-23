package com.deloitte.lab01.ex01;


public class Exercise1 {
	
	public static int sumOfCubesOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10; 
            sum += Math.pow(digit, 3);
            number /= 10;
        }
        return sum;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 55;
        int result = sumOfCubesOfDigits(number);
        System.out.println("Sum of the cubes of the digits is: " + result);
		

	}

}