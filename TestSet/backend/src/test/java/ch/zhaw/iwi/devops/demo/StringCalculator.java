package ch.zhaw.iwi.devops.demo;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
            int delimiterEnd = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterEnd);
            numbers = numbers.substring(delimiterEnd + 1);
        }
        String[] nums = numbers.split(delimiter);
        int sum = 0;
        List<String> negatives = new ArrayList<>();
        for (String num : nums) {
            int number = Integer.parseInt(num.trim());
            if (number < 0) {
                negatives.add(num.trim());
            } else if (number <= 1000) {
                sum += number; // Ignoriere Zahlen größer als 1000.
            }

        }
        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negatives not allowed: " + String.join(", ", negatives));
        }
        return sum; // Summiere alle getrennten Zahlen.
    }
}
