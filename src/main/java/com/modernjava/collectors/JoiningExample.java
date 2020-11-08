package com.modernjava.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {
    public static void main(String[] args) {
        String result = Stream.of("E", "F", "G", "H").collect(Collectors.joining());
        System.out.println(result);

        String result2 = Stream.of("E", "F", "G", "H").collect(Collectors.joining(","));
        System.out.println(result2);

        String result3 = Stream.of("E", "F", "G", "H").collect(Collectors.joining(",", "{", "}"));
        System.out.println(result3);
    }
}
