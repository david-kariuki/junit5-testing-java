/**
 * LifeCycleCallbackExtension class
 *
 * @apiNote This class contains extension inner classes for the life cycle call back extension
 *
 * <p>
 * @note Life cycle callback extensions allow us to run the code during the life cycle phase of a test.
 * The following are the different phases that comprise the life cycle of a JUnit Test.
 * BeforeAll, BeforeEach, Test Method, AfterEach, AfterAll,
 * Jupiter provides an extension interface for each of the above-mentioned test life cycle stages:
 * - BeforeAllCallback is executed before the @BeforeAll method.
 * - BeforeEachCallback is executed before the @BeforeEach method.
 * - BeforeTestExecutionCallback is executed before the test method execution.
 * - AfterTestExecutionCallback is executed after the test method execution.
 * - AfterEachCallback is executed after the @AfterEach method.
 * - AfterAllCallback is executed after the @AfterAll method.
 *
 * <p>
 * @note Order Of Execution
 * Below is the order of execution followed by Jupiter, including all the extension and life cycle methods.
 * BeforeAllCallback -> BeforeAll -> BeforeEachCallback -> BeforeEach
 * BeforeTestExecutionCallback -> Test -> AfterTestExecutionCallback -> AfterEach -> AfterEachCallback
 * AfterAll -> AfterAllCallback
 * @author David Kariuki
 * @since 9/8/2022
 */

package extensions;

import org.junit.jupiter.api.extension.*;

/**
 * The callback methods below override the corresponding callback method e.g., @BeforeAllCallback overrides @BeforeAll
 *
 * <p>
 *
 * @note USA Case
 * We use the callbacks below when dealing with integration tests to test the code against in-memory databases.
 * Once the execution is completed, we may want to free up the resources and clean up unnecessary objects used inside
 * the tests. This is why framework and library developers use these extensions to perform various tasks at different
 * stages of the test life cycle.
 */
@SuppressWarnings("RedundantThrows")
public class LifeCycleCallbackExtension implements BeforeAllCallback, BeforeEachCallback, BeforeTestExecutionCallback, AfterTestExecutionCallback, AfterEachCallback, AfterAllCallback {

    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        extensionContext.publishReportEntry("After All Callback Invoked");
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        extensionContext.publishReportEntry("After Each Callback Invoked");
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        extensionContext.publishReportEntry("After Test Callback Invoked");
    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        extensionContext.publishReportEntry("Before All Callback Invoked");
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        extensionContext.publishReportEntry("Before Each Callback Invoked");
    }

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        extensionContext.publishReportEntry("Before Test Callback Invoked");
    }
}
