package com.deloitte.lab02.ex04;

import java.util.Arrays;
import java.util.Set;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Scanner;

public class Exercise4 {

	    public static Integer[] modifyArray(int[] arr) {
	       
	        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
	        for (int num : arr) {
	            set.add(num);  
	        }

	        return set.toArray(new Integer[0]);
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Integer[] result = modifyArray(arr);
        System.out.println("Array after removing duplicates and sorting in descending order:");
        System.out.println(Arrays.toString(result));
        
        sc.close();

	}

}
