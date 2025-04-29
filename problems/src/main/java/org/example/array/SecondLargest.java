package org.example.array;

import java.util.List;

public class SecondLargest {

    public Integer findSecondLargest(List<Integer> inputList) {
        Integer largest = inputList.getFirst();
        Integer secondLargest = largest;

        for (Integer num: inputList) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
        }

        return secondLargest;
    }
}
