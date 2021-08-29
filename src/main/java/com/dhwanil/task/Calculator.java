package com.dhwanil.task;

public class Calculator {

    /**
     * Extract substrings containing numbers from input string.
     * @param numbers
     * @return
     */
    public String[] split(String numbers) {
        String sep = ",";
        if (numbers.startsWith("//")) {
            sep = String.valueOf(numbers.charAt(2));
            numbers = numbers.substring(4);
        }
        return split(numbers, sep);
    }

    public String[] split(String numbers, String sep) {
        return numbers.replace("\n", sep).split(sep);
    }

    public String join(String mainString, String joinString, String sep) {
        if (mainString.length() == 0) {
            mainString = joinString;
        }
        else {
            mainString = String.join(sep, mainString, joinString);
        }
        return mainString;
    }

    /**
     * Parse String to Integers and checks for Negative Numbers
     * @param numbers
     * @return int array of numbers
     * @throws RuntimeException
     */
    public int[] StringtoInt(String[] numbers) throws RuntimeException {
        int[] result = new int[numbers.length];
        String negNums = "";
        for (int i=0; i < numbers.length; i++) {
            result[i] = Integer.parseInt(numbers[i]);
            if (result[i] < 0) {
                if (negNums == "") {
                    negNums = numbers[i];
                }
                else {
                    negNums = String.join(",", negNums, numbers[i]);
                }
            }
        }
        if (negNums.length() != 0) {
            throw new RuntimeException("Negative Numbers not allowed: " + negNums);
        }
        return result;
    }

    public int Add(String numbers) {
        if (numbers.length() == 0) return 0;
        else {
            int[] nums = StringtoInt(split(numbers));
            int sum = 0;
            for (int i=0; i<nums.length; i++) {
                sum += nums[i];
            }
            return sum;
        }
    }
}
