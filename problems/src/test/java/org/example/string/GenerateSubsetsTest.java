package org.example.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GenerateSubsetsTest {

    private GenerateSubsets generateSubsets;

    @BeforeEach
    void setUp() {
        generateSubsets = new GenerateSubsets();
    }

    @Test
    void generateSubsets() {
        assertNull(generateSubsets.generateSubsets(null));
        assertEquals(Set.of(""), generateSubsets.generateSubsets(""));
        assertEquals(Set.of("", "a"), generateSubsets.generateSubsets( "a"));
        assertEquals(Set.of("", "a", "b", "ab"), generateSubsets.generateSubsets("ab"));
        assertEquals(Set.of("", "a", "b", "c", "ab", "bc", "ac", "abc"), generateSubsets.generateSubsets("abc"));
    }
}