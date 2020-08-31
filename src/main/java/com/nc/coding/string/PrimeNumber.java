package com.nc.coding.string;

public class PrimeNumber {

	public boolean isPrime(int num) {
		if (num == 0 && num == 1) {
			return false;
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public String printPrimeNumbers(int num) {
		String res = "";
		for (int i = 2; i < num; i++) {
			if (isPrime(i)) {
				res += i + " ";
			}
		}
		return res.trim();
	}
}