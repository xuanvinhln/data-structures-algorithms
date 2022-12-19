package BaiLuyenTap;

import java.util.Arrays;

public class LeetCode561 {

    class Solution {
        public int arrayPairSum(int[] nums) {
            int sum = 0;
            // for(int i =0;i<nums.length;i++) {
            //     for(int j = i+1;j<nums.length;j++){
            //         if(nums[i] > nums[j]) {
            //             int temp = nums[i];
            //             nums[i] = nums[j];
            //             nums[j] = temp;
            //         }
            //     }
            // }
            Arrays.sort(nums);
            int n = nums.length;
            for(int i=0;i<n;i+=2) {
                sum += nums[i];
            }
            return sum;
        }
    }

}
