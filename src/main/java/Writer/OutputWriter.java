package Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class OutputWriter {
    public void writeOutput(List<Integer> resultNumbers, String outputPath) throws IOException {
        if (outputPath != null) {

            PrintWriter writer = new PrintWriter(new FileWriter(outputPath));
            for (int number : resultNumbers) {
                writer.println(number);
            }
            writer.close();
            System.out.println("Výsledek byl zapsán do souboru " + outputPath);
        } else {

            for (int number : resultNumbers) {
                System.out.println(number);
            }
        }
    }
}
