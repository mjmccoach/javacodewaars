package com.javacodewars.Codewars.phonenumbergenerator;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumberGenerator {
    public static String createPhoneNumber(int[] numbers) {
        List<Integer> numbersArrayList = new ArrayList<>();

        for (int number : numbers) {
            numbersArrayList.add(number);
        }

        return String.format("(%s%s%s) %s%s%s-%s%s%s%s",
                numbersArrayList.getFirst(),
                numbersArrayList.get(1),
                numbersArrayList.get(2),
                numbersArrayList.get(3),
                numbersArrayList.get(4),
                numbersArrayList.get(5),
                numbersArrayList.get(6),
                numbersArrayList.get(7),
                numbersArrayList.get(8),
                numbersArrayList.get(9));
    }
}
