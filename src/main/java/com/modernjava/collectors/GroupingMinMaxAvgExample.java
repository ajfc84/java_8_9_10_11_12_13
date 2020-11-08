package com.modernjava.collectors;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingMinMaxAvgExample {
    public static void main(String[] args) {
        Map<Boolean, Optional<Instructor>> maxInstructor = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(
                        Instructor::isOnlineCourses,
                        Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience))
                        ));
        maxInstructor.forEach((key, value) -> System.out.println(key + "\n" + value));

        Map<Boolean, Instructor> maxInstructor1 = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(
                        Instructor::isOnlineCourses,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience)),
                                Optional::get
                        )
                ));
        maxInstructor1.forEach((key, value) -> System.out.println(key + "\n" + value));

    }
}
