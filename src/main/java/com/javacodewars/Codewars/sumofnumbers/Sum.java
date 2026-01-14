package com.javacodewars.Codewars.sumofnumbers;

import java.util.ArrayList;
import java.util.List;

public class Sum {

    public int getSum(int num1, int num2) {
        int highestNumber = Math.max(num1, num2);
        int lowestNumber = Math.min(num1, num2);

        List<Integer> numbersInRange = new ArrayList<>();
        for (int i = lowestNumber; i <= highestNumber; i++) {
            numbersInRange.add(i);
        }

        int sum = 0;

        for (int number : numbersInRange) {
            sum += number;
        }

        return sum;
    }
}
