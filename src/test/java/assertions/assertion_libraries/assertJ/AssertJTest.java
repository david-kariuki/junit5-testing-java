/**
 * AssertJ test class
 *
 * <p>
 *
 * @note AssertJ
 * AssertJ is composed of several modules:
 * - Core Module - This module provides assertions for JDK types (String, Iterable, Stream, Path, File, Map, etc.)
 * - Guava: Provides assertions for types coming from the “Guava” library (Multimap, Optional, etc.).
 * - Joda Time: This module provides assertions for Joda Time Types (DateTime, LocalDateTime).
 * - Neo4J: Provides assertions for Neo4J types (Path, Node, Relationship).
 * - DB: Provides assertions for relational database types (Table, Row, Column).
 * - Swing: Provides an API for functional testing of Swing user interfaces.
 * @author David Kariuki
 * @since 10/8/2022
 */

package assertions.assertion_libraries.assertJ;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertJTest {

    @Test
    @DisplayName("Test Drive AssertJ Assertions")
    void assertJTest() {
        int a = 10;

        // Assertions using AssertJ
        Assertions.assertThat(a).isEqualTo(10);

        // Fluent Assertions by AssertJ
        String name = "John";

        Assertions.assertThat(name)
                .isEqualTo("John")
                .hasSize(4)
                .startsWith("J")
                .endsWith("n");
    }
}
