package lesson1.tuananh;

public class Leetcode1979 {
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        int temp = max % min;
        while (temp > 0) {
            max = min;
            min = temp;
            temp = max % min;
        }
        return min;
    }
}
