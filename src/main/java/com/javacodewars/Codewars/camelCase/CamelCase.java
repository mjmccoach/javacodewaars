package com.javacodewars.Codewars.camelCase;

public class CamelCase {
    public static String camelCase(String input) {
        String[] parts = input.split("(?=[A-Z])");
        return String.join(" ", parts);
    }
}
