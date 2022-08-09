/**
 * dependency_injection.TestReporterParameterResolverTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the TestInfo parameter
 * <p>
 * @note Dependency injection allows us to access additional data about the test using the
 * TestReporterParameterResolver interface. This interface provides an instance of TestReporter,
 * which facilitates different methods to publish report entries for the test under execution.
 *
 * <p>
 * @note Use case#
 * We use the TestReporter interface to print stdout (standard output) or stderr (standard error output) in JUnit4.
 * The publishEntry() method is used to report or print any debug messages inside our tests. The TestReporter
 * interface contains one publishEntry abstract method and a couple of default publishEntry methods.
 * Similarly to the TestInfo interface, we can inject the TestReporter interface into constructors, test methods,
 * and life cycle callbacks.
 * @since 7/8/2022
 */

package dependency_injection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings({"unused"})
public class TestReporterParameterResolverTest {

    @Test
    void testReportSingleValue(TestReporter testReporter) {
        testReporter.publishEntry("Some text");
    }

    @Test
    void reportKeyValuePair(TestReporter testReporter) {
        testReporter.publishEntry("Key", "Value");
    }

    @Test
    void reportKeyValuePairMap(TestReporter testReporter) {
        Map<String, String> values = new HashMap<>();
        values.put("user", "John");
        values.put("email", "johndoe@gmail.com");

        testReporter.publishEntry(values);
    }
}
