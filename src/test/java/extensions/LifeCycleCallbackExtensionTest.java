/**
 * LifeCycleCallbackExtensionTest class
 *
 * @apiNote This is a test class for the LifeCycleCallbackExtension class
 * @author David Kariuki
 * @see extensions.LifeCycleCallbackExtension
 * @since 9/8/2022
 */

package extensions;

import classes.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LifeCycleCallbackExtensionTest {

    private static Calculator calculator;

    @BeforeAll
    public static void initialize() {
        calculator = new Calculator();
    }

    @Test
    void firstTest() {
        Assertions.assertEquals(3, calculator.add(1, 2));
    }
}
