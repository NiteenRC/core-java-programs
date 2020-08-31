package com.nc.coding.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PrimeNumberTest {

	@InjectMocks
	private PrimeNumber primeNumber;

	@Test
	public void isPrimeNumberTest() {
		boolean isPrime = primeNumber.isPrime(3);
		assertEquals(true, isPrime);
	}

	@Test
	public void printPrimeNumbersTest() {
		String primeNumbers = primeNumber.printPrimeNumbers(100);
		assertEquals("2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97", primeNumbers);
		System.out.println(primeNumbers);
	}
}
