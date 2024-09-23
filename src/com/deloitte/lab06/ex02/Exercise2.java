package com.deloitte.lab06.ex02;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {

    public static Map<Character, Integer> countChars(char[] arr) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        for (char ch : arr) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } 
            else {
                charCountMap.put(ch, 1);
            }
        }
        
        return charCountMap;
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'a', 'c', 'b', 'a'};
        Map<Character, Integer> result = countChars(arr);
        
        System.out.println("Character counts: " + result);
    }
}
