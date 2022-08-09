/**
 * HelloExtension class
 *
 * <p>
 *
 * @apiNote This is a class to implement the TestInstancePostProcessor interface
 * @note A commonly used extension for the test instance post-processor extension point is MockitoExtension.
 * It injects mock objects into our unit test. If we want to use a logger to log the debug or info statements inside
 * our tests, we create a separate extension to inject the instance of the logger into our tests automatically.
 *
 * <p>
 * @note The class implementing TestInstancePostProcessor interface should override the postProcessTestInstance
 * method. Inside this method, we create an instance of the string object and inject it into the test with the
 * setLogger() method.
 * @author David Kariuki
 * @since 8/9/2022
 */

package extensions;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

public class HelloExtension implements TestInstancePostProcessor {
    @Override
    public void postProcessTestInstance(Object testInstance, ExtensionContext extensionContext) throws Exception {
        testInstance.getClass()
                .getMethod("setGreeting", String.class)
                .invoke(testInstance, "Hello");
    }
}
