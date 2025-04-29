package org.example.string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public String findFirstNonRepeatingChar(String input) {
        if (null == input || input.isEmpty()) {
            return input;
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        for (char c : input.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                return String.valueOf(c);
            }
        }

        return null;
    }
}
