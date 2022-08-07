/**
 * AssertTrueTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the classes.StringUtils.java class
 *
 * <p>
 * @note Assertions API provide static assertTrue() method.
 * This method helps us in validating that the actual value supplied to it is true.
 * - If the actual value is true then test case will pass.
 * - If the actual value is not true then test case will fail.
 * @since 12/7/2022
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SuppressWarnings({"ConstantConditions", "ExcessiveLambdaUsage"})
public class AssertTrueTest {

    /**
     * Method to assert true with true condition
     */
    @Test
    public void testAssertTrueWithTrueCondition() {
        boolean trueValue = true;
        assertTrue(trueValue);
    }

    /**
     * Method to assert true with false condition
     */

    @Test
    public void testAssertTrueWithFalseCondition() {
        boolean falseValue = false;
        assertTrue(falseValue);
    }

    /**
     * Method to assert true with true condition with message
     */
    @Test
    public void testAssertTrueWithFalseConditionAndMessage() {
        boolean falseValue = false;
        assertTrue(falseValue, "The actual value is false");
    }

    /**
     * Method to assert true with false condition with message from Supplier
     */
    @Test
    public void testAssertTrueWithFalseConditionAndMessageSupplier() {
        boolean falseValue = false;
        assertTrue(falseValue, () -> "The actual value is false");
    }

    @Test
    public void testAssertTrueWithBooleanSupplier() {
        boolean trueValue = true;
        assertTrue(() -> trueValue);
    }

    @Test
    public void testAssertTrueWithBooleanSupplierAndMessage() {
        boolean falseValue = false;
        assertTrue(() -> falseValue, "The actual value is false");
    }

    @Test
    public void testAssertTrueWithBooleanSupplierAndMessageSupplier() {
        boolean falseValue = false;
        assertTrue(() -> falseValue, () -> "The actual value is false");
    }
}
