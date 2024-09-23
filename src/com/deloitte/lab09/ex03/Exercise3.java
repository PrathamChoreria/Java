package com.deloitte.lab09.ex03;

public class Exercise3 {
	
	public static void main(String[] args) {
	
	String validUsername = "root";
    String validPassword = "pass123";
    
    Authenticator auth = (name,password) -> name.equals(validUsername) && password.equals(validPassword);
    
    boolean auth_check=auth.authenticate("root","pass123");
    
    System.out.println("Authentication success:"+auth_check);
    
	
	}
	interface Authenticator {
	        boolean authenticate(String username, String password);
	    }
}
