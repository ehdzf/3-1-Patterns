package singleton_pattern.memory;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MemoryStackTest {
    MemoryStack instanceOne;
    MemoryStack instanceTwo;

    @BeforeEach
    void setUp() {
        instanceOne = MemoryStack.getInstance();
        instanceTwo = MemoryStack.getInstance();
    }

    @Test
    @DisplayName("Both instances should be the same")
    void testSingleton() {
        // Check if both instances are the same
        assertThat(instanceOne).isSameAs(instanceTwo);
    }


}