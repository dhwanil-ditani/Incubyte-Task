package com.dhwanil.task;

public class Calculator {
    public int Add(String numbers) {
        if (numbers.length() == 0) return 0;
        else return Integer.parseInt(numbers);
    }
}
