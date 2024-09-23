package com.deloitte.lab09.ex05;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorialOp f=new factorialOp();
		FactorialCalculator cal=f::factorial;
		int num=4;
		System.out.println("Factorial :"+cal.calculate(num));

	}

}
class factorialOp {

    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

interface FactorialCalculator {
    int calculate(int n);
}
