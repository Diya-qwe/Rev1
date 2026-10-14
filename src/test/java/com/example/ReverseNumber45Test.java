package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseNumber45Test {

    ReverseNumber45 obj = new ReverseNumber45();

    @Test
    public void testReversePositiveNumber() {
        assertEquals(54321, obj.reverse(12345));
    }

    @Test
    public void testReverseNumberEndingInZero() {
        assertEquals(321, obj.reverse(1230));
    }

    @Test
    public void testReverseSingleDigit() {
        assertEquals(5, obj.reverse(5));
    }

    @Test
    public void testReverseZero() {
        assertEquals(0, obj.reverse(0));
    }

    @Test
    public void testReverseNegativeNumber() {
        assertEquals(-543, obj.reverse(-345));
    }

    @Test
    public void testReverseTwoDigitNumber() {
        assertEquals(21, obj.reverse(12));
    }

    @Test
    public void testReverseRepeatedDigits() {
        assertEquals(111, obj.reverse(111));
    }
}