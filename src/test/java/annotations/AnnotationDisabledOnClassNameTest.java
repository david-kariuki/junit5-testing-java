/**
 * annotations.AnnotationDisabledOnClassNameTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the assertions @beforeAll and @AfterAll which will be
 * disabled using the @Disabled annotation
 *
 * <p>
 * @Disabled annotation on Test class
 * Applying @Disabled annotation on test class will make test class and all test methods within that class disabled.
 * @since 7/8/2022
 */

package annotations;

import org.junit.jupiter.api.*;

@Disabled("Disabling all class tests")
@DisplayName("Annotations @BeforeAll and @AfterAll")
public class AnnotationDisabledOnClassNameTest {

    @DisplayName("@BeforeAll Test Method")
    @BeforeAll
    public static void beforeAll() {
        System.out.println("LifecycleTest - beforeAll() got executed !!!");
    }

    public AnnotationDisabledOnClassNameTest() {
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
