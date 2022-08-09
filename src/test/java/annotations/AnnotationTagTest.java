/**
 * annotations.AnnotationEnabledDisabledIfTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the @EnabledIf
 *
 * <p>
 * JUnit 5 provides the option to filter and categorize tests. We use the @Tag annotation for this.
 * It is added on top of the class. We can provide a custom value to this annotation. The following are some syntax
 * rules for tags:
 * - A tag must not be null or blank.
 * - A trimmed tag must not contain whitespace.
 * - A trimmed tag must not contain ISO control characters.
 * - A trimmed tag must not contain any of the following reserved characters ( , ( ) & | !
 * We add the @Tag("test") annotation on top of the shouldRunTaggedTest() method. Then, we categorize
 * them under the test tag. We can only run the tests that are tagged with the test annotation either by adding
 * some configuration using Maven or an IDE.
 *
 * @note Configure tags inside IntelliJ#
 * We use the following process to configure and activate the tags in the IntelliJ IDEA:
 * Run -> Edit Configurations -> Tags Then, we provide the value of the test tag. Click “OK” and “Apply.”
 * We’ll have two tests inside the TaggedTests.java class. However, IntelliJ only executes the Should Run
 * the Tagged "Test test".
 */

package annotations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AnnotationTagTest {

    @DisplayName("Should Run the Tagged Test")
    @Tag("test")
    @Test
    void shouldRunTaggedTest() {
        // Some Test Code
    }

    @DisplayName("Sample Test")
    @Test
    void shouldRunSampleTest() {
        // Some Test Code
    }
}
