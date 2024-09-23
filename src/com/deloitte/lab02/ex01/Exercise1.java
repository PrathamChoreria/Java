package com.deloitte.lab02.ex01;

public class Exercise1 {
	
	public static int getSecondSmallest(int[] n) {
		if (n == null || n.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
		int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : n) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }
        }
        
		return secondSmallest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {10,21,22,67,54,9};
		try {
            Integer secondSmallest = getSecondSmallest(n);
            if (secondSmallest != null) {
                System.out.println("Second smallest element: " + secondSmallest);
            }
            
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
		

	}

}
