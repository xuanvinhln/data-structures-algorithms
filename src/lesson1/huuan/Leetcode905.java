package lesson1.huuan;

public class Leetcode905 {
    public int[] sortArrayByParity(int[] nums) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        while (leftPointer < rightPointer){
            while (leftPointer < rightPointer && nums[leftPointer] % 2 == 0){
                leftPointer++;
            }
            while (leftPointer < rightPointer && nums[rightPointer] % 2 != 0){
                rightPointer--;
            }
            swap(nums, leftPointer, rightPointer);
        }
        return nums;
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
