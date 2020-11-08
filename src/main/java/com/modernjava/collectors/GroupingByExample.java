package com.modernjava.collectors;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<String> names = List.of("Syed", "Mike", "Jenny", "Rajeev");
        Map<Integer, List<String>> result = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(result);

        Map<String, List<Instructor>> instructorsByGender = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getGender));
        System.out.println(instructorsByGender);

        Map<String, List<Instructor>> instructorsByExperience = Instructors.getAll().stream()
                .collect(Collectors.groupingBy( i -> i.getYearsOfExperience() > 10 ? "Senior" : "Junior"));
        instructorsByExperience.forEach((key, value) -> System.out.println(key + "\n" + value));
    }
}
