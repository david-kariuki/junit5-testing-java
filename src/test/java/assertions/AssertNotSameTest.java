/**
 * assertions.AssertNotSameTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for JUnit Assertion - Not Same
 *
 * <p>
 * @note assertNotSame() method
 * Assertions API provide static assertNotSame() method. This method helps us in validating that expected and actual
 * do not refer to the exact same object. JUnit uses == operator to perform this assert.
 * - If the actual and expected value refers to the same object then the test case will fail.
 * - If the actual and expected value does not refer to the same object then the test case will pass.
 * @since 12/7/2022
 */

package assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;

@SuppressWarnings("ExcessiveLambdaUsage")
public class AssertNotSameTest {

    /**
     * Method to test AssertionNotSame with different object
     */
    @Test
    public void testAssertNotSameWithDifferentObject() {
        String actual = "hello";
        String expected = "hello there";
        assertNotSame(expected, actual);
    }

    /**
     * Method to test AssertionNotSame with same object
     */
    @Test
    public void testAssertNotSameWithSameObject() {
        String actual = "hello";
        String expected = "hello";
        assertNotSame(expected, actual);
    }

    /**
     * Method to test AssertionNotSame with same object and message
     */
    @Test
    public void testAssertNotSameWithSameObjectAndMessage() {
        String actual = "hello";
        String expected = "hello";
        assertNotSame(expected, actual, "The actual value is same as expected value");
    }

    /**
     * Method to test AssertionNotSame with same object and message supplier
     */
    @Test
    public void testAssertNotSameWithSameObjectAndMessageSupplier() {
        String actual = "hello";
        String expected = "hello";
        assertNotSame(expected, actual, () -> "The actual value is same as expected value");
    }
}
