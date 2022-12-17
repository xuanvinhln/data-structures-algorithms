package lesson1.huuan;

public class Leetcode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums2Pointer = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[nums2Pointer];
            nums2Pointer++;
        }
        sort(nums1, nums1.length - 1, 0);
    }

    private void sort(int[] nums1, int highIndex, int lowIndex) {
        int pivot = nums1[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        if (leftPointer >= rightPointer){
            return;
        }
        while (leftPointer < rightPointer){
            while (leftPointer < rightPointer && nums1[leftPointer] <= pivot){
                leftPointer++;
            }
            while (leftPointer < rightPointer && nums1[rightPointer] >= pivot){
                rightPointer--;
            }
            swap(nums1, leftPointer, rightPointer);
        }
        swap(nums1, leftPointer, highIndex);
        if (leftPointer != 0){
            sort(nums1, leftPointer-1, lowIndex);
        }
        sort(nums1, highIndex, leftPointer+1);
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
