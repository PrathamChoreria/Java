package com.deloitte.lab06.ex04;

import java.util.HashMap;
import java.util.Map;

public class Exercise4 {

	public static Map<Integer, String> getStudents(HashMap<Integer, Integer> studentMarks) {
        Map<Integer, String> medalMap = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : studentMarks.entrySet()) {
            int regNo = entry.getKey();
            int marks = entry.getValue();

            if (marks >= 90) {
                medalMap.put(regNo, "Gold");
            } else if (marks >= 80 && marks < 90) {
                medalMap.put(regNo, "Silver");
            } else if (marks >= 70 && marks < 80) {
                medalMap.put(regNo, "Bronze");
            }
        }

        return medalMap;
    }

    public static void main(String[] args) {
        // Example usage
        HashMap<Integer, Integer> studentMarks = new HashMap<>();
        studentMarks.put(1, 95);
        studentMarks.put(2, 80);
        studentMarks.put(3, 23);
        studentMarks.put(4, 45);

        Map<Integer, String> result = getStudents(studentMarks);

        System.out.println("Students eligible for medals: " + result);
    }

}
