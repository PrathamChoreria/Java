package com.deloitte.lab05.ex01;

import java.util.Scanner;

public class Exercise1 {

    public static void validateAge(int age) throws AgeNotValidException {
        if (age <= 15) {
            throw new AgeNotValidException("Age should be above 15.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
           
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
       
            validateAge(age);
            
        } catch (AgeNotValidException e) {
    
            System.out.println(e.getMessage());
        } catch (Exception e) {
          
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
           
            scanner.close();
        }
    }
}