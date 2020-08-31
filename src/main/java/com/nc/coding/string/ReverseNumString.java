package com.nc.coding.string;

public class ReverseNumString {

	public String reverseByRecursively(String str) {
		if (str.isEmpty())
			return str;

		return reverseByRecursively(str.substring(1)) + str.charAt(0);
	}

	public String reverseByStringBuilder(String str) {
		StringBuilder builder = new StringBuilder(str);
		return builder.reverse().toString();
	}

	public String reverseByStringConcat(String s) {
		StringBuilder builder = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			builder.append(s.charAt(i));
		}
		return builder.toString();
	}

	public String reverseEachStringByStringConcat(String s) {
		String[] arr = s.split("\\s");
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			builder.append(reverseByStringConcat(arr[i]) + " ");
		}
		return builder.toString().trim();
	}

	public String reverseEachStringByStringConcat1(String s) {
		String[] arr = s.split("\\s");
		String res = "";
		for (int i = 0; i < arr.length; i++) {
			StringBuilder builder = new StringBuilder(arr[i]);
			builder.reverse();
			res += builder + " ";
		}
		return res.trim();
	}

	public int reverseNumber(int n) {
		int rev = 0;

		while (n != 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		return rev;
	}
}
