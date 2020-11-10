package com.modernjava.java12improvements;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        var month = "January";
        var quarter = switch (month) {
           case "January", "February" -> "FIRST";
           case "other" -> "OTHER";
           default -> "UKN";
        };
        System.out.println("quarter = " + quarter);
    }
}
