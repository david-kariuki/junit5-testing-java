/**
 * AnnotationBeforeAllAndAfterAllTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the assertions @beforeAll and @AfterAll
 *
 * <p>
 * @note @BeforeAll and @AfterAll
 * @BeforeAll and
 * @AfterAll .
 * Methods annotated with @BeforeAll and @AfterAll are static methods because, as the name suggest they are called
 * once before all and once after all @Test methods. So, if in a test class there are two @Test methods,
 * the @BeforeAll method will be called once before all test methods and similarly, the @AfterAll method will be
 * called once, just after all @Test method gets finished.
 * @since 7/8/2022
 */

import org.junit.jupiter.api.*;

@DisplayName("Annotations @BeforeAll and @AfterAll")
public class AnnotationBeforeAllAndAfterAllTest {

    @DisplayName("@BeforeAll Test Method")
    @BeforeAll
    public static void beforeAll() {
        System.out.println("LifecycleTest - beforeAll() got executed !!!");
    }

    public AnnotationBeforeAllAndAfterAllTest() {
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
