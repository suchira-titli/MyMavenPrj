package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for App class
 */
public class AppTest {

    private App app;

    @Before
    public void setUp() {
        app = new App();
    }

    // Tests for add method
    @Test
    public void testAdd() {
        assertEquals(5, app.add(2, 3));
        assertEquals(0, app.add(0, 0));
        assertEquals(1, app.add(5, -4));
    }

    // Tests for subtract method
    @Test
    public void testSubtract() {
        assertEquals(2, app.subtract(5, 3));
        assertEquals(9, app.subtract(5, -4));
    }

    // Tests for multiply method
    @Test
    public void testMultiply() {
        assertEquals(15, app.multiply(5, 3));
        assertEquals(0, app.multiply(5, 0));
        assertEquals(-6, app.multiply(2, -3));
    }

    // Tests for divide method (only normal case)
    @Test
    public void testDivide() {
        assertEquals(2, app.divide(6, 3));
        assertEquals(1, app.divide(5, 3));
    }

    // Tests for isPositive method (partial branch coverage)
    @Test
    public void testIsPositive() {
        assertTrue(app.isPositive(5));
    }
}
