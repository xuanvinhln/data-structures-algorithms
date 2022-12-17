package lesson1.huuan;

public class Leetcode1979 {
    public int findGCD(int[] nums) {
        int ans = 1;
        int numsMin = nums[0];
        int numsMax = nums[nums.length - 1];
        for (int numb : nums) {
            if (numsMin > numb) {
                numsMin = numb;
                continue;
            }
            if (numsMax < numb) {
                numsMax = numb;
            }
        }
        if (numsMax % numsMin == 0){
            return numsMin;
        }
        for (int i = 2; i <= numsMin/2; i++) {
            if ((numsMin % i == 0) && (numsMax % i == 0)){
                ans = i;
            }
        }
        return ans;
    }
}
