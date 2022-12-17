package lesson1.tuananh;

public class Leetcode905 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] num = sortArrayByParity(nums);
        for (int i : num) {
            System.out.println(i);
        }
    }

    public static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int k = nums.length - 1;
        while (i < k) {
            if (nums[i] % 2 != 0) {
                while (nums[k] % 2 != 0 && k > i) {
                    k--;
                }
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
            }
            i++;
        }
        return nums;
    }
}
