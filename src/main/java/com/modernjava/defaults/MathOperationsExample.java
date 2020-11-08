package com.modernjava.defaults;

public class MathOperationsExample implements Calculator {

    public static void main(String[] args) {
        MathOperationsExample mathOperationsExample = new MathOperationsExample();
        System.out.println(mathOperationsExample.sum(2, 4));

        Calculator calculator = (num1, num2) -> num1 % num2;
        System.out.println(calculator.sum(2, 4));

        System.out.println(mathOperationsExample.sub(2, 4));
        System.out.println(Calculator.mul(2, 4));
    }

    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

}
