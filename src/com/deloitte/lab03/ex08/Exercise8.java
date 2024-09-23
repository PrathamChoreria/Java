package com.deloitte.lab03.ex08;

public class Exercise8 {
	
	public static boolean isPositive(String str) {
		str = str.toUpperCase();
		for (int i = 1; i < str.length(); i++) {
		    if (str.charAt(i) < str.charAt(i - 1)) { 
		        return false; 
		    }
		}
	        return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPositive("ANT"));
	}

}
