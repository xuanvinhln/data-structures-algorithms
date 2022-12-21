package lesson2;

import java.util.Arrays;

public class LeetCode387 {
    public static void main(String[] args) {
        String str = "aabbcdz";
        firstUniqChar2(str);
    }

    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean isDuplicated = false;
            char currentChar = s.charAt(i);

            for (int j = 0; j < s.length(); j++) {
                if (i != j && currentChar == s.charAt(j)) {
                    isDuplicated = true;
                    break;
                }
            }

            if (!isDuplicated) {
                return i;
            }
        }

        return -1;
    }

    public static int firstUniqChar2(String s) {
        int[] frequency = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int index = currentChar - 97;
            frequency[index]++;
        }

        System.out.println(Arrays.toString(frequency));

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int index = currentChar - 97;
            if (frequency[index] == 1) {
                return i;
            }
        }

        return -1;
    }
}
