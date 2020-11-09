package com.modernjava.datetime;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        localDate = LocalDate.ofYearDay(2018, 21);
        System.out.println(localDate);

        localDate = LocalDate.of(2018, 12, 21);
        System.out.println(localDate);

        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println("localDate.getDayOfYear() = " + localDate.getDayOfYear());
    }
}
