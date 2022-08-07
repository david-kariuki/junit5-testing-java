/**
 * ParameterizedWithValueSourceTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains parameterized test methods for the classes.OddEven.java class
 * @since 12/7/2022
 */

import enums.Animal;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParameterizedWithEnumSourceTest {

    /**
     * ParameterizedTest method to test for null in contents of the Animal enum class
     *
     * @note This will iterate 5 times
     */
    @ParameterizedTest
    @EnumSource(Animal.class)
    void testEnumSource(Animal animal) {
        assertNotNull(animal); // This passes for all animal cases
    }
}
