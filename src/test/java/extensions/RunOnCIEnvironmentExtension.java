/**
 * RunOnCIEnvironmentExtension class
 *
 * <p>
 *
 * @note ExecutionCondition
 * The ExecutionCondition extension allows us to implement conditional execution of the test based on certain test
 * characteristics. There are different conditional execution annotations available in Jupiter. However, we have much
 * more freedom to implement different conditions to run the tests using the extensions. We have to create a class
 * that extends the ExecutionCondition interface. This allows us to write an extension that accesses the conditional
 * execution extension point.
 *
 * <p>
 * The class implementing the ExecutionCondition interface should override the evaluateExecutionCondition method.
 * Inside this method, we read the system environment variable JENKINS_HOME. If this environment is available on the
 * system path, we disable the test. This is achieved when the ConditionalEvaluationResult.disabled() or
 * ConditionalEvaluationResult.enabled() method returns the ConditionalEvaluationResult object.
 * @author David Kariuki
 * @since 9/8/2022
 */

package extensions;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class RunOnCIEnvironmentExtension implements ExecutionCondition {
    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
        String jenkinsHome = System.getenv("JENKINS_HOME");

        if (jenkinsHome != null) {
            return ConditionEvaluationResult.enabled("Test enabled on CI");
        }

        return ConditionEvaluationResult.disabled("Test disabled, will run on CI environment");
    }
}
