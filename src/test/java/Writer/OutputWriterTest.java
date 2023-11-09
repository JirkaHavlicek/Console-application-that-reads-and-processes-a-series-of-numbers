package Writer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OutputWriterTest {


    @Test
    void testWriteToStdOutput() throws IOException {
        OutputWriter outputWriter = new OutputWriter();
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        outputWriter.writeOutput(numbers, null);

        String expectedOutput = "2\n4\n6\n8\n";
        assertEquals(expectedOutput, outputStream.toString());


        System.setOut(System.out);
    }

    @Test
    void testWriteToFile() throws IOException {
        OutputWriter outputWriter = new OutputWriter();
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7);
        String outputPath = "testOutput.txt";

        outputWriter.writeOutput(numbers, outputPath);

    }
}




