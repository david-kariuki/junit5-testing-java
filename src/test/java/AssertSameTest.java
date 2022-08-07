import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * AssertSameTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for JUnit Assertion - Same
 *
 * <p>
 * @note assertSame() method
 * Assertions API provide static assertSame() method. This method helps us in validating that expected and
 * actual refer to the exact same object. JUnit uses == operator to perform this assert.
 * - If the actual and expected value refers to the same object then the test case will pass.
 * - If the actual and expected value does not refer to the same object then the test case will fail.
 * @since 12/7/2022
 */

@SuppressWarnings("ExcessiveLambdaUsage")
public class AssertSameTest {

    /**
     * Method to test assertion same with same object
     */
    @Test
    public void testAssertSameWithSameObject() {
        String actual = "hello";
        String expected = "hello";
        assertSame(expected, actual);
    }

    /**
     * Method to test assertion same with different object
     */
    @Test
    public void testAssertSameWithDifferentObject() {
        String actual = "hello";
        String expected = "hello there";
        assertSame(expected, actual);
    }

    /**
     * Method to test assertion same with different object and message
     */
    @Test
    public void testAssertSameWithDifferentObjectAndMessage() {
        String actual = "hello";
        String expected = "hello there";
        assertSame(expected, actual, "The actual value is not same as expected value");
    }

    /**
     * Method to test assertion same with different object and message supplier
     */
    @Test
    public void testAssertSameWithDifferentObjectAndMessageSupplier() {
        String actual = "hello";
        String expected = "hello there";
        assertSame(expected, actual, () -> "The actual value is not same as expected value");
    }
}
