package lesson1.thaolinh;

import java.util.Arrays;

public class _88_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for (int i = m; i < nums1.length; i++) {   //nối nums 2 vào cuối nums1 kể từ phần tử m trở đi
            nums1[i] = nums2[k];
            k++;
        }
        Arrays.sort(nums1);   // sắp xếp lại theo chiều tăng dần
    }
}
