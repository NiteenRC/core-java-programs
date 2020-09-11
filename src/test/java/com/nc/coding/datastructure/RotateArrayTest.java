package com.nc.coding.datastructure;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.nc.datastrucure.RotateArray;

@RunWith(MockitoJUnitRunner.class)
public class RotateArrayTest {

	@InjectMocks
	private RotateArray rotateArray;

	@Test
	public void rotateArrayLeft() {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] expArr = { 3, 4, 5, 1, 2 };
		rotateArray.rotateArrayLeftByN(arr, 2);
		assertArrayEquals(expArr, arr);
	}

	@Test
	public void rotateArrayRight() {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] expArr = { 4, 5, 1, 2, 3 };
		rotateArray.rotateArrayRightByN(arr, 2);
		assertArrayEquals(expArr, arr);
	}
}
