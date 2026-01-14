package com.javacodewars.Codewars.sumofnumbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class SumTest {
    private Sum sum;

    @BeforeEach
    void setUp() {
        sum = new Sum();
    }

    @Test
    public void Test1() {
        assertEquals(-1, sum.getSum(0, -1));
        assertEquals(1, sum.getSum(0, 1));
    }

}