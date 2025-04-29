package org.example.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SecondLargestTest {

    private SecondLargest secondLargest;

    @BeforeEach
    void setUp() {
        secondLargest = new SecondLargest();
    }

    @Test
    void findSecondLargest() {
        assertEquals(5, secondLargest.findSecondLargest(List.of(1 , 2, 3, 4, 5, 6)));
        assertEquals(4, secondLargest.findSecondLargest(List.of(4, 6)));
    }
}