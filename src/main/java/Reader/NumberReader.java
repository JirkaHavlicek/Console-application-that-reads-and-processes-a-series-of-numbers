package Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NumberReader {
    public List<Integer> readNumbers(String inputPath) throws IOException {
        List<Integer> numbers = new ArrayList<>();

        try {
            if (inputPath.matches("\\d+")) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Zadejte čísla (ukončete stiskem Enter na prázdném řádku):");
                String line;
                while ((line = reader.readLine()) != null && !line.isEmpty()) {

                    try {
                        int number = Integer.parseInt(line);
                        numbers.add(number);
                    } catch (NumberFormatException e) {
                        System.err.println("Chyba: Zadáno neplatné číslo. Ignorováno.");
                    }
                }
            } else {
                try (BufferedReader reader = new BufferedReader(new FileReader(inputPath))) {
                    String line;
                    while ((line = reader.readLine()) != null) {

                        try {
                            int number = Integer.parseInt(line);
                            numbers.add(number);
                        } catch (NumberFormatException e) {
                            System.err.println("Chyba: Neplatné číslo ve souboru. Ignorováno.");
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Chyba při čtení vstupu: " + e.getMessage());
        }

        return numbers;
    }
}
