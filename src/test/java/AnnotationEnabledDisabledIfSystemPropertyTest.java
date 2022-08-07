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
