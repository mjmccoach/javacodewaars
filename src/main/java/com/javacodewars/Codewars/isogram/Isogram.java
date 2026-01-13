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
        //make list of letters
        //iterate through string
        //if first letter don't check if letter exists in array
        //otherwise check if letter exists and if it does set outcome to false and break out
        return outcome;
    }
}
