package com.dhwanil.task;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {
    Calculator cal;

    @Before
    public void setup() {
        cal = new Calculator();
    }

    @Test
    public void EmptyStringInput() {
        assertEquals(cal.Add(""), 0);
    }

    @Test
    public void SingleNumberInput() {
        assertEquals(cal.Add("1"), 1);
    }

    @Test
    public void MultipleNumberInput() {
        assertEquals(cal.Add("1,2"), 3);
        assertEquals(cal.Add("10,20,30,40,50"), 150);
    }

    @Test
    public void NewLineCharAsDelimiter() {
        assertEquals(cal.Add("1\n2,3"), 6);
    }
}
