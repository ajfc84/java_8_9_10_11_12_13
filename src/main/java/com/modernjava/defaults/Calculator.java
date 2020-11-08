package com.modernjava.defaults;

public interface Calculator {
    int sum(int num1, int num2);

    default int sub(int num1, int num2) {
        return num1 - num2;
    }

    static int mul(int num1, int num2) {
        return num1 * num2;
    }
}
