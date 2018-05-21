package coding.interview;

import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class ArraysUtilTests {

	@Test
	public void test_binary_search_for_case_having_value() {
		int[] nums = new int[] { 0, 2, 4, 6, 8, 10, 12 };

		System.out.println(Arrays.binarySearch(nums, 8));
		
		assertThat(Arrays.binarySearch(nums, 8), CoreMatchers.is(Searching.binSearch(nums, 8)));
	}
	
	@Test
	public void test_binary_search_in_case_not_having_value() {
		int[] nums = new int[] { 0, 2, 4, 6, 8, 10, 12 };

		System.out.println(Arrays.binarySearch(nums, -1));
		System.out.println(Arrays.binarySearch(nums, 3));
		System.out.println(Arrays.binarySearch(new int[]{}, 0));
		assertThat(Arrays.binarySearch(nums, -1), CoreMatchers.is(Searching.binSearch(nums, -1)));
		assertThat(Arrays.binarySearch(nums, 3), CoreMatchers.is(Searching.binSearch(nums, 3)));
		assertThat(Arrays.binarySearch(new int[]{}, 0), CoreMatchers.is(Searching.binSearch(new int[]{}, 0)));
	}
}
