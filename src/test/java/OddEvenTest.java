/**
 * OddEvenTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the OddEven.java class
 * @since 12/7/2022
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
	void  givenOddNumber_whenIsEvenIsCalled_returnedFalseIs() {
		OddEven oddEven = new OddEven();
		assertFalse(oddEven.isNumberEven(13));
	}
}
