package com.modernjava.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class defaultsStaticExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mike", "Syed", "Jenny", "Gene", "Rajeev");
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
    }
}
