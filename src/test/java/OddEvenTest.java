/**
 * OddEvenTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the classes.OddEven.java class
 * @since 12/7/2022
 */

import classes.OddEven;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OddEvenTest {

    /**
     * Test method to test for true if even is passed to the isEven method
     */
    @Test
    void givenEvenNumber_whenIsEvenIsCalled_returnTrue() {
        OddEven oddEven = new OddEven();
        assertTrue(oddEven.isNumberEven(10));
    }

    /**
     * Test method to test for false if even is passed to the isEven method
     */
    @Test
    void givenOddNumber_whenIsEvenIsCalled_returnedFalseIs() {
        OddEven oddEven = new OddEven();
        assertFalse(oddEven.isNumberEven(13));
    }
}
