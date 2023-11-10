import Processor.NumberProcessor;
import Reader.NumberReader;
import Writer.OutputWriter;


import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1 || args.length > 2) {
            System.out.println("Použití: java Main <vstup> [výstup]");
            return;
        }

        String inputPath = args[0];
        String outputPath = null;

        if (args.length > 1) {
            outputPath = args[1];
        }

        try {
            NumberReader numberReader = new NumberReader();
            List<Integer> numbers = numberReader.readNumbers(inputPath);

            NumberProcessor numberProcessor = new NumberProcessor();
            List<Integer> resultNumbers = numberProcessor.processNumbers(numbers);

            OutputWriter outputWriter = new OutputWriter();
            outputWriter.writeOutput(resultNumbers, outputPath);
        } catch (IOException e) {
            System.err.println("Chyba: " + e.getMessage());
        }
    }
}