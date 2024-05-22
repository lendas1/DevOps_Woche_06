package ch.zhaw.iwi.devops.demo;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        // Korrektur nach Test 5: Ersetze alle Zeilenumbrüche durch Kommas
        numbers = numbers.replace("\n", ",");
        if (numbers.contains(",")) {
            String[] nums = numbers.split(",");
            int sum = 0;
            for (String num : nums) {
                sum += Integer.parseInt(num.trim());
            }
            return sum; // Summiere alle getrennten Zahlen.
        }
        return Integer.parseInt(numbers);
    }
}
