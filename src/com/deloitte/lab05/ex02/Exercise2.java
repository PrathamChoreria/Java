package com.deloitte.lab05.ex02;

import java.util.Scanner;

public class Exercise2 {
	 public static void validateName(String firstName, String lastName) throws NameNotValidException {
	        if (firstName == null || firstName.trim().isEmpty() || lastName == null || lastName.trim().isEmpty()) {
	            throw new NameNotValidException("First name/last name cannot be blank.");
	        } else {
	            System.out.println("Full name is valid.");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter first name: ");
	            String firstName = sc.nextLine();
	            System.out.print("Enter last name: ");
	            String lastName = sc.nextLine();
	 
	            validateName(firstName, lastName);
	            
	        } catch (NameNotValidException e) {
	           
	            System.out.println(e.getMessage());
	        } catch (Exception e) {
	           
	            System.out.println("An error occurred.");
	        } finally {
	           
	            sc.close();
	        }
	    }
}
