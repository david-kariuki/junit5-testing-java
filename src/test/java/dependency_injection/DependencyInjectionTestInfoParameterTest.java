/**
 * dependency_injection.DependencyInjectionTestInfoParameterTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the TestInfo parameter
 *
 * <p>
 * @note ParameterResolver
 * In previous JUnit versions, there was limited/no support to allow parameters in test constructors or methods.
 * One of the major changes in JUnit 5 Jupiter was that both test constructors and test methods are now allowed
 * to have parameters. These parameters provide metadata to constructors and test methods. Thus, allows for greater
 * flexibility and enables Dependency Injection for test methods and constructors.
 * In Junit 5, there is an interface in org.junit.jupiter.api.extension package by name, ParameterResolver. This
 * interface defines the API for test extensions that wish to dynamically resolve parameters at runtime.
 * There are different types of ParameterResolver’s in Junit 5. Generally, if a test constructor or a @Test
 * , @BeforeEach, @AfterEach, @BeforeAll, @AfterAll or @TestFactory method accepts a parameter, the parameter must
 * be resolved at runtime by a registered ParameterResolver.
 * @note TestInfo Parameter
 * TestInfoParameterResolver - It is a built-in ParameterResolver. If a method parameter is of type TestInfo, it
 * signifies that TestInfoParameterResolver will supply an instance of TestInfo corresponding to the current test
 * as the value for the parameter.
 * The TestInfo as the parameter can then be used to retrieve information or metadata about the current test, such
 * as the test’s display name, the test class, the test method, or associated tags. If @DisplayName annotation is
 * used on test methods then the custom name associated with test methods is retrieved or else technical name, which
 * is the actual name of the test class or test method.
 * @since 7/8/2022
 */

package dependency_injection;

import org.junit.jupiter.api.*;

@DisplayName("Testing Dependency Injection")
public class DependencyInjectionTestInfoParameterTest {

    /**
     * BeforeAll
     *
     * @param testInfo - TestInfo
     */
    @BeforeAll
    public static void beforeAll(TestInfo testInfo) {
        System.out.println("beforeAll() got executed with test info as - ");
        System.out.println("Display name - " + testInfo.getDisplayName());
        System.out.println("Test Class - " + testInfo.getTestClass());
        System.out.println("Test Method - " + testInfo.getTestMethod());
        System.out.println("*******************************************");
    }

    /**
     * Class constructor
     *
     * @param testInfo - TestInfo
     */
    public DependencyInjectionTestInfoParameterTest(TestInfo testInfo) {
        System.out.println("Constructor got executed with test info as - ");
        System.out.println("Display name - " + testInfo.getDisplayName());
        System.out.println("Test Class - " + testInfo.getTestClass());
        System.out.println("Test Method - " + testInfo.getTestMethod());
        System.out.println("*******************************************");
    }

    /**
     * BeforeEach
     *
     * @param testInfo - TestInfo
     */
    @BeforeEach
    public void beforeEach(TestInfo testInfo) {
        System.out.println("beforeEach() got executed with test info as - ");
        System.out.println("Display name - " + testInfo.getDisplayName());
        System.out.println("Test Class - " + testInfo.getTestClass());
        System.out.println("Test Method - " + testInfo.getTestMethod());
        System.out.println("*******************************************");
    }

    /**
     * Test one
     *
     * @param testInfo - TestInfo
     */
    @Test
    @DisplayName("test method by name testOne")
    public void testOne(TestInfo testInfo) {
        System.out.println("testOne() got executed with test info as - ");
        System.out.println("Display name - " + testInfo.getDisplayName());
        System.out.println("Test Class - " + testInfo.getTestClass());
        System.out.println("Test Method - " + testInfo.getTestMethod());
        System.out.println("*******************************************");
    }
}
