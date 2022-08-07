import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

/**
 * AssumeThatTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the AssumeThat assumption
 * @since 7/8/2022
 */

public class AssumeThatTest {

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
