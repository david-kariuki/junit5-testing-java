/**
 * HelloExtensionTest
 *
 * @author David Kariuki
 * @see extensions.HelloExtension
 * @since 9/8/2022
 */

package extensions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.extension.ExtendWith;

@SuppressWarnings("unused")
@ExtendWith(HelloExtension.class)
public class HelloExtensionTest {

    private String greeting;

    @Test
    void firstTest(TestReporter testReporter) {
        testReporter.publishEntry(greeting);
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
