/**
 * AssertArrayEqualsTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the StringUtils.java class
 * @since 12/7/2022
 */

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings({"ExcessiveLambdaUsage"})
public class AssertArrayEqualsTest {


	/**
	 * Test method to test for Equals with AssertArrayEquals for equal arrays
	 */
	@Test
	public void testAssertArrayEqualsForEqualArrays() {

		int[] expected = {1, 2, 3, 4};
		int[] actual = {1, 2, 3, 4};

		assertArrayEquals(expected, actual);
	}

	/**
	 * Test method to test for Equals with AssertArrayEquals for non-equal arrays
	 */
	@Test
	public void testAssertArrayEqualsForNonEqualArrays() {

		int[] expected = {1, 2, 3, 4};
		int[] actual = {1, 2, 3};

		assertArrayEquals(expected, actual, "Arrays are not equal.");
	}

	/**
	 * Test method to test for Equals with AssertArrayEquals for equal arrays with different order
	 */
	@Test
	public void testAssertArrayEqualsForEqualArraysWithDifferentOrder() {

		int[] expected = {1, 2, 4, 3};
		int[] actual = {1, 2, 3, 4};

		assertArrayEquals(expected, actual, () -> "Arrays order is different");
	}
}
