package com.deloitte.lab06.ex03;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {
    public static Map<Integer, Integer> getSquares(int[] numbers) {
        Map<Integer, Integer> squaresMap = new HashMap<>();
        
        for (int num : numbers) {
            squaresMap.put(num, num * num); 
        }
        
        return squaresMap;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Map<Integer, Integer> result = getSquares(numbers);
        
        System.out.println("Numbers and their squares: " + result);
    }
}
