package lesson1.thaolinh;

public class _1672_Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {        //tính wealth của từng người bằng cách tính tổng từng hàng
            int iWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                iWealth += accounts[i][j];
            }
            if (iWealth > maxWealth) {              //nếu wealth của người đó lớn hơn max thì gán cho max.
                maxWealth = iWealth;
            }
        }
        return maxWealth;
    }
}
