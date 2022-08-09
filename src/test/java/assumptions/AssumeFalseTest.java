/**
 * assumptions.AssumeFalseTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the AssumeFalse assumption
 *
 * <p>
 * @note assumeFalse()
 * Assumptions API in JUnit 5 has a static utility method called as assumeFalse(). It validates the given assumption to false.
 * - If the assumption is false then test proceeds to execution.
 * - If the assumption is true then test execution is aborted.
 * @since 7/8/2022
 */

package assumptions;

import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assumptions.assumeFalse;

public class AssumeFalseTest {

    /**
     * Test for assertTrue for true condition without message
     */
    @Test
    void testOnDevelopmentEnvironment() throws TestAbortedException {
        System.setProperty("ENV", "DEV");
        assumeFalse("DEV".equals(System.getProperty("ENV"))); // Fails
        // Remainder of test will proceed
    }

    /**
     * Test for assertTrue for false condition without message
     */
    @Test
    void testOnProductionEnvironment() throws TestAbortedException {
        System.setProperty("ENV", "PROD");
        assumeFalse("DEV".equals(System.getProperty("ENV"))); // Passes
        // Remainder of test will be aborted
    }

    /**
     * Test for assertTrue for false condition with message
     */
    @Test
    void testOnProductionEnvironmentWithMessage() throws TestAbortedException {
        System.setProperty("ENV", "PROD");
        assumeFalse("DEV".equals(System.getProperty("ENsV")), "Assumption failed"); // Passes
        // Remainder of test will be aborted
    }

    /**
     * Test for assertTrue for false condition with message supplier
     */
    @Test
    void testOnProductionEnvironmentWithMessageSupplier() throws TestAbortedException {
        System.setProperty("ENV", "PROD");
        assumeFalse("DEV".equals(System.getProperty("ENV")), () -> "Assumption failed"); // Passes
        // Remainder of test will be aborted
    }
}
