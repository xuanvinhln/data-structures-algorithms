package lesson1.huuan;

public class Leetcode1528 {
    public String restoreString(String s, int[] indices) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            ans += s.charAt(indices[i]);
        }
        return ans;
    }
}
