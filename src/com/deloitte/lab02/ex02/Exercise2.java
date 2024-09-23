package com.deloitte.lab02.ex02;

import java.util.Arrays;

public class Exercise2 {
	
	public static String[] sortString(String[] arr) {
		if (arr == null || arr.length==0) {
			return arr;
		}
		Arrays.sort(arr);
		int n= arr.length;
		int mid= (n%2)==0? n/2:(n/2)+1;
		for (int i = 0; i < n; i++) {
            if (i < mid) {
            	arr[i] = arr[i].toUpperCase(); 
            } else {
                arr[i] = arr[i].toLowerCase();
            }
        }

        return arr;
	}
	
	public static void main(String[] args) {
		String[] input_arr = {"vettel", "lewis", "lando", "max", "charles"};

        
        String[] resultArray = sortString(input_arr);

        
        System.out.println("Modified Array: " + Arrays.toString(resultArray));
		
	}
}