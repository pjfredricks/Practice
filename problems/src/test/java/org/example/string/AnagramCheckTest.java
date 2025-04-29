package org.example.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckTest {

    private AnagramCheck anagramCheck;

    @BeforeEach
    void setUp() {
        anagramCheck = new AnagramCheck();
    }

    @Test
    void isAnagram() {
        assertTrue(anagramCheck.isAnagram("", ""));
        assertTrue(anagramCheck.isAnagram("rat", "tar"));
        assertFalse(anagramCheck.isAnagram("wood", "wool"));
        assertFalse(anagramCheck.isAnagram("wool", "wwwl"));
    }
}