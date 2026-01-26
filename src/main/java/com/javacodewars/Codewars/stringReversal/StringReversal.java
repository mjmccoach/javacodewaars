package com.javacodewars.Codewars.stringReversal;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReversal {
    public static String reverseWords(final String original) {
        Pattern p = Pattern.compile("\\S+| {1,2}");
        Matcher m = p.matcher(original);

        List<String> words = new ArrayList<>();
        while (m.find()) {
            words.add(m.group());
        }

        List<String> reversed = new ArrayList<>();
        for (String word : words) {
            reversed.add(new StringBuilder(word).reverse().toString());
        }

        return String.join("", reversed);
    }
}
