package com.modernjava.streams;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

import java.util.Optional;

public class FindAnyAndFirstExample {
    public static void main(String[] args) {
        Optional<Instructor> instructor = Instructors.getAll().stream().findAny();
        if(instructor.isPresent())
            System.out.println(instructor.get());
        Optional<Instructor> instructor2 = Instructors.getAll().stream().findFirst();
        if(instructor2.isPresent())
            System.out.println(instructor2.get());
    }
}
