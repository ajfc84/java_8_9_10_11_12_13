package com.modernjava.numericstreams;

import java.util.Random;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        IntStream numbers = IntStream.of(1, 2, 3, 4, 5, 6);
        numbers.forEach(System.out::println);

        IntStream numbers2 = IntStream.iterate(0, i -> i + 2).limit(10);
        numbers2.forEach(System.out::println);

        IntStream numbers3 = IntStream.generate(new Random()::nextInt).limit(10);
        numbers3.forEach(System.out::println);

        IntStream numbers4 = IntStream.range(1, 5);
        numbers4.forEach(System.out::println);

        IntStream numbers5 = IntStream.rangeClosed(1, 5);
        numbers5.forEach(System.out::println);
    }
}
