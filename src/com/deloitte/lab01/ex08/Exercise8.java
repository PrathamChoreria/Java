package com.deloitte.lab01.ex08;

public class Exercise8 {
	
	public static boolean checkNumber(int n) {
		
		return n > 0 && (n & (n - 1)) == 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=16;
		System.out.println("Power of 2: "+checkNumber(n));

	}

}
