package lesson1.huuan;

public class Leetcode561 {
    public int arrayPairSum(int[] nums) {
        sort(nums, 0, nums.length-1);
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0){
                ans += nums[i];
            }
        }
        return ans;
    }

    private void sort(int[] nums, int lowIndex, int highIndex){
        int pivot = nums[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        if (leftPointer >= rightPointer){
            return;
        }
        while (leftPointer < rightPointer){
            while (leftPointer < rightPointer && nums[leftPointer] <= pivot){
                leftPointer++;
            }
            while (leftPointer < rightPointer && nums[rightPointer] >= pivot){
                rightPointer--;
            }
            swap(nums, leftPointer, rightPointer);
        }
        swap(nums, leftPointer, highIndex);
        if (leftPointer != 0){
            sort(nums, lowIndex, leftPointer - 1);
        }
        sort(nums, leftPointer + 1, highIndex);
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
