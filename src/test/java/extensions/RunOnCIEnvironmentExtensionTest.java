/**
 * RunOnCIEnvironmentExtensionTest
 *
 * @ExtendWith(RunOnCIEnvironmentExtension.class)
 * @author David Kariuki
 * @see extensions.RunOnCIEnvironmentExtension
 * @since 9/8/2022
 */

package extensions;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Objects;

@ExtendWith(RunOnCIEnvironmentExtension.class)
public class RunOnCIEnvironmentExtensionTest {

    /**
     * Class constructor
     *
     * @param testInfo     - TestInfo interface
     * @param testReporter - TestReporterInterface
     */
    public RunOnCIEnvironmentExtensionTest(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry(testInfo.getDisplayName());
    }


    @RepeatedTest(2)
    @DisplayName("Run On CI Environment Extension Test")
    void firstTest(TestInfo testInfo, TestReporter testReporter, RepetitionInfo repetitionInfo) {

        String currentRepetitionInfo = repetitionInfo.getCurrentRepetition()
                + "/" + repetitionInfo.getTotalRepetitions();

        testReporter.publishEntry("repetition", currentRepetitionInfo);
        testReporter.publishEntry("testName", testInfo.getDisplayName());
        testReporter.publishEntry("testMethod",
                Objects.requireNonNull(testInfo.getTestMethod().orElse(null)).getName());
        testReporter.publishEntry("testClass",
                Objects.requireNonNull(testInfo.getTestClass().orElse(null)).getSimpleName());

        // TODO : Remove this - Not advisable in enterprise
        System.out.println("Hola David Kariuki, es tu Espanol bien?");
    }
}
