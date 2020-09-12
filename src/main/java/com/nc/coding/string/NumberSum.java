package com.nc.coding.string;

public class NumberSum {

	public void sumOfTwo(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					System.out.print(i + " " + j);
					System.out.println("\t" + nums[i] + " " + nums[j]);
				}
			}
		}
	}

	public void sumOfTThree(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (nums[i] + nums[j] + nums[k] == target) {
						System.out.print(i + " " + j + " " + k);
						System.out.println("\t" + nums[i] + " " + nums[j] + " " + nums[k]);
					}
				}
			}
		}
	}
}
