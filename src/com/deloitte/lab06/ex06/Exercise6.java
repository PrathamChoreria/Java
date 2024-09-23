package com.deloitte.lab06.ex06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise6 {

    public static List<Integer> votersList(Map<Integer, Integer> people) {
        List<Integer> eligibleVoters = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : people.entrySet()) {
            int id = entry.getKey();
            int age = entry.getValue();

            if (age > 18) {
                eligibleVoters.add(id);
            }
        }

        return eligibleVoters;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> people = new HashMap<>();
        people.put(1, 22);
        people.put(2, 17);
        people.put(3, 20);
        people.put(4, 13); 
        List<Integer> eligibleVoters = votersList(people);

        System.out.println("Eligible voters' IDs: " + eligibleVoters);
    }
}
