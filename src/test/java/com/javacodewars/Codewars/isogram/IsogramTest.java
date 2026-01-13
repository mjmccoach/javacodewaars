package com.javacodewars.Codewars.isogram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class IsogramTest {
    private Isogram isogram;

    @BeforeEach
    void setUp() {
        isogram = new Isogram();
    }

    @Test
    public void FixedTests() {
        assertTrue(isogram.isIsogram("Dermatoglyphics"));
        assertTrue(isogram.isIsogram("isogram"));
        assertFalse(isogram.isIsogram("moose"));
        assertFalse(isogram.isIsogram("isIsogram"));
        assertFalse(isogram.isIsogram("aba"));
        assertFalse(isogram.isIsogram("moOse"));
        assertTrue(isogram.isIsogram("thumbscrewjapingly"));
        assertTrue(isogram.isIsogram(""));
    }

}