package lesson2.huuan;

public class Leetcode1221 {
    public int balancedStringSplit(String s) {
        int count = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R'){
                count++;
            } else {count--;}
            if (count == 0){
                ans++;
            }
        }
        return ans;
    }
}
