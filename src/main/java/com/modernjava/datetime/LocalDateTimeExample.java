package com.modernjava.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        localDateTime = localDateTime.of(2018, 1, 12, 12, 12);
        System.out.println("localDateTime = " + localDateTime);

        localDateTime = localDateTime.of(LocalDate.now(), LocalTime.now());

        System.out.println("localDateTime.getHour() = " + localDateTime.getHour());
        System.out.println("localDateTime.getMonth() = " + localDateTime.getMonth());
        System.out.println("localDateTime.getMinute() = " + localDateTime.getMinute());
        System.out.println("localDateTime.getSecond() = " + localDateTime.getSecond());
        System.out.println("localDateTime.get(ChronoField.MONTH_OF_YEAR) = " + localDateTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("localDateTime.plusHours() = " + localDateTime.plusYears(3));
        System.out.println("localDateTime.plusHours() = " + localDateTime.plusHours(4));
        System.out.println("localDateTime.plusMinutes(60) = " + localDateTime.plusMinutes(60));
        System.out.println("localDateTime.with(ChronoField.HOUR_OF_DAY, 4) = " + localDateTime.with(ChronoField.HOUR_OF_DAY, 4));
    }
}
