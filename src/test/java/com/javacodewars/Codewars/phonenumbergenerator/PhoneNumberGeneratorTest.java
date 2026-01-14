package com.javacodewars.Codewars.phonenumbergenerator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class PhoneNumberGeneratorTest {
    @Test
    public void tests() {
        assertEquals("(123) 456-7890", PhoneNumberGenerator.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}