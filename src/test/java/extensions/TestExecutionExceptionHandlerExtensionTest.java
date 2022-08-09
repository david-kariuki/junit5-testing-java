/**
 * Test class for TestExecutionExceptionHandlerExtension class
 *
 * @author David Kariuki
 * @since 10/8/2022
 */

package extensions;

import classes.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TestExecutionExceptionHandlerExtension.class)
public class TestExecutionExceptionHandlerExtensionTest {

    private static Calculator calculator;

    @BeforeAll
    public static void initialize() {
        calculator = new Calculator();
    }

    @Test
    void firstTest() {
        Assertions.assertEquals(0, calculator.divide(10, 0));
    }
}
