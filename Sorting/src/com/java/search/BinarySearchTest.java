package com.java.search;

import org.junit.Assert;
import org.junit.Test;


/**
 * Test class for {@link BinarySearch} class with different possible search values
 * 
 * @author Nireesha Challa <nireesha78@gmail.com>
 *
 */
public class BinarySearchTest {
	
	// 1. Random Input Search
	@Test
	public void randomInputSearchTest() {
		int[] input = {10, 70, 40, 90, 30, 80, 50, 20, 60};
		Assert.assertNotEquals(-1, BinarySearch.binarySearch(input, 20));
	}
	
	// 2. Sorted input search
	@Test
	public void sortedInputSearchTest() {
		int[] input = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		Assert.assertNotEquals(-1, BinarySearch.binarySearch(input, 80));
	}
	
	// 3. Sorted input search with no result
	@Test
	public void sortedInputSearchNoResultTest() {
		int[] input = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		Assert.assertEquals(-1, BinarySearch.binarySearch(input, -60));
	}
	
	// 4. Mixed random input search
	@Test
	public void mixedRandomInputSearchTest() {
		int[] input = {-10, 30, -59, 99, -999, 60, 680, -675, 90};
		Assert.assertNotEquals(-1, BinarySearch.binarySearch(input, -999));
	}
	
	// 5. Mixed random input search with no result
	@Test
	public void mixedRandomInputSearchNoResultTest() {
		int[] input = {-10, 30, -59, 99, -999, 60, 680, -675, 90};
		Assert.assertEquals(-1, BinarySearch.binarySearch(input, 999));
	}
	
	// 6. Negative input search
	@Test
	public void negativeInputSearcTest() {
		int[] input = {-10, -89, -59, -722, -999, -43, -680, -236, -100};
		Assert.assertNotEquals(-1, BinarySearch.binarySearch(input, -236));
	}
	
	// 7. Negative input search with no result
	@Test
	public void negativeInputSearcNoResultTest() {
		int[] input = {-10, -89, -59, -722, -999, -43, -680, -236, -100};
		Assert.assertEquals(-1, BinarySearch.binarySearch(input, 236));
	}
	
	// 8. No input search - no result
	@Test
	public void noInputSearcTest() {
		int[] input = {};
		Assert.assertEquals(-1, BinarySearch.binarySearch(input, 10));
	}
	
	// 9. Null input search - no result
	@Test
	public void nullInputSearcTest() {
		int[] input = null;
		Assert.assertEquals(-1, BinarySearch.binarySearch(input, 10));
	}
	
	// 10. Zeros input search
	@Test
	public void zerosInputSearcTest() {
		int[] input = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		Assert.assertNotEquals(-1, BinarySearch.binarySearch(input, 0));
	}
	
	// 11. Zeros input search - no result
	@Test
	public void zerosInputSearcNoResultTest() {
		int[] input = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		Assert.assertEquals(-1, BinarySearch.binarySearch(input, 10));
	}
	
	// 12. Same input search - no result
	@Test
	public void sameInputSearcNoResultTest() {
		int[] input = {20, 20, 20, 20, 20, 20, 20, 20};
		Assert.assertEquals(-1, BinarySearch.binarySearch(input, 100));
	}
	
	// 13. Same input search
	@Test
	public void sameInputSearcTest() {
		int[] input = {20, 20, 20, 20, 20, 20, 20, 20};
		Assert.assertNotEquals(-1, BinarySearch.binarySearch(input, 20));
	}
	
	// 14. Same input search
	@Test
	public void mixedInputSearcTest() {
		int[] input = {-352, 434, -720, 0, 603, -829, 930, -100, 0};
		Assert.assertNotEquals(-1, BinarySearch.binarySearch(input, 0));
	}
	
	// 15. Same input search - no result
	@Test
	public void mixedInputSearcNoResultTest() {
		int[] input = {-352, 434, -720, 0, 603, -829, 930, -100, 0};
		Assert.assertEquals(-1, BinarySearch.binarySearch(input, 100));
	}
	
}
