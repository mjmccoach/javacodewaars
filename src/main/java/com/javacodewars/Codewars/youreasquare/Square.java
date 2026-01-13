package com.javacodewars.Codewars.youreasquare;

public class Square {

    public boolean isSquare(int number) {
        if (number < 0) {
            return false;
        }

        int squareRoot = (int) Math.sqrt(number);

        return squareRoot * squareRoot == number;
    }
}
