package com.javacodewars.Codewars.populationgrowth;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class PopulationGrowthTest {
    private static void testing(int expected, int actual) {
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        System.out.println("Fixed Tests: nbYear");
        testing(15, PopulationGrowth.nbYear(1500, 5, 100, 5000));
        testing(10, PopulationGrowth.nbYear(1500000, 2.5, 10000, 2000000));
        testing(94, PopulationGrowth.nbYear(1500000, 0.25, 1000, 2000000));
    }
}