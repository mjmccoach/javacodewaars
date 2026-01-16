package com.javacodewars.Codewars.order;

import java.util.HashMap;
import java.util.Map;

public class Order {
    public static String order(String words) {
        Map<Integer, String> wordMap = new HashMap<>();
        String[] wordsArray = words.split(" ");

        for (String word : wordsArray) {
            String[] wordChars = word.split("");

            for (String character : wordChars) {
                boolean isDigit = isInteger(character);
                if (isDigit) {
                    wordMap.put(Integer.parseInt(character), word);
                }
            }
        }

        return String.join(" ", wordMap.values());
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
