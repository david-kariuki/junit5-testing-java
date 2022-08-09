/**
 * RegisteringExtensionsInJUnit class
 *
 * <p>
 *
 * @note Declarative registration#
 * For declarative registration, we use the @ExtendWith annotation on a test method or a class.
 * We use the following syntax to register an extension.
 * @ExtendWith(MyExtension.class) There are two ways to register multiple extensions: we can pass multiple class references to the single
 * annotations, or we define multiple @ExtendedWith() annotations.
 * Passing multiple class references:
 * - @ExtendWith({MyExtension1.class, MyExtension2.class, MyExtension3.class})
 * Define multiple @ExtendedWith() annotations:
 * - @ExtendWith(MyExtension1.class)
 * - @ExtendWith(MyExtension2.class)
 * - @ExtendWith(MyExtension3.class) .
 * </p>
 * @author David Kariuki
 * @since 10/8/2022
 */

package extensions;

import org.junit.jupiter.api.extension.ExtendWith;

@SuppressWarnings("unused")
public class RegisteringExtensionsInJUnit {

    @ExtendWith(ParameterResolverExtension.class)
    private static class RegisterExtensionExample1 {
    }

    @ExtendWith({ParameterResolverExtension.class, RunOnCIEnvironmentExtension.class})
    private static class RegisterExtensionExample2 {
    }

    @ExtendWith(TestExecutionExceptionHandlerExtension.class)
    @ExtendWith(LifeCycleCallbackExtension.class)
    @ExtendWith(HelloExtension.class)
    private static class RegisterExtensionExample3 {
    }
}
