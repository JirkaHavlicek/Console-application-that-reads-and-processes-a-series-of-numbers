package Reader;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberReaderTest {
    @Test
    void testReadNumbersFromStdInput() throws IOException {
        NumberReader numberReader = new NumberReader();
        List<Integer> numbers = numberReader.readNumbers("5");
        assertEquals(Arrays.asList(1, 2, 3, 4), numbers);
    }

    @Test
    void testReadNumbersFromFile() throws IOException {
        NumberReader numberReader = new NumberReader();
        List<Integer> numbers = numberReader.readNumbers("testInput.txt");
        assertEquals(Arrays.asList(10, 20, 30, 40), numbers);
    }
}