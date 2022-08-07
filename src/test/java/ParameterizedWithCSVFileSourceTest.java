/**
 * ParameterizedWithCSVFileSourceTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains parameterized test methods for the classes.OddEven.java class
 * @note CsvSource
 *
 * <p>
 * @CsvFileSource allows you to use CSV files from the classpath.
 * This csv file gets picked up from the classpath at the time of running test case and each line from a CSV
 * file results in one invocation of the parameterized test. We can also provide a number of lines to skip from
 * top to take comma-separated values.
 * @since 12/7/2022
 * <p>
 */

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParameterizedWithCSVFileSourceTest {

    /**
     * ParameterizedTest method to test for null in contents of @CsvFileSource
     *
     * @param country - String
     * @param capital - String
     * @note This will iterate 5 times
     */
    @ParameterizedTest
    @CsvFileSource(resources = "/capitals.csv", numLinesToSkip = 1)
    void testWithCsvFileSource(String country, String capital) {
        assertNotNull(country);
        assertNotNull(capital);
    }
}
