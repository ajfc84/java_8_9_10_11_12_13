package com.modernjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int results = numbers.stream()
                .reduce(0, (a, b) -> a+b);
        System.out.println(results);
        int results2 = numbers.stream()
                .reduce(1, (a, b) -> a*b);
        System.out.println(results2);
        Optional<Integer> results3 = numbers.stream()
                .reduce((a, b) -> a+b);
        if(results3.isPresent())
            System.out.println(results3.get());

    }
}
