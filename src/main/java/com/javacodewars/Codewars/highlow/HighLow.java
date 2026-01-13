package com.javacodewars.Codewars.highlow;

import java.util.ArrayList;
import java.util.List;

public class HighLow {
    public static String highAndLow(String numbers) {
        List<Integer> intNumbers = new ArrayList<>();
        String[] splitNumbers = numbers.split(" ");

        for (String number : splitNumbers) {
            intNumbers.add(Integer.valueOf(number));
        }

        Integer highestNumber = 0;
        Integer lowestNumber = intNumbers.getFirst();

        for (Integer number : intNumbers) {
            if (number > highestNumber) {
                highestNumber = number;
            }

            if (number < lowestNumber) {
                lowestNumber = number;
            }
        }
        return String.format("%s %s", highestNumber, lowestNumber);
    }
}
