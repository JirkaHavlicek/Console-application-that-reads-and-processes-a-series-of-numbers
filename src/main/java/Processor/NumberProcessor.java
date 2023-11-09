package Processor;

import java.util.ArrayList;
import java.util.List;

public class NumberProcessor {
    public List<Integer> processNumbers(List<Integer> numbers) {
        List<Integer> resultNumbers = new ArrayList<>();

        if (numbers.size() % 2 == 0) {

            for (int number : numbers) {
                if (number % 2 == 0) {
                    resultNumbers.add(number);
                }
            }
        } else {

            for (int number : numbers) {
                if (number % 2 != 0) {
                    resultNumbers.add(number);
                }
            }
        }

        return resultNumbers;
    }
}
