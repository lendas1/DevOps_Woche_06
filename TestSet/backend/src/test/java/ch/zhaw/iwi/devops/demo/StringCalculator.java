package ch.zhaw.iwi.devops.demo;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(numbers); // Korrektur nach Test2: Einzelne Zahl wird korrekt geparst und zurückgegeben.
    }
}