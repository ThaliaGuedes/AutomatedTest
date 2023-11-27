package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleMath2Test {
    @ParameterizedTest
    @MethodSource("testDivisaoInputParametros")
    void testDivisao(double firstNumber, double secondNumber, double expected) {
        SimpleMath math = new SimpleMath();

        Double actual = math.division(firstNumber, secondNumber);

        //lambda so sera executado caso o teste falhe
        assertEquals(expected, actual, 2D, () -> firstNumber + "/" + secondNumber +
                "did not produce" + expected + "!");
    }

    public static Stream<Arguments> testDivisaoInputParametros() {
        return Stream.of(
                Arguments.of(6.2D, 2D, 3.1D),
                Arguments.of(71D, 14D, 5.07D),
                Arguments.of(18.3D, 3.1D, 5.90D)
        );
    }
}
