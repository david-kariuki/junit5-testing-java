/**
 * assertions.AssertNotNullTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the classes.StringUtils.java class
 *
 * <p>
 * @note Assertions API provide static assertNotNull() method.
 * This method helps us in validating that particular object is not null. This method takes the actual value and
 * checks whether it is null or not.
 * - If the actual value is not null then test case will pass.
 * - If the actual value is null then test case will fail.
 * @since 12/7/2022
 */

package assertions;

import classes.StringUtils;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SuppressWarnings("ConstantConditions")
public class AssertNotNullTest {


    /**
     * Test method to test for NotNull with assertNull after passing null
     */
    @Test
    void givenNullString_NullReturnedWithMessage() {
        String actual = StringUtils.reverse(null);
        String message = "Actual String should not be null -> Passed : null !!! ";

        assertNotNull(actual, message); // assertNotNull with message
    }

    /**
     * Test method to test for NotNull with assertNull after passing null
     */
    @Test
    void givenNullString_NullReturnedWithMessage_FromMessageSupplier() {
        String actual = StringUtils.reverse(null);
        Supplier<String> messageSupplier = () -> "Actual String should not be null -> Passed : null !!! ";

        assertNotNull(actual, messageSupplier); // assertNotNull with message from message supplier
    }

    /**
     * Test method to test for NotNull with assertNull with message after passing empty string ("")
     */
    @Test
    void givenEmptyString_EmptyStringReturnedWithMessage() {
        String actual = StringUtils.reverse("");

        // Assert with message
        assertNotNull(actual, "The actual string should be null -> Passed : \"\"!!");
    }

    /**
     * Test method to test for NotNull with assertNull with message after passing String to reverse
     */
    @Test
    void givenNonNullString_ReversedStringReturned() {
        String actual = StringUtils.reverse("ABCD");
        Supplier<String> messageSupplier = () -> "The actual string should be null -> Passed : " + actual + " !!";

        assertNotNull(actual, messageSupplier); // Assert with java 8 MessageSupplier
    }
}
