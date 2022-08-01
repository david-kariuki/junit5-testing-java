/**
 * AssertTimeoutTest class
 *
 * @author David Kariuki
 * @since 1/8/2022
 */

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class AssertTimeoutTest {

	/**
	 * Method with greeting message
	 */
	private static String greeting() {
		return "Hello, World!";
	}

	/**
	 * Test method to test for timeout - Without result
	 */
	@Test
	void timeoutNotExceeded() {

		// The following assertion succeeds.
		assertTimeout(Duration.ofMinutes(3), () -> {
			// Perform task that takes less than 3 minutes.
		});
	}

	/**
	 * Test method to test for timeout - With result
	 */
	@Test
	void timeoutNotExceededWithResult() {

		// The following assertion succeeds, and returns the supplied object.
		String actualResult = assertTimeout(Duration.ofMinutes(3), () ->  "result");

		assertEquals("result", actualResult);
	}

	/**
	 * Test method to test for timeout - With method
	 */
	@Test
	void timeoutNotExceededWithMethod() {

		// The following assertion invokes a method reference and returns an object.
		String actualGreeting = assertTimeout(Duration.ofMinutes(3), AssertTimeoutTest::greeting);
		assertEquals("Hello, World!", actualGreeting);
	}

	@Test
	void timeoutExceeded() {

		// The following assertion fails with an error message similar to:
		// execution exceeded timeout of 10 ms by 91 ms
		assertTimeout(Duration.ofMillis(10), () -> {
			// Simulate task that takes more than 10 ms.
			Thread.sleep(100);
		});
	}
}
