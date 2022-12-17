package lesson1.tuananh;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1528 {
    public String restoreString(String s, int[] indices) {
        String temp ="";
        Map<Integer,Character> map = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], s.charAt(i));
        }
        for (int i = 0; i < indices.length; i++) {
            temp+=map.get(i);
        }
        return temp;
    }
}
