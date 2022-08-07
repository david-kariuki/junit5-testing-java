import org.junit.jupiter.api.*;

/**
 * AnnotationDisabledOnMethodNameTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the assertions @beforeAll and @AfterAll.
 * Test 1 and Test 3 will be disabled using the @Disabled annotation
 *
 * <p>
 * @Disabled annotation on @Test method
 * Applying @Disabled annotation on the test method will make the test method disabled. It will be skipped
 * from execution.
 * @since 7/8/2022
 */

@DisplayName("Annotations @BeforeAll and @AfterAll")
public class AnnotationDisabledOnMethodNameTest {

    @DisplayName("@BeforeAll Test Method")
    @BeforeAll
    public static void beforeAll() {
        System.out.println("LifecycleTest - beforeAll() got executed !!!");
    }

    public AnnotationDisabledOnMethodNameTest() {
        System.out.println("LifecycleTest - Constructor got executed !!!");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("LifecycleTest - beforeEach() got executed !!!");
    }


    @Disabled("Disabling Test 1")
    @Test
    public void testOne() {
        System.out.println("LifecycleTest - testOne() got executed !!!");
    }

    @Test
    public void testTwo() {
        System.out.println("LifecycleTest - testTwo() got executed !!!");
    }

    @Disabled("Disabling Test 3")
    @Test
    public void testThree() {
        System.out.println("LifecycleTest - testThree() got executed !!!");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("LifecycleTest - afterEach() got executed !!!");
    }

    @DisplayName("@AfterAll Test Method")
    @AfterAll
    public static void afterAll() {
        System.out.println("LifecycleTest - afterAll() got executed !!!");
    }
}
