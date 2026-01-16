package com.javacodewars.Codewars.order;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class OrderTest {
    @Test
    public void test1() {
        assertEquals("Thi1s is2 3a T4est", Order.order("is2 Thi1s T4est 3a"));
    }

    @Test
    public void test2() {
        assertEquals("Fo1r the2 g3ood 4of th5e pe6ople", Order.order("4of Fo1r pe6ople g3ood th5e the2"));
    }

    @Test
    public void test3() {
//       "Empty input should return empty string"
        assertEquals("", Order.order(""));
    }
}