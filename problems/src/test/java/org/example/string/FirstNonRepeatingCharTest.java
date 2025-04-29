package org.example.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNonRepeatingCharTest {

    private FirstNonRepeatingChar repeatingChar;

    @BeforeEach
    void setUp() {
        repeatingChar = new FirstNonRepeatingChar();
    }

    @Test
    void findFirstNonRepeatingChar() {
        assertNull(repeatingChar.findFirstNonRepeatingChar(null));
        assertEquals("", repeatingChar.findFirstNonRepeatingChar(""));
        assertEquals("i", repeatingChar.findFirstNonRepeatingChar("assasin"));
        assertEquals("o", repeatingChar.findFirstNonRepeatingChar("rockstar"));
        assertEquals("w", repeatingChar.findFirstNonRepeatingChar("wool"));
    }
}