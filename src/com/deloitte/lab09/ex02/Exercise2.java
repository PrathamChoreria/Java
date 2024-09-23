package com.deloitte.lab09.ex02;

public class Exercise2 {
	
	public static void main(String[] args) {
		spaceInsert si= (str) -> String.join(" ", str.split(""));
		String input_str="CG";
		String final_str=si.insertSpace(input_str);
		
		System.out.println("New String :"+final_str);
		
		
	}
	
	
	interface spaceInsert {
		String insertSpace(String str);
	}
}
