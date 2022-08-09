/**
 * assertions.AssertFalseTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the classes.StringUtils.java class
 *
 * <p>
 * @note Assertions API provide static assertFalse() method.
 * This method helps us in validating that the actual value supplied to it is false.
 * - If the actual value is false then test case will pass.
 * - If the actual value is true then test case will fail.
 * @since 12/7/2022
 */

package assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SuppressWarnings("ALL")
public class AssertFalseTest {

    /**
     * Method to test assert false with false condition
     */
    @Test
    public void testAssertFalseWithFalseCondition() {
        boolean falseValue = false;
        assertFalse(falseValue);
    }

    /**
     * Method to test assert false with true condition
     */
    @Test
    public void testAssertFalseWithTrueCondition() {
        boolean trueValue = true;
        assertFalse(trueValue);
    }

    /**
     * Method to test assert false with true condition and message
     */
    @Test
    public void testAssertFalseWithTrueConditionAndMessage() {
        boolean trueValue = true;
        assertFalse(trueValue, "The actual value is true");
    }

    /**
     * Method to test assert false with true condition and message supplier
     */
    @Test
    public void testAssertFalseWithTrueConditionAndMessageSupplier() {
        boolean trueValue = true;
        assertFalse(trueValue, () -> "The actual value is true");
    }

    /**
     * Method to test assert false with boolean supplier
     */
    @Test
    public void testAssertFalseWithBooleanSupplier() {
        boolean falseValue = false;
        assertFalse(() -> falseValue);
    }

    /**
     * Method to test assert false with boolean supplier and message
     */
    @Test
    public void testAssertFalseWithBooleanSupplierAndMessage() {
        boolean trueValue = true;
        assertFalse(() -> trueValue, "The actual value is true");
    }

    /**
     * Method to test assert false with boolean supplier and message supplier. condition
     */
    @Test
    public void testAssertFalseWithBooleanSupplierAndMessageSupplier() {
        boolean trueValue = true;
        assertFalse(() -> trueValue, () -> "The actual value is true");
    }
}