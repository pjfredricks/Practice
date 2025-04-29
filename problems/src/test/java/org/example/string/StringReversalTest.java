package org.example.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReversalTest {

    private StringReversal stringReversal;

    @BeforeEach
    void setUp() {
        stringReversal = new StringReversal();
    }

    @Test
    void reverseString() {
        assertNull(stringReversal.reverseString(null));
        assertEquals("", stringReversal.reverseString(""));
        assertEquals("a", stringReversal.reverseString("a"));
        assertEquals("racecar", stringReversal.reverseString("racecar"));
        assertEquals("emoclew", stringReversal.reverseString("welcome"));
    }
}