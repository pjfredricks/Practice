package org.example.string;

public class AnagramCheck {

    public boolean isAnagram(String first, String second) {
        if (null == first || null == second || first.length() != second.length()) {
            return false;
        } else {
            int[] alphabetArr = new int[26];
            for (int i = 0; i < first.length(); i++) {
                alphabetArr[first.charAt(i) - 'a']++;
                alphabetArr[second.charAt(i) - 'a']--;
            }

            for (int alphabet : alphabetArr) {
                if (alphabet != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
