package com.nc.coding.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FibonacciSeriesTest {

	@InjectMocks
	private FibonacciSeries fibonacciSeries;

	@Test
	public void printFibonacciTest() {
		String fib = fibonacciSeries.printFibonacci(15);
		assertEquals("0 1 1 2 3 5 8 13 21 34 55 89 144 233 377", fib);
	}

	@Test
	public void printFibonacciRecursionTest() {
		int fib = fibonacciSeries.fibonacciRecursion(15);
		assertEquals(610, fib);
	}

	@Test
	public void printFibonacciRecursivelyTest1() {
		String fib = fibonacciSeries.print(15);
		assertEquals("0 1 1 2 3 5 8 13 21 34 55 89 144 233 377", fib);
	}
}
