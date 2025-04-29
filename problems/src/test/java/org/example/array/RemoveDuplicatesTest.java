package org.example.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    private RemoveDuplicates removeDuplicates;

    @BeforeEach
    void setUp() {
        removeDuplicates = new RemoveDuplicates();
    }

    @Test
    void removeDuplicates() {
        assertEquals(List.of(2,4,5,6,7), removeDuplicates.removeDuplicates(List.of(2,2,4,4,5,6,7,7)));
    }
}