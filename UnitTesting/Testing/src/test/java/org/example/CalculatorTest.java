package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSub() {
        assertEquals(5, calculator.sub(10, 5));
    }

    @Test
    public void testMul() {
        assertEquals(50, calculator.mul(5, 10));
    }

    @Test
    public void testDiv() {
        assertEquals(5, calculator.div(10, 2));
    }
}