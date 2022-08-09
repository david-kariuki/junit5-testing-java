/**
 * dependency_injection.TestInfoParameterResolverTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the TestInfo parameter
 *
 * <p>
 * @note In previous JUnit versions, the constructors and methods in the tests did not have parameters.
 * With Jupiter, it’s possible to define the constructor and method parameters. This enables dependency injection
 * for our tests. Jupiter provides the interface, ParameterResolver, which helps an API resolve the constructor
 * and method parameters at runtime. The ParameterResolver interface has three main
 * implementations — TestInfoParameterResolver, TestReporterParameterResolver, and RepetitionInfoParameterResolver.
 *
 * <p>
 * @note The TestInfoParameterResolver class
 * The TestInfoParameterResolver class provides an instance of TestInfo. The TestInfo interface is used to inject
 * information about the current test, which includes the following: Display Name, Class, Method, Tags
 * This interface can be used in different types of tests with annotations @Test, @ParameterizedTest, @RepeatedTest,
 * and @TestFactory. It is also used for life cycle callback methods with annotations — @BeforeEach, @AfterEach
 * , @BeforeAll, and @AfterAll. In the JUnit 4 API, TestInfo is a drop-in replacement for the TestName rule
 * from JUnit 4.
 * @since 8/8/2022
 */

package dependency_injection;

import org.junit.jupiter.api.*;

import java.lang.reflect.Parameter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SuppressWarnings({"UnusedAssignment", "unused"})
public class TestInfoParameterResolverTest {

    /**
     * Class constructor
     *
     * @param testInfo - TestInfo
     */
    TestInfoParameterResolverTest(TestInfo testInfo) {
        assertEquals("dependency_injection.TestInfoParameterResolverTest", testInfo.getDisplayName());
    }

    @BeforeEach
    void init(TestInfo testInfo) {
        String displayName = testInfo.getDisplayName();
        assertTrue(displayName.equals("Test Name of the Method")
                || displayName.equals("testMethodName(TestInfo)")
                || displayName.equals("Test Method Name through getTestMethod()")
                || displayName.equals("Test Class Name")
                || displayName.equals("Test Tags present in the test"));
    }

    @Test
    @DisplayName("Test Name of the Method")
    void testDisplayNameOfTheTest(TestInfo testInfo) {
        assertEquals("Test Name of the Method", testInfo.getDisplayName());
    }

    @Test
    void testMethodName(TestInfo testInfo) {
        assertEquals("testMethodName(TestInfo)", testInfo.getDisplayName());
    }

    @Test
    @DisplayName("Test Tags present in the test")
    @Tag("test")
    void testTagsForTest(TestInfo testInfo) {
        assertEquals("Test Tags present in the test", testInfo.getDisplayName());
        assertTrue(testInfo.getTags().contains("test"));
    }

    @Test
    @DisplayName("Test Method Name through getTestMethod()")
    void testMethodNameThroughReflection(TestInfo testInfo) {

        String methodName = null;
        Class<?> methodReturnType, methodDeclaringClass;
        Parameter[] methodParameters;

        if (testInfo.getTestMethod().isPresent()) {
            methodName = testInfo.getTestMethod().get().getName();
            methodReturnType = testInfo.getTestMethod().get().getReturnType();
            methodDeclaringClass = testInfo.getTestMethod().get().getDeclaringClass();
            methodParameters = testInfo.getTestMethod().get().getParameters();
        }

        System.out.println(methodName);
        assertEquals("testMethodNameThroughReflection", methodName);
    }

    @Test
    @DisplayName("Test Class Name")
    void testClassName(TestInfo testInfo) {
        if (testInfo.getTestClass().isPresent()) {

            String name = testInfo.getTestClass().get().getName();
            System.out.println(name);
            assertEquals("io.educative.junit5.TestInfoExample", name);
        }
    }
}
