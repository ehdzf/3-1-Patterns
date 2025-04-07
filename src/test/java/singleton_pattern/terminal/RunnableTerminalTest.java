package singleton_pattern.terminal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RunnableTerminalTest {
    RunnableTerminal terminal1;
    RunnableTerminal terminal2;
    RunnableTerminal terminal3;
    Thread thread1;
    Thread thread2;
    Thread thread3;
    String[] commands1 = {"ls", "cd", "mkdir"};
    String[] commands2 = {"rm", "cp", "mv"};
    String[] commands3 = {"ls", "cd"};

    private void runThreads() {
        thread1 = new Thread(terminal1);
        thread2 = new Thread(terminal2);
        thread3 = new Thread(terminal3);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeEach
    void setUp() {
        terminal1 = new RunnableTerminal(commands1);
        terminal2 = new RunnableTerminal(commands2);
        terminal3 = new RunnableTerminal(commands3);
    }

    @AfterEach
    void clearMemoryStack() {
        terminal1.getMemoryStack().clear();

    }

    @Test
    @DisplayName("All threads should have the same memory stack")
    void testRunnableTerminal() {
        runThreads();
        assertThat(terminal1.getMemoryStack()).isSameAs(terminal2.getMemoryStack());
        assertThat(terminal1.getMemoryStack()).isSameAs(terminal3.getMemoryStack());
    }

    @Test
    @DisplayName("All commands from all threads should be in the memory stack")
    void shouldContainAllCommandsAfterRunning() {
        runThreads();
        final List<String> expected = createAllCommandsList();
        assertThat(terminal1.getMemoryStack().getAllCommands()).containsExactlyInAnyOrderElementsOf(expected);


    }

    private List<String> createAllCommandsList() {
        List<String> expected = new ArrayList<>();
        expected.addAll(Arrays.asList(commands1));
        expected.addAll(Arrays.asList(commands2));
        expected.addAll(Arrays.asList(commands3));
        return expected;
    }


}