import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * AnnotationEnabledDisabledIfSystemPropertyTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the @EnabledIfSystemProperty and @DisabledIfSystemProperty
 *
 * <p>
 * @DisabledIfSystemProperty and
 * @EnabledIfSystemProperty .
 * Junit 5 helps us to disable or enable test cases using various conditions.
 * JUnit Jupiter API provides annotations in org.junit.jupiter.api.condition package to enable/disable tests based
 * on a certain condition. The annotations provided by API can be applied to test methods as well as the class itself.
 * The two annotations which use system properties and specified regex to disable or enable tests
 * are - @DisabledIfSystemProperty and @EnabledIfSystemProperty.
 * @since 7/8/2022
 */

@SuppressWarnings("ConstantConditions")
public class AnnotationEnabledDisabledIfSystemPropertyTest {

    @Test
    void testOnAllSystemProperties() {
        assertTrue(3 > 0);
    }

    @DisabledIfSystemProperty(named = "user.name", matches = "David")
    @Test
    void testDisabledIfUserNameMatchesName() {
        assertFalse(0 > 4);
    }

    @DisabledIfSystemProperty(named = "os.name", matches = "Windows")
    @Test
    void testDisabledIfOperatingSystemMatchesWindows() {
        assertFalse(10 > 40);
    }

    @EnabledIfSystemProperty(named = "user.name", matches = "David Kariuki")
    @Test
    void testEnabledIfUserNameMatchesName() {
        assertFalse(0 > 4, "0 !> 4");
    }

    @EnabledIfSystemProperty(named = "os.name", matches = "Linux")
    @Test
    void testEnabledIfOperatingSystemMatchesWindows() {
        assertFalse(10 > 40);
    }
}
