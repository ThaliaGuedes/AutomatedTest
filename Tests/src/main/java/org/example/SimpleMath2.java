package org.example;

public class SimpleMath2 {
    public Double sum (Double firtNumber, Double secondNumber){
        return firtNumber + secondNumber;
    }
    public Double subtraction(Double firstNumber, Double secondNumber){
        return firstNumber - secondNumber;
    }
    public Double division(Double firstNumber, Double secondNumber){
        if (secondNumber == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return firstNumber / secondNumber;
    }
    public Double multiplication(Double firtsNumber, Double secondNumber){
        return firtsNumber * secondNumber;
    }

    public Double mean(Double firstNumber, Double secondNumber){
        return (firstNumber + secondNumber) / 2;
    }
}
