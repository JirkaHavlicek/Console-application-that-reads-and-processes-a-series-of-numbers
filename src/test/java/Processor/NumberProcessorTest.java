package Processor;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberProcessorTest {
    @Test
    void testProcessEvenNumbers() {
        NumberProcessor numberProcessor = new NumberProcessor();
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8);
        List<Integer> result = numberProcessor.processNumbers(numbers);
        assertEquals(Arrays.asList(2, 4, 6, 8), result);
    }

    @Test
    void testProcessOddNumbers() {
        NumberProcessor numberProcessor = new NumberProcessor();
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7);
        List<Integer> result = numberProcessor.processNumbers(numbers);
        assertEquals(Arrays.asList(1, 3, 5, 7), result);
    }
}