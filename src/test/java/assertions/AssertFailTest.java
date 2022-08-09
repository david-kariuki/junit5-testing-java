/**
 * assertions.AssertFailTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the classes.StringUtils.java class
 *
 * <p>
 * @note Assertions API provide static fail() method. As soon as, any @Test method encounters fail() static method,
 * it will fail the test case. The primary usages of fail() method are as follows -
 * - It gives a piece of meaningful information to the programmer writing a test, that test case is in progress and
 * still needs to be implemented.
 * - It can be used to verify that an actual exception is thrown. Usually based on some input when test case expects
 * an exception at a certain line, providing fail() below that line will verify that exception was not thrown as
 * code execution reached fail() method line. Thus, it explicitly fails the test case.
 * @since 12/7/2022
 */

package assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class AssertFailTest {

    /**
     * Usage 1 - @Test not implemented with fail()
     */
    @Test
    public void testMethodYetNotImplemented() {
        fail();
    }

    /**
     * Usage 2 - @Test not implemented with fail(String message)
     */
    @Test
    public void testMethodYetNotImplemented1() {
        fail("@Test method not yet implemented !!!");
    }

    /**
     * Usage 3 - @Test not implemented with fail(Supplier<String> messageSupplier)
     */
    @Test
    public void testMethodYetNotImplemented2() {
        //noinspection ExcessiveLambdaUsage
        fail(() -> "@Test method not yet implemented !!!");
    }

    /**
     * Usage 4 - @Test not implemented with fail(Throwable throwable)
     */
    @Test
    public void testMethodYetNotImplemented3() {
        fail(new RuntimeException("@Test method not yet implemented !!!"));
    }

    /**
     * Usage 5 - @Test not implemented with fail(String message, Throwable throwable)
     */
    @Test
    public void testMethodYetNotImplemented4() {
        fail("@Test method not yet implemented !!!", new RuntimeException("Failed explicitly"));
    }

    /**
     * Usage 6 - It can be used to verify that an actual exception is thrown
     */
    @Test
    public void testActualExceptionThrown() {
        try {
            throwUnsupportedOperationException();
            fail("Exception not thrown !!!");
        } catch (UnsupportedOperationException e) {
            // Test case passed
        }
    }

    /**
     * Method to throw UnsupportedOperationException Exception
     */
    private void throwUnsupportedOperationException() {
        throw new UnsupportedOperationException(); // Uncommenting this line will fail the test case
    }
}
