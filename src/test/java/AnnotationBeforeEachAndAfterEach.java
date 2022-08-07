import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * AnnotationBeforeEachAndAfterEach class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the assertions @BeforeEach and @AfterEach
 * @since 7/8/2022
 */

@SuppressWarnings("NewClassNamingConvention")
public class AnnotationBeforeEachAndAfterEach {

    public AnnotationBeforeEachAndAfterEach() {
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
