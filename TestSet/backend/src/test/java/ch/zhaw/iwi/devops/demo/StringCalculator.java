package ch.zhaw.iwi.devops.demo;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        if (numbers.contains(",")) {
            String[] nums = numbers.split(",");
            int sum = 0;
            for (String num : nums) {
                sum += Integer.parseInt(num.trim()); // Korrektur nach Test 4: Summiere alle getrennten Zahlen.
            }
            return sum;
        }
        return Integer.parseInt(numbers);
    }
}
