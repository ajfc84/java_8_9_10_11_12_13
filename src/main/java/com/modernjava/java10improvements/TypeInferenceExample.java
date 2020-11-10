package com.modernjava.java10improvements;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TypeInferenceExample {
    public static void main(String[] args) {
        String name = "Mike";
        var name2 = "Mike";
        System.out.println("name = " + name);
        System.out.println("name2 = " + name2);
        var dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);
        HashMap<Integer, String> map = new HashMap<>();
        var map1 = new HashMap<Integer, String>();
        int[] numbers = {1, 2, 3 ,4};
        var numbers1 = new int[] {1, 2, 3, 4};
        List<String> list = new ArrayList<>();
        list.add("Syed");
        list.add("Mike");
        var list1 = new ArrayList<>();
        list1.add("Syed");
        list1.add("Mike");
        list1.add(7);
        list1.forEach(System.out::println);
        var integers = List.of(1, 2, 3, 4);
        integers.forEach(System.out::println);
        var number = 7;
        var db = 7568383.000000;
        var div = 7 / 2.0;
        System.out.println("div = " + div);
        var div2 = 7.0/ 2;
        System.out.println("div2 = " + div2);
    }
}
