import org.junit.jupiter.api.*;

/**
 * DependencyInjectionTestInfoParameterTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the TestInfo parameter
 * @since 7/8/2022
 */

@DisplayName("Testing Dependency Injection")
public class DependencyInjectionTestInfoParameterTest {

    /**
     * BeforeAll
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
