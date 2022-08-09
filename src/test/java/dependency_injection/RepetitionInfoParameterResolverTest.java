/**
 * dependency_injection.DependencyInjectionTestInfoParameterTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains test methods for the TestInfo parameter
 *
 * <p>
 * @note Dependency injection helps us access additional data about the test run using the
 * RepetitionInfoParameterResolver interface. This interface supplies an instance of RepetitionInfo. This provides
 * different methods to retrieve information about the current repetition and the total number of repetitions for
 * the @RepeatedTest.So, we only use this interface with the @RepeatedTest. The RepetitionInfo parameter also
 * facilitates the @BeforeEach and @AfterEach life cycle methods when used with the @RepeatedTest.
 * @since 8/8/2022
 */

package dependency_injection;

import classes.Calculator;
import org.junit.jupiter.api.*;

import java.lang.reflect.Method;
import java.util.Optional;

@SuppressWarnings({"unused"})
public class RepetitionInfoParameterResolverTest {

    private static Calculator calculator;

    @BeforeAll
    public static void init() {
        calculator = new Calculator();
    }

    @BeforeEach
    public void setup(TestInfo testInfo, TestReporter testReporter, RepetitionInfo repetitionInfo) {
        int currentRepetition = repetitionInfo.getCurrentRepetition();
        int totalRepetitions = repetitionInfo.getTotalRepetitions();

        Optional<Method> testMethod = testInfo.getTestMethod();

        if (testMethod.isPresent()) {
            String testMethodName = testMethod.get().getName();

            // Report
            testReporter.publishEntry(
                    String.format("Executing the test - %s, repetition %d - of - %d",
                            testMethodName, currentRepetition, totalRepetitions)
            );
        }
    }

    @RepeatedTest(2)
    @DisplayName("Sample Test")
    void sampleTest() {
        Assertions.assertEquals(3, calculator.add(1, 2));
    }
}
