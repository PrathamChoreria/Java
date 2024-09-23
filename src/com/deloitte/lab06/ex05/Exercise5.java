package com.deloitte.lab06.ex05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise5 {

    public static int getSecondSmallest(int[] numbers) {
        List<Integer> numberList = new ArrayList<>();
        for (int num : numbers) {
            numberList.add(num);
        }
        Collections.sort(numberList);
        return numberList.get(1);
    }

    public static void main(String[] args) {
        int[] numbers = {21, 20, 54, 60, 19};
        int secondSmallest = getSecondSmallest(numbers);

        System.out.println("Second smallest element: " + secondSmallest);
    }
}