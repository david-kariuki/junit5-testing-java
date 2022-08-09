/**
 * Test class for ParameterResolverExtension class
 *
 * @author David Kariuki
 * @see extensions.ParameterResolverExtension
 * @since 12/8/2022
 */
package extensions;

import classes.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ParameterResolverExtension.class)
public class ParameterResolverExtensionTest {

    private static Calculator calculator;

    @BeforeAll
    public static void initialize() {
        calculator = new Calculator();
    }

    @Test
    void firstTest(AdditionTestInput additionTestInput) {
        Assertions.assertEquals(3,
                calculator.add(additionTestInput.getInput1(), additionTestInput.getInput2()));
    }
}
