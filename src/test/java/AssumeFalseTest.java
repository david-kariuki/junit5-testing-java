import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assumptions.assumeFalse;

/**
 * AssumeFalseTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the AssumeFalse assumption
 * @since 7/8/2022
 */

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
