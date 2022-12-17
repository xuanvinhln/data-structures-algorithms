package lesson1.huuan;

public class Leetcode1672 {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int customerCompareWealth = 0;
            for (int i : account) {
                customerCompareWealth += i;
            }
            if (customerCompareWealth > maxWealth) {
                maxWealth = customerCompareWealth;
            }
        }
        return maxWealth;
    }
}
