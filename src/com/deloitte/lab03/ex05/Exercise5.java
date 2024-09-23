package com.deloitte.lab03.ex05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String file="C:\\Users\\prath\\eclipse-workspace\\PrathamPrabhatChoreria-core-java-labs\\src\\com\\deloitte\\lab03\\ex05\\file.txt";
		int c_count=0;
		int w_count=0;
		int l_count=0;
		
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			String line;
			
			while((line = reader.readLine()) !=null) {
				l_count++;
				c_count+=line.length();
				
				String[] w=line.split("\\s+");
				w_count+=w.length;
			}
            System.out.println("Number of characters: " + c_count);
            System.out.println("Number of words: " + w_count);
            System.out.println("Number of lines: " + l_count);
		}
			catch(IOException e) {
				System.out.println(e.getMessage());
		};
		
	

	}

}
