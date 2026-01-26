package com.javacodewars.Codewars.stringReversal;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StringReversalTest {
    @Test
    void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", StringReversal.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", StringReversal.reverseWords("apple"), "Input: \"apple\"");
        assertEquals("a b c d", StringReversal.reverseWords("a b c d"), "Input: \"a b c d\"");
        assertEquals("  elbuod  decaps  sdrow  ", StringReversal.reverseWords("  double  spaced  words  "), "Input: \"  double  spaced  words  \"");
    }
}