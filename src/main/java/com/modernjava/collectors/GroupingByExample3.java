package com.modernjava.collectors;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample3 {
    public static void main(String[] args) {
        List<String> name = List.of("Sid", "Mike", "Jenny", "Rajeev");
        LinkedHashMap<Integer, List<String>> result = name.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        LinkedHashMap::new,
                        Collectors.filtering(s -> s.contains("e"), Collectors.toList())
                ));
        System.out.println(result);

        Map<String, List<Instructor>> instructorByExperienceAndOnline = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(
                        i -> i.getYearsOfExperience() > 10 ? "Senior" : "Junior",
                        Collectors.filtering(s -> s.isOnlineCourses(), Collectors.toList())
                ));
        instructorByExperienceAndOnline.forEach((key, value) -> System.out.println(key + "\n" + value));
    }
}
