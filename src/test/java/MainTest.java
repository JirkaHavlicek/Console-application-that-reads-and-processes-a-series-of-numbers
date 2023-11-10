import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void testApplicationWithStdInputAndStdOutput() {
        String input = "1\n2\n3\n4\n";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(outputStream));

        String[] args = {"4"};

        Main.main(args);

        String expectedOutput = "Zadejte čísla (ukončete stiskem Enter na prázdném řádku):\n2\n4\n";
        assertEquals(expectedOutput, outputStream.toString().replaceAll("\\r\\n", "\n"));
    }

    @Test
    void testApplicationWithFileInputAndStdOutput() throws IOException {
        String inputFileContent = "1\n2\n3\n4\n";
        Path inputFilePath = Files.createTempFile("testInput", ".txt");
        Files.write(inputFilePath, inputFileContent.getBytes());

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        String[] args = {inputFilePath.toString()};

        Main.main(args);

        String expectedOutput = "2\n4\n";
        assertEquals(expectedOutput, outputStream.toString().replaceAll("\\r\\n", "\n"));
        Files.deleteIfExists(inputFilePath);
    }

    @Test
    void testApplicationWithFileInputAndFileOutput() throws IOException {
        String inputFileContent = "1\n2\n3\n4\n";
        Path inputFilePath = Files.createTempFile("testInput", ".txt");
        Files.write(inputFilePath, inputFileContent.getBytes());

        Path outputFilePath = Files.createTempFile("testOutput", ".txt");

        String[] args = {inputFilePath.toString(), outputFilePath.toString()};

        Main.main(args);

        List<String> actualOutput = Files.readAllLines(outputFilePath);
        List<String> expectedOutput = Arrays.asList("2", "4");

        assertEquals(expectedOutput, actualOutput);

        Files.deleteIfExists(inputFilePath);
    }
}

