/**
 * annotations.AnnotationTestFactoryTest class
 *
 * @author David Kariuki
 *
 * <p>
 * @note @TestFactory
 * JUnit 5 provides the @Test annotation in the Jupiter module to write standard unit tests.
 * These test cases assume the behavior of the test. It’s not possible to change the behavior of the tests if
 * anything happens at runtime. Assumptions provide a basic form of dynamic behavior but are rather limited in
 * their expressiveness.
 *
 * <p>
 * @TestFactory Jupiter introduced a new dynamic model that generates tests at runtime.
 * These tests are called dynamic tests. They are generated at runtime by a factory method annotated with
 * the @TestFactory annotation. A dynamic test is composed of a display name and an executable. An executable is
 * a @FunctionalInterface introduced in Java 8. This means that the implementations are provided either as a lambda
 * expression or as a method reference.
 *
 * <p>
 * @note Rules for writing @TestFactory methods
 * A method that is annotated with the @TestFactory annotation must return one of the following:
 * - A single DynamicNode object
 * - A stream of DynamicNode objects
 * - A collection of DynamicNode objects
 * - An iterable of DynamicNode objects
 * - An iterator of DynamicNode objects
 * - An array of DynamicNode objects
 * Similar to tests annotated with @Test annotation, factory methods annotated with @TestFactory must not be
 * private or static. They are allowed to have the access modifier as package-private.
 *
 * <p>
 * @note Dynamic test life cycle#
 * The execution life cycle of a dynamic test is different from a standard test annotated with @Test.
 * There are no life cycle callbacks for individual dynamic tests. This means the @BeforeEach and @AfterEach methods
 * are executed for each @TestFactory method but not for individual dynamic tests.
 * The behavior of the @BeforeAll and @AfterAll methods is similar to normal tests annotated with @Test.
 * They are executed before and after all the tests.
 *
 * @see Iterator
 * @see Iterable
 * @see Collection
 * @see Stream
 * @see DynamicTest
 * @see Calculator#add(int, int)
 * @see Calculator#divide(int, int)
 * @see OddEven#isEven(int)
 * @since 8/8/2022
 */

package annotations;

import classes.Calculator;
import classes.OddEven;
import enums.MathOperations;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;

public class AnnotationTestFactoryTest {

    private static Calculator calculator;
    private static OddEven oddEven;

    @BeforeAll
    @DisplayName("BeforeAll")
    public static void initializeClassObjects() {
        calculator = new Calculator();
        oddEven = new OddEven();
    }

    /**
     * Using Iterator
     *
     * @return Iterator
     */
    @TestFactory
    Iterator<DynamicTest> calculatorTest_Return_Iterator() {
        return Arrays.asList(
                DynamicTest.dynamicTest(MathOperations.ADDITION.toString(),
                        () -> Assertions.assertEquals(3, calculator.add(1, 2))),
                DynamicTest.dynamicTest("isEven",
                        () -> Assertions.assertTrue(oddEven.isEven(2))),
                DynamicTest.dynamicTest("division",
                        () -> Assertions.assertEquals(6, calculator.divide(12, 2)))
        ).iterator();
    }

    /**
     * Using Iterable
     *
     * @return Iterable
     */
    @TestFactory
    Iterable<DynamicTest> calculatorTests_Return_Iterable() {
        return Arrays.asList(
                DynamicTest.dynamicTest(MathOperations.ADDITION.toString(),
                        () -> Assertions.assertEquals(3, calculator.add(1, 2))),
                DynamicTest.dynamicTest("isEven",
                        () -> Assertions.assertTrue(oddEven.isEven(2))),
                DynamicTest.dynamicTest(MathOperations.DIVISION.toString(),
                        () -> Assertions.assertEquals(1, calculator.divide(2, 2)))
        );
    }

    /**
     * Using Collection
     *
     * @return Collection
     */
    @TestFactory
    Collection<DynamicTest> calculatorTests_Return_Collection() {
        return Arrays.asList(
                DynamicTest.dynamicTest(MathOperations.ADDITION.toString(),
                        () -> Assertions.assertEquals(3, calculator.add(1, 2))),
                DynamicTest.dynamicTest("isEven",
                        () -> Assertions.assertTrue(oddEven.isEven(2))),
                DynamicTest.dynamicTest(MathOperations.DIVISION.toString(),
                        () -> Assertions.assertEquals(1, calculator.divide(2, 2)))
        );
    }

    /**
     * Using Stream
     *
     * @return Stream
     */
    @TestFactory
    Stream<DynamicTest> calculatorTests_Return_Stream() {
        return Stream.of(
                DynamicTest.dynamicTest(MathOperations.ADDITION.toString(),
                        () -> Assertions.assertEquals(3, calculator.add(1, 2))),
                DynamicTest.dynamicTest("isEven",
                        () -> Assertions.assertTrue(oddEven.isEven(2))),
                DynamicTest.dynamicTest(MathOperations.DIVISION.toString(),
                        () -> Assertions.assertEquals(1, calculator.divide(2, 2)))
        );
    }

    /**
     * Using DynamicTest[] array
     *
     * @return DynamicTest
     */
    @TestFactory
    DynamicTest[] calculatorTests_Return_Array() {
        return new DynamicTest[]{
                DynamicTest.dynamicTest(MathOperations.ADDITION.toString(),
                        () -> Assertions.assertEquals(3, calculator.add(1, 2))),
                DynamicTest.dynamicTest("isEven",
                        () -> Assertions.assertTrue(oddEven.isEven(2))),
                DynamicTest.dynamicTest(MathOperations.DIVISION.toString(),
                        () -> Assertions.assertEquals(1, calculator.divide(2, 2)))
        };
    }
}
