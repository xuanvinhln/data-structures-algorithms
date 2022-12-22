package lesson2.huuan;

public class Leetcode2011 {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (String operation : operations) {
            if (operation.contains("+")) {
                ans++;
            } else {
                ans--;
            }
        }
        return ans;
    }
}
