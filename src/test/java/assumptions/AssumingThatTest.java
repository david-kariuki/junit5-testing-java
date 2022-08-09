/**
 * assumptions.AssumingThatTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the AssumeThat assumption
 *
 * <p>
 * @note AssumingThat()
 * Assumptions API in JUnit 5 has a static utility method called, assumingThat(). This method takes a boolean
 * assumption and an Executable. It validates the given assumption and based on its outcome it decides whether
 * to execute an Executable or not.
 * - If the assumption is invalid, this method does nothing.
 * - If the supplied assumption is valid, it executes the supplied Executable.
 * @since 7/8/2022
 */

package assumptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;


public class AssumingThatTest {

    /**
     * Test method to test assumeThat assumption for true condition
     */
    @Test
    void testInAllEnvironments() {
        System.setProperty("ENV", "DEV");
        assumingThat("DEV".equals(System.getProperty("ENV")),
                () -> {
                    // Perform these assertions only on the Dev server
                    System.out.println("Perform these assertions only on the Dev server !!!");
                    assertEquals(2, 1 + 1);
                });

        // Perform these assertions in all environments
        assertEquals(42, 40 + 2);
    }

    /**
     * Test method to test assumeThat assumption for false condition
     */
    @Test
    void testInAllEnvironments2() {
        System.setProperty("ENV", "DEV");
        assumingThat("PROD".equals(System.getProperty("ENV")),
                () -> {
                    // Perform these assertions only on the Prod server
                    System.out.println("Perform these assertions only on the Prod server !!!");
                    assertEquals(2, 1 + 1);
                });

        // perform these assertions in all environments
        assertEquals(42, 40 + 2);
    }
}
