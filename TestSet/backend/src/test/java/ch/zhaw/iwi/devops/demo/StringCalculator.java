package ch.zhaw.iwi.devops.demo;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        if (numbers.contains(",")) {
            String[] nums = numbers.split(",");
            return Integer.parseInt(nums[0].trim()) + Integer.parseInt(nums[1].trim());
        }
        return Integer.parseInt(numbers);
    }
}
