package com.nc.coding.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ReverseNumStringTest {
	@InjectMocks
	private ReverseNumString reverseString;

	@Test
	public void reverseByStringConcatTest() {
		String reverseRes = reverseString.reverseByStringConcat("abcd");
		assertEquals("dcba", reverseRes);
	}

	@Test
	public void reverseByStringBuilderTest() {
		String reverseRes = reverseString.reverseByStringBuilder("abcd");
		assertEquals("dcba", reverseRes);
	}

	@Test
	public void reverseStringRecursivelyTest() {
		String reverseRes = reverseString.reverseByRecursively("abcd");
		assertEquals("dcba", reverseRes);
	}

	@Test
	public void reverseEachStringByStringConcatTest() {
		String reverseRes = reverseString.reverseEachStringByStringConcat("abcd bdsa");
		System.out.println(reverseRes);
		assertEquals("dcba asdb", reverseRes);
	}

	@Test
	public void reverseNumberTest() {
		int reverseRes = reverseString.reverseNumber(1234);
		assertEquals(4321, reverseRes);
	}
	
	@Test
	public void reverseNumber1Test() {
		int reverseRes = reverseString.reverseNumber(1534236469);
		//assertEquals(0, reverseRes);
	}
	
	
}
