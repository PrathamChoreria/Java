package com.deloitte.lab03.ex01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter integers in one line :");
		String input1=sc.nextLine();
		
		StringTokenizer tokenizer= new StringTokenizer(input1);
		
		int sum=0;
		
		while(tokenizer.hasMoreTokens()) {
			String token=tokenizer.nextToken();
			int num=Integer.parseInt(token);
			System.out.println("Integer: "+num);
			sum+=num;
		}
		
		System.out.println("Sum of all integer: "+sum);
		
		sc.close();
		
	}

}
