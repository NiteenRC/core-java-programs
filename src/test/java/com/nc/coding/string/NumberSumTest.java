package com.nc.coding.string;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NumberSumTest {

	@InjectMocks
	private NumberSum twoSum;

	@Test
	public void sumOfTwo() {
		int[] nums = { 1, 2, 3, 2, 5, 6, 7, 4, -3 };
		System.out.println();
		twoSum.sumOfTwo(nums, 4);
	}
	
	@Test
	public void sumOfTwo1() {
		int[] nums = { 1, 2, 3, 2, 5, 6, 7, 4, -3 };
		System.out.println();
		twoSum.sumOfTThree(nums, 4);
	}
}
