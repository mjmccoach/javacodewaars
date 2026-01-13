package com.javacodewars.Codewars.isogram;

import java.util.ArrayList;
import java.util.List;

public class Isogram {

    public boolean  isIsogram(String str) {
        boolean outcome = true;
        String[] stringCharacters = str.toLowerCase().split("");
        List<String> usedLetters = new ArrayList<>();

        for (String character : stringCharacters) {
            if (usedLetters.contains(character)) {
                outcome = false;
                break;
            } else {
                usedLetters.add(character);
            }
        }
        return outcome;
    }
}
