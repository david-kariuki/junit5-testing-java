/**
 * AssertIterableEqualsTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the StringUtils.java class
 * @since 12/7/2022
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

@SuppressWarnings({"ExcessiveLambdaUsage"})
public class AssertIterableEqualsTest {

	/**
	 * Method to test for Equal using AssertIterableEquals() for equal iterables
	 */
	@Test
	public void testAssertIterableEqualsForEqualIterables() {

		Iterable<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		Iterable<Integer> actual = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

		assertIterableEquals(expected, actual);
	}

	/**
	 * Method to test for Equal using AssertIterableEquals() for non-equal iterables
	 */
	@Test
	public void testAssertIterableEqualsForNonEqualIterables() {

		Iterable<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		Iterable<Integer> actual = new ArrayList<>(Arrays.asList(1, 2, 3));

		assertIterableEquals(expected, actual, "Iterables are not equal.");
	}

	/**
	 * Method to test for Equal using AssertIterableEquals() for equal iterables with different order
	 */
	@Test
	public void testAssertIterableEqualsForEqualIterablesWithDifferentOrder() {

		Iterable<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		Iterable<Integer> actual = new ArrayList<>(Arrays.asList(1, 2, 4, 3));

		assertIterableEquals(expected, actual, () -> "Iterables order is different");
	}
}
