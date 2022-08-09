/**
 * HamcrestTest class
 *
 * @author David Kariuki
 * @note Hamcrest provides a set of assertions that read like English sentences.
 * It’s a well-known library used to write assertions for our unit tests. It was developed for Java,
 * and later adopted by multiple other languages, such as Python, Ruby, PHP, Javascript, and Golang.
 * @since 10/8/2022
 */

package assertions.assertion_libraries.hamcrest;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class HamcrestTest {

    @Test
    public void testStringLength() {

        MatcherAssert.assertThat(
                "Educative.io".length(),
                Matchers.is(12)
        );
    }
}
