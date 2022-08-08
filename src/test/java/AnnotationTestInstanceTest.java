/**
 * AnnotationTestInstanceTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the assertions @beforeAll and @AfterAll
 *
 * <p>
 * @note @TestInstance - PER CLASS
 * @TestInstance(Lifecycle.PER_CLASS) - This creates a test instance for each class once.
 * @TestInstance(Lifecycle.PER_METHOD) . This creates a test class instance for each method.
 * If the @TestInstance annotation is not explicitly added on a test class, the default option will
 * be @TestInstance(Lifecycle.PER_METHOD).
 * When we use the @TestInstance(Lifecycle.PER_CLASS) annotation, we break this characteristic by sharing the
 * state of the counter class between tests and introducing coupling between the tests.
 * It’s useful to have the shared state in case of integration tests, or when the instantiation of a class is
 * expensive. When such cases occur, we need to assess carefully whether to add @TestInstance(Lifecycle.PER_CLASS)
 * class or not.
 * @since 8/8/2022
 */

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Annotations @BeforeAll and @AfterAll")
public class AnnotationTestInstanceTest {

    @DisplayName("@BeforeAll Test Method")
    @BeforeAll
    public static void beforeAll() {
        System.out.println("LifecycleTest - beforeAll() got executed !!!");
    }

    public AnnotationTestInstanceTest() {
        System.out.println("LifecycleTest - Constructor got executed !!!");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("LifecycleTest - beforeEach() got executed !!!");
    }

    @Test
    public void testOne() {
        System.out.println("LifecycleTest - testOne() got executed !!!");
    }

    @Test
    public void testTwo() {
        System.out.println("LifecycleTest - testTwo() got executed !!!");
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
