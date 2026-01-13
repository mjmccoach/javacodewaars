package com.javacodewars.Codewars.youreasquare;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class SquareTest {
    private Square square;

    @BeforeEach
    void setUp() {
        square = new Square();
    }

    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertFalse(square.isSquare(-1));
        assertTrue(square.isSquare(0));
        assertFalse(square.isSquare(3));
        assertTrue(square.isSquare(4));
        assertTrue(square.isSquare(25));
        assertFalse(square.isSquare(26));
    }
}