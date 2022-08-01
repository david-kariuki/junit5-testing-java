import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * StringUtilsAssertionTrueTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the StringUtils.java class
 * @since 12/7/2022
 */

@SuppressWarnings("ConstantConditions")
public class StringUtilsAssertionTrueTest {

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
