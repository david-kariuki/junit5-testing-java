/**
 * AssertTimeout class
 *
 * @author David Kariuki
 * @since 1/8/2022
 */

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTimeoutPreemptivelyTest {

	/**
	 * Test method to terminate preemtively after timeout
	 */
	@Test
	void timeoutExceededWithPreemptiveTermination() {
		// The following assertion fails with an error message similar to:
		// execution timed out after 10 ms
		assertTimeoutPreemptively(Duration.ofMillis(10), () -> {
			// Simulate task that takes more than 10 ms.
			Thread.sleep(100);
		});
	}
}
