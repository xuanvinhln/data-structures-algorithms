package lesson1.thaolinh;

public class _1480_Running_Sum_of_1d_Array {
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int x = 0;  //x là tổng cộng dồn

        for (int i = 0; i < nums.length; i++) {  //ở mỗi vị trí i, cộng thêm giá trị tại i cho x
            x = x + nums[i];
            ans[i] = x;
        }
        return ans;
    }
}
