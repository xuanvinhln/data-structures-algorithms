package lesson1.huuan;

public class Leetcode27 {
    public int removeElement(int[] nums, int val) {
        int countElementAfterRemove = 0;
        int indexNonRemovedElement = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]){
                int temp = nums[i];
                nums[i] = nums[indexNonRemovedElement];
                nums[indexNonRemovedElement] = temp;
                indexNonRemovedElement++;
                countElementAfterRemove++;
            }
        }
        return countElementAfterRemove;
    }
}
