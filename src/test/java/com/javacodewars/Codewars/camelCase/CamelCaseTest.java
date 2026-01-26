package com.javacodewars.Codewars.camelCase;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CamelCaseTest {
    @Test
    public void tests() {
        assertEquals("camel Casing", CamelCase.camelCase("camelCasing"));
        assertEquals("camel Casing Test", CamelCase.camelCase("camelCasingTest"));
        assertEquals("camelcasingtest", CamelCase.camelCase("camelcasingtest"));
    }

}