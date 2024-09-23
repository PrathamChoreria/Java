package com.deloitte.lab03.ex09;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercise9 {
	
	public static void getDuration(LocalDate inputDate) {
        LocalDate currentDate = LocalDate.now();

        Period duration = Period.between(inputDate, currentDate);

        int years = duration.getYears();
        int months = duration.getMonths();
        int days = duration.getDays();
        
        System.out.println(years + " year(s), " + months + " month(s), and " + days + " day(s).");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        System.out.print("Enter the month: ");
        int month = sc.nextInt();

        System.out.print("Enter the day: ");
        int day = sc.nextInt();

        LocalDate inputDate = LocalDate.of(year, month, day);

        getDuration(inputDate);

        sc.close();

	}

}
