package com.example.lab5;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestCalculator {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2,3), 0.001);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.sub(5,2), 0.001);
    }
}
