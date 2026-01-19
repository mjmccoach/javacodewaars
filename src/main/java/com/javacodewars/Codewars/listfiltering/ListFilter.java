package com.javacodewars.Codewars.listfiltering;

import java.util.List;
import java.util.stream.Collectors;

public class ListFilter {
    public static List<Object> filterList(final List<Object> list) {
        return list.
                stream()
                .filter(item -> item instanceof Integer)
                .collect(Collectors.toList());
    }
}
