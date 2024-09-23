package com.deloitte.lab06.ex07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise7 {

    public static int[] getSorted(int[] numbers) {
        List<Integer> reversedNumbers = new ArrayList<>();
        
        for (int num : numbers) {
            StringBuilder reversedString = new StringBuilder(String.valueOf(num));
            int reversedNum = Integer.parseInt(reversedString.reverse().toString());
            reversedNumbers.add(reversedNum);
        }
   
        Collections.sort(reversedNumbers);

        int[] sortedArray = new int[reversedNumbers.size()];
        for (int i = 0; i < reversedNumbers.size(); i++) {
            sortedArray[i] = reversedNumbers.get(i);
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        int[] numbers = {89, 29, 92, 14};
        int[] result = getSorted(numbers);
      
        System.out.print("Sorted array after reversing numbers: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
