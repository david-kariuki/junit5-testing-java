/**
 * AnnotationBeforeEachAndAfterEachTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the assertions @BeforeEach and @AfterEach
 *
 * <p>
 * @note @BeforeEach and @AfterEach
 * @BeforeEach and
 * @AfterEach .
 * Methods annotated with @BeforeEach and @AfterEach as the name suggests are called before each and after
 * each @Test methods. So, if in a test class there are two @Test methods, the @BeforeEach method will be called twice, just before each @Test method and similarly, the @AfterEach method will be called twice, just after each @Test method.
 * @since 7/8/2022
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AnnotationBeforeEachAndAfterEachTest {

    public AnnotationBeforeEachAndAfterEachTest() {
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
}
