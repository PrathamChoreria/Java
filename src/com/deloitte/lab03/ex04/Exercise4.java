package com.deloitte.lab03.ex04;

public class Exercise4 {
	
	public static int modifyNumber(int number1) {
		String num=Integer.toString(number1);
		StringBuffer str=new StringBuffer();
		
		for (int i=0;i<num.length()-1;i++) {
			int current=Character.getNumericValue(num.charAt(i));
			int next=Character.getNumericValue(num.charAt(i+1));
			
			str.append(Math.abs(current-next));
		}
		str.append(num.charAt(num.length()-1));
		
		return Integer.parseInt(str.toString());
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=45862;
		System.out.println("Modified :"+modifyNumber(number));

	}

}
