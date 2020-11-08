package com.modernjava.collectors;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

import java.util.stream.Collectors;

public class CountingExample {
    public static void main(String[] args) {
        long count = Instructors.getAll().stream().filter(Instructor::isOnlineCourses).count();
        System.out.println(count);
        long count2 = Instructors.getAll().stream().filter(Instructor::isOnlineCourses).collect(Collectors.counting());
        System.out.println(count2);
    }
}
