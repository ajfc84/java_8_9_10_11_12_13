package com.modernjava.generators;

import java.util.Random;
import java.util.stream.Stream;

public class StreamFactoryMethodExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6,7 , 8);
        stream.forEach(System.out::println);

        Stream<Integer> stream2 = Stream.iterate(0, i -> i + 2).limit(10);
        stream2.forEach(System.out::println);

        Stream<Integer> stream3 = Stream.generate(new Random()::nextInt).limit(10);
        stream3.forEach(System.out::println);
    }
}
