package com.jwetherell.algorithms.mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    //CHANGE BASED ON WHAT METHOD IS BEING TEST.....
    @Test
    public void simpleMultiplication() {
        assertEquals(4, Multiplication.multiplication(1, 4)); // changed to integers
    }

    @Test
    public void testZeroMultiplication() {
        assertEquals(0, Multiplication.multiplication(0, 1)); // changed to integers
    }

    // One Negative Case
    @Test
    public void oneNegativeMultiplication() {
        assertEquals(-2, Multiplication.multiplication(2, -1)); // changed to integers
    }

    @Test
    public void oneNegativeMultiplication_2() {
        assertEquals(-2, Multiplication.multiplication(-1, 2)); // changed to integers
    }

    // Two Negative Case
    @Test
    public void twoNegativeMultiplication() {
        assertEquals(4, Multiplication.multiplication(-2, -2)); // changed to integers
    }
}
