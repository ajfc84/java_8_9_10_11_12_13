package com.modernjava.funcprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        Consumer<Instructor> c1 = (s1) -> System.out.println(s1);
        instructors.forEach(c1);

        Consumer<Instructor> c2 = s1 -> System.out.println(s1.getName());
        instructors.forEach(c2);

        Consumer<Instructor> c3 = s1 -> System.out.println(s1.getCourses());
        instructors.forEach(c2.andThen(c3));

        instructors.forEach( s1 -> {
            if (s1.yearsOfExperience > 10)
                c1.accept(s1);
            }
        );

        instructors.forEach(s1 -> {
            if(s1.yearsOfExperience > 5 && s1.isOnlineCourses())
                c1.andThen(c2).accept(s1);
        });
    }
}
