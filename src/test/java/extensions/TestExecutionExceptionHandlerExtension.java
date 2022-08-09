/**
 * TestExecutionExceptionHandlerExtension class
 *
 * <p>
 *
 * @note The TestExecutionExceptionHandler extension allows us to handle exceptions that are thrown from our tests.
 * To access this functionality, we have to create a class that extends the TestExecutionExceptionHandler interface.
 * This allows us to write an extension to access the exception handling extension point.
 * @author David Kariuki
 * @since 10/8/2022
 */

package extensions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;


public class TestExecutionExceptionHandlerExtension implements TestExecutionExceptionHandler {

    private final Logger logger = LogManager.getLogger(TestExecutionExceptionHandlerExtension.class);

    @Override
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        if (throwable instanceof ArithmeticException) {
            logger.error("ArithmeticException is handled by ExceptionHandlerException", throwable);
            return;
        }
        throw throwable;
    }
}
