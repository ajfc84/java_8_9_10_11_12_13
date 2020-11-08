package com.modernjava.collectors;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorMappingExample {
    public static void main(String[] args) {
        List<String> namesList = Instructors.getAll().stream()
                .map(Instructor::getName)
                .collect(Collectors.toList());
        namesList.forEach(System.out::println);
        List<String> namesList2 = Instructors.getAll().stream()
                .collect(Collectors.mapping(Instructor::getName, Collectors.toList()));
        namesList2.forEach(System.out::println);

        Map<Integer, List<String>> mapYearsOfExperienceAndNames = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getYearsOfExperience,
                        Collectors.mapping(Instructor::getName, Collectors.toList())
                ));
        mapYearsOfExperienceAndNames.forEach((key, value) -> System.out.println("key = " + key + ", value " + value));
    }
}
