package com.nc.datastrucure;

public class RotateArray {
	public void rotateArrayRightByN(int[] arr, int input) {
		for (int i = 0; i < input; i++) {
			int last = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
		}
	}

	public void rotateArrayLeftByN(int[] arr, int input) {
		for (int i = 0; i < input; i++) {
			int first = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = first;
		}
	}
}
