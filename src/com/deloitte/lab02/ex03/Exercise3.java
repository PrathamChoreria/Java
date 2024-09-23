package com.deloitte.lab02.ex03;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

	public static int reverseNumber(int num) {
		int reversed = 0;
		while (num != 0) {
			reversed = reversed * 10 + num % 10;
			num /= 10;
		}
		return reversed;
	}

	public static int[] getSorted(int[] arr) {
		int[] reverse_arr = Arrays.stream(arr).map(Exercise3::reverseNumber).toArray();
		Arrays.sort(reverse_arr);
		return reverse_arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();

		}
		int[] res = getSorted(num);
		System.out.println("Sorted and reversed array is: " + Arrays.toString(res));

		sc.close();

	}

}
