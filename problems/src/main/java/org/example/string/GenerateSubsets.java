package org.example.string;

import java.util.Set;
import java.util.TreeSet;

public class GenerateSubsets {

    public Set<String> generateSubsets(String input) {
        Set<String> resultSet = new TreeSet<>();

        if (input == null) {
            return null;
        }
        if (input.isEmpty()) {
            resultSet.add("");
            return resultSet;
        }

        resultSet.add("");
        for (char ch : input.toCharArray()) {
            Set<String> newSubsets = new TreeSet<>();
            for (String subset : resultSet) {
                newSubsets.add(subset + ch);
            }
            resultSet.addAll(newSubsets);
        }

        return resultSet;
    }
}
