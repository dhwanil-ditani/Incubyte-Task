package com.dhwanil.task;

public class Calculator {

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

    public int Add(String numbers) {
        if (numbers.length() == 0) return 0;
        else {
            String[] tokens = split(numbers);
            int sum = 0;
            String negNums = "";
            for (String str : tokens) {
                int n = Integer.parseInt(str);
                if (n < 0) {
                    negNums = join(negNums, str, ",");
                }
                sum += n;
            }
            if (negNums.length() != 0) {
                throw new RuntimeException("Negative Numbers not allowed: " + negNums);
            }
            return sum;
        }
    }
}
