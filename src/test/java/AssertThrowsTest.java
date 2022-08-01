/**
 * AssertThrowsTest class
 *
 * @author David Kariuki
 * @since 1/8/2022
 */

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;


@SuppressWarnings({"ResultOfMethodCallIgnored", "ExcessiveLambdaUsage"})
public class AssertThrowsTest {

	/**
	 * Test method to test for Exception using the AssertThrow assertion FOR DIVISION BY ZERO
	 */
	@Test
	public void testAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> divide(1, 0), "Division by zero (ArithmeticException) !!!");
	}

	/**
	 * Method to test for Exception using the AssertThrow assertion
	 */
	@Test
	public void testAssertThrowsWithMessage() {
		assertThrows(IOException.class,
				() -> divide(1, 0), "Division by zero (IO Exception) - With Message !!!");
	}

	@Test
	public void testAssertThrowsWithMessageSupplier() {
		assertThrows(IOException.class,
				() -> divide(1, 0), () -> "Division by zero (IO Exception) With MessageSupplier !!!");
	}

	/**
	 * Method to perform division operation
	 *
	 * @param a - A
	 * @param b - B
	 * @return int
	 */
	@SuppressWarnings({"UnusedReturnValue", "SameParameterValue"})
	private int divide(final int a, final int b) {
		return (a / b);
	}
}
