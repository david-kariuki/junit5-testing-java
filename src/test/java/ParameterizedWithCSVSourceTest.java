/**
 * ParameterizedWithCSVSourceTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains parameterized test methods for the classes.OddEven.java class
 *
 * <p>
 * @note CsvSource
 * @CsvSource allows you to provide parameter lists as comma-separated custom-delimiter separated values.
 * @CsvSource annotation uses single quote along with comma-separated delimiter to distinguish a csv value from others.
 * E.g., {“one, two”} will result to 2 arguments as - “one”, “two”.
 * @since 12/7/2022
 * <p>
 */

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParameterizedWithCSVSourceTest {

    /**
     * ParameterizedTest method to test for null in contents of @CsvSource
     *
     * @param first  - String
     * @param second - String
     * @note This will iterate 5 times
     */
    @ParameterizedTest
    @CsvSource({"one, 1", "two, 2", "'foo, bar', 3"})
    void testWithCsvSource(String first, int second) {
        assertNotNull(first);
        assertNotEquals(0, second);
    }
}
