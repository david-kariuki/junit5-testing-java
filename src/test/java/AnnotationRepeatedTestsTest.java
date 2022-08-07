/**
 * AnnotationRepeatedTestsTest class
 *
 * @author David Kariuki
 * @apiNote - @RepeatedTests annotation
 *
 * <p>
 * @RepeatedTest JUnit 5 Jupiter provides the ability to repeat a test a specified number of times.
 * It is done by simply annotating a method with @RepeatedTest. To this annotation, we specify a number which is
 * the total number of repetitions desired. For each and every invocation of a repeated test, it behaves like the
 * execution of a regular @Test method. Also, each test is executed with support for the same lifecycle callbacks
 * and extensions. Instead of using @Test annotation, we use @RepeatedTest annotation.
 * @since 12/7/2022
 * <p>
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SuppressWarnings("ConstantConditions")
public class AnnotationRepeatedTestsTest {

    /**
     * Repeated test
     *
     * @note This will iterate 5 times
     */
    @RepeatedTest(5)
    public void simpleRepeatedTest() {
        assertTrue(0 < 5);
    }

    /**
     * Repeated test with DisplayName
     */
    @RepeatedTest(name="{displayName} - {currentRepetition}/{totalRepetitions}",
            value = 5)
    @DisplayName("Repeated test")
    public void repeatedTestWithDisplayName() {
        assertTrue(0 < 5);
    }
}
