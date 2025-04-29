package org.example.array;

import java.util.List;

public class RemoveDuplicates {
    public List<Integer> removeDuplicates(List<Integer> inputList) {
        return inputList.stream()
                .distinct()
                .toList();
    }
}
