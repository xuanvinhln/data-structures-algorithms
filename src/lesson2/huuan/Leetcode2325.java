package lesson2.huuan;

public class Leetcode2325 {
    public String decodeMessage(String key, String message) {
        Character[] keys = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'};
        int[] alphabet = new int[26];
        int keysIndex = 0;
        boolean isUniqueChar;
        for (int i = 0; i < key.length(); i++) {
            isUniqueChar = true;
            if (key.charAt(i) == ' ') {
                continue;
            }
            for (int j = 0; j < keysIndex + 1; j++) {
                if (keysIndex == 26 || keys[j] == key.charAt(i)) {
                    isUniqueChar = false;
                    break;
                }
            }
            if (isUniqueChar) {
                keys[keysIndex] = key.charAt(i);
                keysIndex++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                stringBuilder.append(' ');
                continue;
            }
            for (int j = 0; j < keys.length; j++) {
                if (message.charAt(i) == keys[j]) {
                    stringBuilder.append((char) (j + 97));
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }
}
