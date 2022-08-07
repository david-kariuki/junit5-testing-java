import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

/**
 * AnnotationDisabledOnClassNameTest class
 *
 * @author David Kariuki
 * @apiNote - This class contains nested tests
 * @since 7/8/2022
 */

@DisplayName("Nested Tests")
public class NestedTests {

    Queue<String> queue; // A queue of String

    @Test
    @DisplayName("Is null")
    void isNotInstantiated() {
        assertNull(queue, "The queue is null");
    }

    @Nested
    @DisplayName("When New")
    class WhenNew {

        @BeforeEach
        void createNewStack() {
            queue = new LinkedList<>();
        }

        @Test
        @DisplayName("Queue is empty")
        void isEmpty() {
            assertTrue(queue.isEmpty(), "Queue is empty");
        }

        @Test
        @DisplayName("Return null when polled")
        void returnNullWhenPolled() {
            assertNull(queue.poll()); // Poll queue
        }

        @Test
        @DisplayName("Return null when peeked")
        void returnNullWhenPeeked() {
            assertNull(queue.peek()); // Peek queue
        }

        @Nested
        @DisplayName("After offering an element")
        class AfterOffering {

            String element = "Element 1";

            @BeforeEach
            void offerElement() {
                queue.offer(element); // Offer element
            }

            @Test
            @DisplayName("Queue no longer empty")
            void queueNotEmpty() {
                assertFalse(queue.isEmpty()); // Assert false case being queue is initialized
            }

            @Test
            @DisplayName("returns the element when polled and is empty")
            void returnElementWhenPolled() {
                assertEquals(element, queue.poll()); // Equate elements
                assertTrue(queue.isEmpty()); // Assert true if empty
            }

            @Test
            @DisplayName("returns the element when peeked but remains not empty")
            void returnElementWhenPeeked() {
                assertEquals(element, queue.peek());
                assertFalse(queue.isEmpty());
            }
        }
    }
}
