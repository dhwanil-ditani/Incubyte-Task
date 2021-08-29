package com.dhwanil.task;

public class Calculator {

    public String[] split(String numbers, String sep) {
        return numbers.replace("\n", sep).split(sep);
    }

    public int Add(String numbers) {
        if (numbers.length() == 0) return 0;
        else {
            String[] tokens = split(numbers, ",");
            int sum = 0;
            for (String str : tokens) {
                sum += Integer.parseInt(str);
            }
            return sum;
        }
    }
}
