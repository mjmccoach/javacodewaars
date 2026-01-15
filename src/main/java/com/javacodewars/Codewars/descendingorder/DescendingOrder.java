package com.javacodewars.Codewars.descendingorder;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        int[] digits = String.valueOf(num)
                .chars()
                .map(c -> c - '0')
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        String numberString = Arrays.stream(digits)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

        return Integer.parseInt(numberString);
    }
}
