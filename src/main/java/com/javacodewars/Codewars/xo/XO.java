package com.javacodewars.Codewars.xo;

import java.util.Arrays;
import java.util.List;

public class XO {

    public static boolean getXO(String str) {
        String[] stringArray = str.toLowerCase().split("");
        List<String> stringList = Arrays.asList(stringArray);

        if (!stringList.contains("o") && !stringList.contains("x")) {
            return true;
        }

        int xCounter = 0;
        int oCounter = 0;

        for (String character : stringList) {
            if (character.equals("x")) {
                xCounter += 1;
            }

            if (character.equals("o")) {
                oCounter += 1;
            }
        }

        return xCounter == oCounter;
    }
}
