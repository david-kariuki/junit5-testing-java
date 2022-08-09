/**
 * assertions.AssertArrayEqualsTest class
 *
 * @author David Kariuki
 *
 * <p>
 * @note assertArrayEquals() method
 * Assertions API provide static assertArrayEquals() method. This method helps us in validating that expected and
 * actual arrays are equal. It has many overloaded methods to assert different types of array objects.
 * - If the actual and expected arrays are equal then the test case will pass.
 * - If the actual and expected arrays are not equal then the test case will fail.
 * @since 1/8/2022
 */

package assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SuppressWarnings({"ExcessiveLambdaUsage"})
public class AssertArrayEqualsTest {

    /**
     * Test method to test for Equals with AssertArrayEquals for equal arrays
     */
    @Test
    public void testAssertArrayEqualsForEqualArrays() {

        int[] expected = {1, 2, 3, 4};
        int[] actual = {1, 2, 3, 4};

        assertArrayEquals(expected, actual);
    }

    /**
     * Test method to test for Equals with AssertArrayEquals for non-equal arrays
     */
    @Test
    public void testAssertArrayEqualsForNonEqualArrays() {

        int[] expected = {1, 2, 3, 4};
        int[] actual = {1, 2, 3};

        assertArrayEquals(expected, actual, "Arrays are not equal.");
    }

    /**
     * Test method to test for Equals with AssertArrayEquals for equal arrays with different order
     */
    @Test
    public void testAssertArrayEqualsForEqualArraysWithDifferentOrder() {

        int[] expected = {1, 2, 4, 3};
        int[] actual = {1, 2, 3, 4};

        assertArrayEquals(expected, actual, () -> "Arrays order is different");
    }
}
