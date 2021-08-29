package com.dhwanil.task;

import java.util.Arrays;

public class Calculator {
    public int Add(String numbers) {
        if (numbers.length() == 0) return 0;
        else {
            String[] tokens = numbers.split(",");
            int sum = 0;
            for (String str : tokens) {
                sum += Integer.parseInt(str);
            }
            return sum;
        }
    }
}
