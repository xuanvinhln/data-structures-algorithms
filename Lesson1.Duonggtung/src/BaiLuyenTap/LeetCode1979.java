package BaiLuyenTap;

public class LeetCode1979 {

    class Solution {
        public int findGCD(int[] nums) {
            int min = nums[0];
            int max = nums[0];
            int result = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] > max) {
                    max = nums[i];
                }
                if(nums[i] < min) {
                    min = nums[i];
                }
            }
            for(int i = 1; i<= max;i++){
                if(max % i ==0 && min % i == 0) {
                    result = i;
                }
            }
            return result;
        }
    }

}
