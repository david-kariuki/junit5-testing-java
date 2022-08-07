/**
 * ParameterizedWithValueSourceTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains parameterized test methods for the classes.OddEven.java class
 * @since 12/7/2022
 */

import classes.OddEven;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedWithValueSourceTest {

    /**
     * Test method to test for true if even is passed to the isEven method
     */
    @ParameterizedTest
    @ValueSource(ints = {Integer.MIN_VALUE, 2, 4, 6, 8, Integer.MAX_VALUE})
    void whenEvenReturnTrue(int number) {
        OddEven oddEven = new OddEven();
        assertTrue(oddEven.isNumberEven(number));
    }

    /**
     * Test method to test for false if even is passed to the isEven method
     */
    @ParameterizedTest
    @ValueSource(ints = {Integer.MIN_VALUE, 3, 5, 7, 9, Integer.MAX_VALUE})
    void whenOddReturnFalse(int number) {
        OddEven oddEven = new OddEven();
        assertFalse(oddEven.isNumberEven(number));
    }
}
