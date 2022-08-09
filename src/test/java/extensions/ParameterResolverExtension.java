/**
 * ParameterResolverExtension class
 *
 * <p>
 *
 * @note ParameterResolverExtension
 * The ParameterResolver extension allows us to resolve a constructor or method parameter of a test.
 * We have to create a class that extends the ParameterResolver interface. This allows us to write an extension
 * to access the parameter resolution access point.
 *
 * <p>
 * TestInfoParameterResolver, TestReporterParameterResolver and RepetitionInfoParameterResolver are examples of
 * the usage of the ParameterResolver interface. We resolve the AdditionTestInput parameter in the
 * CalculatorInputParameterResolver extension. This can be injected at the method level or constructor level.
 * The class implementing the ParameterResolver interface should override the supportsParameter and resolveParameter
 * methods.
 *
 * <p>
 * Inside the supportsParameter method, we’ll verify whether the constructor or method parameter is of the type
 * AdditionTestInput. If this checks out, Jupiter will execute the resolveParameter method and create an object of
 * type AdditionTestInput. This object will be injected wherever AdditionTestInput is used as a parameter.
 * @author David Kariuki
 * @since 10/8/2022
 */

package extensions;

import classes.AdditionTestInput;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

public class ParameterResolverExtension implements ParameterResolver {
    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter().getType().equals(AdditionTestInput.class);
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return new AdditionTestInput(2, 4);
    }
}
