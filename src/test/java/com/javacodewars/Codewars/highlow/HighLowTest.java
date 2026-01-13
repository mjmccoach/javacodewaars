package com.javacodewars.Codewars.highlow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class HighLowTest {
    @Test
    public void test1() {
        assertEquals("42 -9", HighLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    @Test
    public void test2() {
        assertEquals("3 1", HighLow.highAndLow("1 2 3"));
    }
}