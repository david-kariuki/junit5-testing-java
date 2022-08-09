/**
 * assumptions.AssumeTrueTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the AssumeTrue assumption
 *
 * <p>
 * @note AssumeTrue()
 * Assumptions API in JUnit 5 has a static utility method called as, assumeTrue(). It validates the given
 * assumption to true.
 * - If the assumption is true then test proceeds to execution.
 * - If the assumption is false then test execution is aborted.
 * @since 7/8/2022
 */

package assumptions;

import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assumptions.assumeTrue;


public class AssumeTrueTest {

    /**
     * Test for assertTrue for true condition without message
     */
    @Test
    void testOnDevelopmentEnvironment() throws TestAbortedException {
        System.setProperty("ENV", "DEV");
        assumeTrue("DEV".equals(System.getProperty("ENV"))); // Passes
        // Remainder of test will proceed
    }

    /**
     * Test for assertTrue for false condition without message
     */
    @Test
    void testOnProductionEnvironment() throws TestAbortedException {
        System.setProperty("ENV", "PROD");
        assumeTrue("DEV".equals(System.getProperty("ENV"))); // Fails
        // Remainder of test will be aborted
    }

    /**
     * Test for assertTrue for false condition with message
     */
    @Test
    void testOnProductionEnvironmentWithMessage() throws TestAbortedException {
        System.setProperty("ENV", "PROD");
        assumeTrue("DEV".equals(System.getProperty("ENsV")), "Assumption failed"); // Fails
        // Remainder of test will be aborted
    }

    /**
     * Test for assertTrue for false condition with message supplier
     */
    @Test
    void testOnProductionEnvironmentWithMessageSupplier() throws TestAbortedException {
        System.setProperty("ENV", "PROD");
        assumeTrue("DEV".equals(System.getProperty("ENV")), () -> "Assumption failed"); // Fails
        // Remainder of test will be aborted
    }
}
