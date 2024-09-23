package com.deloitte.lab01.ex07;

public class Exercise7 {
	
	public static boolean checkNumber(int number) {
		String numStr = Integer.toString(number);

        for (int i = 1; i < numStr.length(); i++) {
        	//System.out.println(numStr.charAt(i-1)+" "+numStr.charAt(i));
            if ((int)numStr.charAt(i - 1) > (int)numStr.charAt(i)) {
                return false; 
            }
        }

        return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=134468;
		System.out.println("Number is increasing :"+checkNumber(number));
	}

}
