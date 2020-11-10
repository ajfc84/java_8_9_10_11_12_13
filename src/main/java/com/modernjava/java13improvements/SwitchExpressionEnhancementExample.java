package com.modernjava.java13improvements;

import java.time.LocalDate;

public class SwitchExpressionEnhancementExample {
    public static void main(String[] args) {
        var month = "January";
        var quarter = switch (month) {
            case "January" -> {
                var isLeapYear = LocalDate.now().isLeapYear();
                yield (isLeapYear ? "FIRST LEAP" : "FIRST");
            }
            default -> "UKN";
        };
        System.out.println("quarter = " + quarter);
    }
}
