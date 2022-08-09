/**
 * JSONAssertTest class
 *
 * <p>
 *
 * @note JSONAssert is a library that verifies JSON objects.
 * It’s mainly used to assert JSON payloads returned as a response from the REST APIs.
 * We can use it to not only verify JSON objects, but also JSON arrays.
 * The assertEquals() method takes the expected and actual JSON values as method arguments, along with
 * a third parameter the strictness of the JSON comparison.
 *
 * <p>
 * @note Comparing JSON using LENIENT mode#
 * In the above code, we use the LENIENT mode. This mode verifies whether the actual JSON contains all the
 * fields as the expected JSON. Even though the expected JSON contains some additional fields, the test will
 * execute successfully.
 * @author David Kariuki
 * @since 10/8/2022
 */

package assertions.assertion_libraries.json_assert;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

public class JSONAssertTest {

    @Test
    public void testJSON() throws JSONException {
        String expectedJson = """
                {
                    course:"Java Unit Testing with JUnit5",
                    platform: "Educative"
                }
                """;

        String testJson = """
                {
                    course:"Java Unit Testing with JUnit5",
                    platform: "Educative",
                    author:""
                }
                """;

        JSONAssert.assertEquals(expectedJson, testJson, JSONCompareMode.LENIENT);
    }
}
