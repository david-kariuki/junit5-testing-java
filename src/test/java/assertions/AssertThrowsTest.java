/**
 * assertions.AssertThrowsTest class
 *
 * @author David Kariuki
 *
 * <p>
 * @note assertThrows() method
 * Assertions API provide static assertThrows() method. This method helps in asserting that execution of the
 * supplied Executable throws an exception of the expectedType and returns the exception.
 * - If no exception is thrown, or if an exception of a different type is thrown, this method will fail.
 * - It follows the inheritance hierarchy, so the assert will pass if the expected type is Exception and actual is RuntimeException.
 * @since 1/8/2022
 */

package assertions;

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
