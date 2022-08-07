/**
 * AnnotationEnabledDisabledOnOSTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the EnabledOnOs and @DisabledOnOs
 *
 * <p>
 * @DisabledOnOs and
 * @EnabledOnOs .
 * Junit 5 helps us to disable or enable test cases using various conditions. JUnit Jupiter API provides annotations
 * in org.junit.jupiter.api.condition package to enable/disable tests based on a certain condition.
 * The annotations provided by API can be applied to test methods as well as the class itself.
 * The two annotations which are applied to disable/enable tests based on Operating system
 * are - @DisabledOnOs and @EnabledOnOs.
 * @since 7/8/2022
 */


import jdk.jfr.Enabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SuppressWarnings("ConstantConditions")
@Enabled
public class AnnotationEnabledDisabledOnOSTest {

    @Test
    void testOnAllOs() {
        assertTrue(3 > 0);
    }

    @DisabledOnOs(OS.MAC)
    @Test
    void testDisableOnMacOs() {
        assertFalse(0 > 4);
    }

    @DisabledOnOs(OS.WINDOWS)
    @Test
    void testDisableOnWindowOs() {
        assertFalse(10 > 40);
    }

    @EnabledOnOs(OS.LINUX)
    @Test
    void testEnableOnLinuxOs() {
        assertFalse(10 > 50);
    }

    @EnabledOnOs(OS.SOLARIS)
    @Test
    void testEnableOnSolarisOs() {
        assertFalse(15 > 40);
    }
}
