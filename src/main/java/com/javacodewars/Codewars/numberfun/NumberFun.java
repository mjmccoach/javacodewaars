package com.javacodewars.Codewars.numberfun;

public class NumberFun {
    public static long findNextSquare(long sq) {
        //iterate through longs
        //do a find first on next long that meets square number conditions
        long nextSquare = 0;
        if (!isSquare(sq)) {
            return -1;
        }
        for (long i = sq + 1; i < Integer.MAX_VALUE; i++) {
            System.out.print(i);
            boolean isNumberSquare = isSquare(i);
            if (isNumberSquare) {
                nextSquare = i;
                break;
            }
        }
        return nextSquare;
    }

    private static boolean isSquare(long number) {
        if (number < 0) {
            return false;
        }

        long squareRoot = (long) Math.sqrt(number);
        return squareRoot * squareRoot == number;
    }
}
