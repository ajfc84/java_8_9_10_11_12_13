package com.modernjava.funcprogramming;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> supplier = () -> Math.random() * 1000;
        System.out.println(supplier.get());
    }
}
