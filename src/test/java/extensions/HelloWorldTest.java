package extensions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.extension.ExtendWith;

@SuppressWarnings("unused")
@ExtendWith(SayHiExtension.class)
public class HelloWorldTest {

    private String greeting;

    @Test
    void firstTest(TestReporter testReporter) {
        testReporter.publishEntry(greeting);
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
