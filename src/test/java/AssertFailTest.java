/**
 * AssertFailTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the classes.StringUtils.java class
 * @since 12/7/2022
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class AssertFailTest {

	/**
	 * Usage 1 - @Test not implemented with fail()
	 */
	@Test
	public void testMethodYetNotImplemented() {
		fail();
	}

	/**
	 * Usage 2 - @Test not implemented with fail(String message)
	 */
	@Test
	public void testMethodYetNotImplemented1() {
		fail("@Test method not yet implemented !!!");
	}

	/**
	 * Usage 3 - @Test not implemented with fail(Supplier<String> messageSupplier)
	 */
	@Test
	public void testMethodYetNotImplemented2() {
		//noinspection ExcessiveLambdaUsage
		fail(() -> "@Test method not yet implemented !!!");
	}

	/**
	 * Usage 4 - @Test not implemented with fail(Throwable throwable)
	 */
	@Test
	public void testMethodYetNotImplemented3() {
		fail(new RuntimeException("@Test method not yet implemented !!!"));
	}

	/**
	 * Usage 5 - @Test not implemented with fail(String message, Throwable throwable)
	 */
	@Test
	public void testMethodYetNotImplemented4() {
		fail("@Test method not yet implemented !!!", new RuntimeException("Failed explicitly"));
	}

	/**
	 * Usage 6 - It can be used to verify that an actual exception is thrown
	 */
	@Test
	public void testActualExceptionThrown() {
		try {
			throwUnsupportedOperationException();
			fail("Exception not thrown !!!");
		} catch (UnsupportedOperationException e) {
			// Test case passed
		}
	}

	/**
	 * Method to throw UnsupportedOperationException Exception
	 */
	private void throwUnsupportedOperationException() {
		throw new UnsupportedOperationException(); // Uncommenting this line will fail the test case
	}
}
