package com.deloitte.lab09.ex01;

public class Exercise1 {

    public static void main(String[] args) {
        Power p = (x, y) -> (int) Math.pow(x, y);

        int x = 2;
        int y = 3;
        int result = p.calculate(x, y);

        System.out.println("Result of " + x + "^" + y + " is: " + result);
    }
    interface Power {
        int calculate(int x, int y);
    }
}
