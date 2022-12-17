package lesson1.thaolinh;

import java.util.Arrays;

public class _561_Array_Partition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        //sắp xếp mảng từ bé đến lớn
        // {6,2,6,5,1,2} -> {1,2,2,5,6,6}

        //chia mảng thành các cặp 2 số, lấy số min trong cặp đó -> lấy index chẵn trong mảng
        //  {1,2,2,5,6,6}  ->  | 1,2 | 2,5 | 6,6 |

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                max += nums[i];
            }
        }
        return max;
    }
}
