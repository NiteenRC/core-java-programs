package com.nc.coding.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AnagramTest {

	@InjectMocks
	private Anagram anagram;

	@Test
	public void isAnagramPositiveTest() {
		// by replace
		boolean isAnagramR = anagram.isAnagramByReplace("bac", "bac");
		assertEquals(true, isAnagramR);

		// by delete
		boolean isAnagramD = anagram.isAnagramByDelete("bac", "bac");
		assertEquals(true, isAnagramD);

		// by substring
		boolean isAnagramS = anagram.isAnagramBySubString("bac", "bac");
		assertEquals(true, isAnagramS);

		// by sort
		boolean isAnagramSort = anagram.isAnagramBySort("bac", "bac");
		assertEquals(true, isAnagramSort);
	}

	@Test
	public void isAnagramNegativeTest() {
		// by replace
		boolean isAnagramR = anagram.isAnagramByReplace("bac", "baz");
		assertEquals(false, isAnagramR);

		// by delete
		boolean isAnagramD = anagram.isAnagramByDelete("bac", "baz");
		assertEquals(false, isAnagramD);

		// by substring
		boolean isAnagramS = anagram.isAnagramBySubString("bac", "baz");
		assertEquals(false, isAnagramS);

		// by sort
		boolean isAnagramSort = anagram.isAnagramBySort("bac", "baz");
		assertEquals(false, isAnagramSort);
	}

	@Test
	public void isAnagramNegativeLengthTest() {
		// by replace
		boolean isAnagramR = anagram.isAnagramByReplace("bac", "ba");
		assertEquals(false, isAnagramR);

		// by delete
		boolean isAnagramD = anagram.isAnagramByDelete("bac", "ba");
		assertEquals(false, isAnagramD);

		// by substring
		boolean isAnagramS = anagram.isAnagramBySubString("bac", "ba");
		assertEquals(false, isAnagramS);

		// by sort
		boolean isAnagramSort = anagram.isAnagramBySort("bac", "ba");
		assertEquals(false, isAnagramSort);
	}
}
