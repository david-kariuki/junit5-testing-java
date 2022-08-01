import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * AssertSameTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for JUnit Assertion - Same
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
