package com.modernjava.datetime;

import java.time.LocalDate;

public class DateModifyExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.plusDays(4));
        System.out.println(localDate);
    }
}
