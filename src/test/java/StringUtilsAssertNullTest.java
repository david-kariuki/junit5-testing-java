/**
 * StringUtilsAssertNullTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the StringUtils.java class
 * @since 12/7/2022
 */

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertNull;

@SuppressWarnings("ConstantConditions")
public class StringUtilsAssertNullTest {


	/**
	 * Test method to test for Null with assertNull after passing null
	 */
	@Test
	void givenNullString_NullReturned() {
		String actual = StringUtils.reverse(null);

		assertNull(actual); // Assert without message
	}

	/**
	 * Test method to test for Null with assertNull with message after passing empty string ("")
	 */
	@Test
	void givenEmptyString_EmptyStringReturnedWithMessage() {
		String actual = StringUtils.reverse("");

		assertNull(actual, "The actual string should be null -> Passed : \"\" !!"); // Assert with message
	}

	/**
	 * Test method to test for Null with assertNull with message after passing String to reverse
	 */
	@Test
	void givenNonNullString_ReversedStringReturned() {
		String actual = StringUtils.reverse("ABCD");
		Supplier<String> messageSupplier = () -> "The actual string should be null -> Passed : " + actual + " !!";

		assertNull(actual, messageSupplier); // Assert with java 8 MessageSupplier
	}
}
