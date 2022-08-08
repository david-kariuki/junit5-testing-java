import jdk.jfr.Enabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * AnnotationEnabledDisabledOnJRETest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the EnabledOnJre and @DisabledOnJre
 *
 * <p>
 * @DisabledOnJre and
 * @EnabledOnJre .
 * Junit 5 helps us to disable or enable test cases using various conditions.
 * JUnit Jupiter API provides annotations in org.junit.jupiter.api.condition package to enable/disable tests based on
 * a certain condition. The annotations provided by API can be applied to test methods as well as the class itself.
 * The two annotations which are applied to disable/enable tests based on the particular version of the Java Runtime
 * Environment (JRE) are - @DisabledOnJre and @EnabledOnJre.
 * @since 7/8/2022
 */

@SuppressWarnings("ConstantConditions")
@Enabled
public class AnnotationEnabledDisabledOnJRETest {

    @Test
    void testOnAllJre() {
        assertTrue(3 > 0);
    }

    @DisabledOnJre(JRE.JAVA_8)
    @Test
    void testDisableOnJava8() {
        assertFalse(0 > 4);
    }

    @DisabledOnJre(JRE.JAVA_9)
    @Test
    void testDisableOnJava9() {
        assertFalse(10 > 40);
    }

    @EnabledOnJre(JRE.JAVA_17)
    @Test
    void testEnabledOnJava17() {
        assertFalse(0 > 4);
    }

    @EnabledOnJre(JRE.JAVA_18)
    @Test
    void testEnabledOnJava18() {
        assertFalse(10 > 40);
    }

    @Test
    @DisplayName("Should Run on Java version from 13 to 17")
    @EnabledForJreRange(min = JRE.JAVA_13, max = JRE.JAVA_17)
    void shouldRunOnJreFrom8to17() {
        assertFalse(22 > 43);
    }

    @Test
    @DisplayName("Should Not Run on Java version from 8 to 12")
    @DisabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_12)
    void shouldNotRunOnJreFrom2to7() {
        assertFalse(40 < 3);
    }
}
