import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * AnnotationEnabledDisabledIfEnvironmentVariableTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the @EnabledIfSystemProperty and @DisabledIfSystemProperty
 *
 * <p>
 * @DisabledIfEnvironmentVariable and
 * @EnabledIfEnvironmentVariable .
 * Junit 5 helps us to disable or enable test cases using various conditions.
 * JUnit Jupiter API provides annotations in org.junit.jupiter.api.condition package to enable/disable tests based
 * on a certain condition. The annotations provided by API can be applied to test methods as well as the class itself.
 * The two annotations which use system environment properties and specified regex to disable or enable tests
 * are - @DisabledIfEnvironmentVariable and @EnabledIfEnvironmentVariable.
 * @since 7/8/2022
 */

@SuppressWarnings("ConstantConditions")
public class AnnotationEnabledDisabledIfEnvironmentVariableTest {

    @Test
    void testOnAllEnvironmentVariables() {
        assertTrue(3 > 0);
    }

    @DisabledIfEnvironmentVariable(named = "USER", matches = "david")
    @Test
    void testDisabledIfUserMatchesName() {
        assertFalse(0 > 4);
    }

    @DisabledIfEnvironmentVariable(named = "HOME", matches = "/dk/home")
    @Test
    void testDisabledIfHomeMatchesDirectory() {
        assertFalse(10 > 40);
    }

    @EnabledIfEnvironmentVariable(named = "USER", matches = "dk")
    @Test
    void testEnabledIfUserMatchesName() {
        assertFalse(0 > 4);
    }

    @EnabledIfEnvironmentVariable(named = "HOME", matches = "/home")
    @Test
    void testEnabledIfHomeMatchesDirectory() {
        assertFalse(10 > 40);
    }
}
