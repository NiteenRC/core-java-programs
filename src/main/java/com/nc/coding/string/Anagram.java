package com.nc.coding.string;

import java.util.Arrays;

public class Anagram {

	public boolean isAnagramByReplace(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					s2 = s2.replace(String.valueOf(s2.charAt(j)), "");
				}
			}
		}
		return s2.isEmpty();
	}

	public boolean isAnagramByDelete(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		StringBuilder s2Builder = new StringBuilder(s2);

		for (int i = 0; i < s1.length(); i++) {
			int index = s2Builder.indexOf(String.valueOf(s1.charAt(i)));

			if (index != -1) {
				s2Builder.deleteCharAt(index);
			} else {
				return false;
			}
		}
		return s2Builder.toString().isEmpty();
	}

	public boolean isAnagramBySubString(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					s2 = s2.substring(0, j) + s2.substring(j + 1, s2.length());
				}
			}
		}
		return s2.isEmpty();
	}

	public boolean isAnagramBySort(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1, ch2);
	}
}
