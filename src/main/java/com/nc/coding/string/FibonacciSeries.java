package com.nc.coding.string;

public class FibonacciSeries {

	public String printFibonacci(int num) {
		int n1 = 0, n2 = 1, n3 = 0;
		String res = "";
		for (int i = 0; i < num; i++) {
			res += String.valueOf(n1) + " ";
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		return res.trim();
	}

	public String print(int num) {
		String res = "";
		for (int i = 0; i < num; i++) {
			res += fibonacciRecursion(i) + " ";
		}
		return res.trim();
	}

	public int fibonacciRecursion(int num) {
		if (num == 0) {
			return 0;
		}

		if (num == 1 || num == 2) {
			return 1;
		}

		return fibonacciRecursion(num - 2) + fibonacciRecursion(num - 1);
	}
}
