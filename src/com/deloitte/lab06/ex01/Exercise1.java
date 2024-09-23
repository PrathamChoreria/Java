package com.deloitte.lab06.ex01;

import java.util.*;

public class Exercise1 {
    
    public static List<Integer> getValues(HashMap<Integer, Integer> map) {
        Collection<Integer> values = map.values();
  
        List<Integer> sortedValues = new ArrayList<>(values);
 
        Collections.sort(sortedValues);
   
        return sortedValues;
    }

    public static void main(String[] args) {
      
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 20);
        map.put(2, 5);
        map.put(3, 15);
        map.put(4, 30);

    
        List<Integer> sortedValues = getValues(map);
        System.out.println("Sorted values: " + sortedValues);
    }
}
