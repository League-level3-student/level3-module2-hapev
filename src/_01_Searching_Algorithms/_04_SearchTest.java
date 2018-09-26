package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	public void testLinearSearch() {
		// 1. use the assertEquals method to test your linear search method.
		String[] s1 = { "hello", "hi", "howdy" };
		String[] s2 = { "wow", "woww", "wowww" };
		String[] s3 = { "evan", "joe", "bob", "bill" };
		assertEquals(_00_LinearSearch.linearSearch(s1, "hi"), 1);
		assertEquals(_00_LinearSearch.linearSearch(s2, "wowww"), 2);
		assertEquals(_00_LinearSearch.linearSearch(s3, "bill"), 3);
	}

	@Test
	public void testBinarySearch() {
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted
		String[] s1 = { 5, "hi", "howdy" };
		String[] s2 = { "wow", "woww", "wowww" };
		String[] s3 = { "evan", "joe", "bob", "bill" };
		assertEquals(_00_LinearSearch.linearSearch(s1, "hi"), 1);
		assertEquals(_00_LinearSearch.linearSearch(s2, "wowww"), 2);
		assertEquals(_00_LinearSearch.linearSearch(s3, "bill"), 3);
	}

	@Test
	public void testInterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
	}

	@Test
	public void testExponentialSearch() {
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
	}
}
