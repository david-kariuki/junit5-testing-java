import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

/**
 * AnnotationEnabledDisabledIfTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the @EnabledIf
 *
 * <p>
 * @EnabledId and
 * @DisabledIf .
 * We can enable or disable a test execution based on custom conditions using the @EnabledIf and @DisabledIf
 * annotations. These annotations take the method name as input. Its return type is boolean.
 * @since 7/8/2022
 */

public class AnnotationEnabledDisabledIfTest {

    @Test
    @DisplayName("Run Test if Custom Condition Matches")
    @EnabledIf("customCondition")
    void runTestIfCustomConditionMatches() {
        // Some Test Code
    }

    @Test
    @DisplayName("Do Not Run Test if Custom Condition Matches")
    @DisabledIf("customCondition")
    void doNoRunTestIfCustomConditionMatches() {
        // Some Test Code
    }

    boolean customCondition() {
        return true;
    }
}
