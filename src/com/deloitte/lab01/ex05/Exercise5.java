package com.deloitte.lab01.ex05;

public class Exercise5 {
	public static int calculateSum(int n) {
        int sum = 0; 

        for(int i=1;i<=n;i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i; 
            }
        }

        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println("Sum of the numbers divisble by 3 and 5 is :"+calculateSum(n)+" for "+n+" numbers");

	}

}
