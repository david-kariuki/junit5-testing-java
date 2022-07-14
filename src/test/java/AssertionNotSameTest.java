/**
 * AssertionNotSameTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for JUnit Assertion - Not Same
 * @since 12/7/2022
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotSame;


@SuppressWarnings("ExcessiveLambdaUsage")
public class AssertionNotSameTest {

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
