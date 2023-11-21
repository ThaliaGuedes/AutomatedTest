package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {
    @Test
    void testeSoma(){
        SimpleMath math = new SimpleMath();
        Double actual = math.sum(6.6D, 4.0);
        double expected = 10.6D;
        assertEquals(expected, actual);
    }

}