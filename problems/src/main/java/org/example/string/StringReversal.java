package org.example.string;

public class StringReversal {

    public String reverseString(String inputString) {
        if (null == inputString || inputString.length() <= 1) {
            return inputString;
        }

        char[] inputStringArr = inputString.toCharArray();

        int firstPointer = 0;
        int lastPointer = inputString.length() - 1;

        while (firstPointer <= lastPointer) {
            char temp = inputStringArr[lastPointer];
            inputStringArr[lastPointer] = inputStringArr[firstPointer];
            inputStringArr[firstPointer] = temp;

            firstPointer++;
            lastPointer--;
        }

        return String.valueOf(inputStringArr);
    }
}
