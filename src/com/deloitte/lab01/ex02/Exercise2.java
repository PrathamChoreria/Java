package com.deloitte.lab01.ex02;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		       
        System.out.println("Traffic Light Simulation:");
        System.out.println("1: Red");
        System.out.println("2: Yellow");
        System.out.println("3: Green");
        System.out.print("Enter your choice (1 for Red, 2 for Yellow, 3 for Green): ");
        
        try {
            int choice = sc.nextInt();
            switch (choice) {
                case 1: 
                    System.out.println("Red Light - Stop!");
                    break;
                case 2: 
                    System.out.println("Yellow Light - Ready!");
                    break;
                case 3: 
                    System.out.println("Green Light - Go!");
                    break;
                default: 
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number (1, 2, or 3) "+e.getMessage());
        } finally {
            sc.close();
        }
    }

}
