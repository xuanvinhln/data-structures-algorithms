package lesson1.array;

public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }

    public int removeElement2(int[] nums, int val) {
        int newLength = nums.length;

        for (int i = 0; i < newLength; i++) {
            while (nums[i] == val && i < newLength) {
                //Shifting array
                for (int j = i; j < newLength - 1; j++) {
                    nums[j] = nums[j+1];
                }
                newLength--;
            }
        }

        return newLength;
    }
}
