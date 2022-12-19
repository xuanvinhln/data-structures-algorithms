package lesson1.huuan;

public class Leetcode1512 {
    public int numIdenticalPairs(int[] nums) {
        sort(nums, 0, nums.length - 1);
        int temp = nums[0];
        int n = 0;
        int ans = 0;
        for (int numb : nums) {
            if (temp == numb) {
                n++;
            } else {
                if (n > 1) {
                    ans += calculateCombination(2, n);
                }
                temp = numb;
                n = 1;
            }
        }
        if (n > 1) {
            ans += calculateCombination(2, n);
        }
        return ans;
    }

    private int calculateCombination(int k, int n) {
        if (n == k){
            return 1;
        }
        int numerator = 1;
        for (int i = n - k + 1; i < n + 1; i++) {
            numerator *= i;
        }
        int denominator = 1;
        for (int i = 1; i < k + 1; i++) {
            denominator *= i;
        }
        return (numerator / denominator);
    }

    private void sort(int[] nums, int lowIndex, int highIndex) {
        int pivot = nums[highIndex];
        int rightPointer = highIndex;
        int leftPointer = lowIndex;
        if (leftPointer >= rightPointer) {
            return;
        }
        while (leftPointer < rightPointer) {
            while (leftPointer < rightPointer && nums[leftPointer] <= pivot) {
                leftPointer++;
            }
            while (leftPointer < rightPointer && nums[rightPointer] >= pivot) {
                rightPointer--;
            }
            swap(nums, leftPointer, rightPointer);
        }
        swap(nums, leftPointer, highIndex);
        if (leftPointer != 0) {
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
