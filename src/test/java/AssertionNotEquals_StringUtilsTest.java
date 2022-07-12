/**
 * AssertionNotEquals_StringUtilsTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the StringUtils.java class
 * @since 12/7/2022
 */

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SuppressWarnings("ConstantConditions")
public class AssertionNotEquals_StringUtilsTest {


	/**
	 * Test method to test for NotEquals with assertNull after passing null
	 */
	@Test
	void givenNullString_NullReturned() {
		String actual = StringUtils.reverse(null);
		String expected = null;

		assertNotEquals(expected, actual); // Assert without message
	}

	/**
	 * Test method to test for NotEquals with assertNull with message after passing empty string ("")
	 */
	@Test
	void givenEmptyString_EmptyStringReturnedWithMessage() {
		String actual = StringUtils.reverse("");
		String expected = "";
		assertNotEquals(expected, actual, "The actual string should be null -> Passed : \"\" !!"); // Assert with message
	}

	/**
	 * Test method to test for NotEquals with assertNull with message after passing String to reverse
	 */
	@Test
	void givenNonNullString_ReversedStringReturned() {
		String actual = StringUtils.reverse("ABCD");
		String expected = "DCBA";
		Supplier<String> messageSupplier = () -> "The actual string should be null -> Passed : " + actual + " !!";

		assertNotEquals(expected, actual, messageSupplier); // Assert with java 8 MessageSupplier
	}

	/**
	 * Test method to test for NotEquals with assertNull with message after passing String to reverse
	 * Intentionally added falsified expected output
	 */
	@Test
	void givenNonNullString_ReversedStringReturned2() {
		String actual = StringUtils.reverse("ABCD");
		String expected = "ABCD";
		Supplier<String> messageSupplier = () -> "The actual string should be null -> Passed : " + actual + " !!";

		assertNotEquals(expected, actual, messageSupplier); // Assert with java 8 MessageSupplier
	}
}
