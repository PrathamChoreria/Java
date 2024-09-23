package com.deloitte.lab03.ex02;

public class Exercise2 {
	public String getImage(String input) {
		
		StringBuffer st=new StringBuffer(input);
		
		String mirror=st.reverse().toString();
		
		return input + "|" + mirror;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="EARTH";
		Exercise2 ex= new Exercise2();
		
		System.out.println(ex.getImage(input));
		
		

	}

}
