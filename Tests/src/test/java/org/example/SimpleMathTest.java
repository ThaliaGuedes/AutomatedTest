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
    @Test
    void testSubtracao(){
      SimpleMath math = new SimpleMath();

      double firstNumber = 5D;
      double secondNumber = 4;

      Double actual = math.subtraction(firstNumber , secondNumber);
      double expected = 1D;

      assertEquals(expected, actual);
    }

    @Test
    void testDivisao(){
        SimpleMath math = new SimpleMath();

        double firstNumber = 25D;
        double secondNumber = 5D;
        Double actual = math.division(firstNumber, secondNumber);
        double expected = 5;

        //lambda so sera executado caso o teste falhe
        assertEquals(expected, actual, () -> firstNumber + "/" + secondNumber +
                "did not produce" + expected + "!");
    }
    @Test
    void testMultiplicacao(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 4D;
        double seconNumber = 8D;

        Double actual = math.multiplication(firstNumber, seconNumber);
        double expected = 32D;

        //importante lembrar que
        // o lambda so vai ser executado,
        // se algo la na minha classe estiver errado

        assertEquals(expected, actual, () -> firstNumber + "*" + seconNumber +
                " did not producer" + expected + "!");

    }
}