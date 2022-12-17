package lesson1.thaolinh;

public class _905_Sort_Array_By_Parity {
    public int[] sortArrayByParity(int[] nums) {  //số chẵn dồn lên đầu số lẻ dồn xuống cuối
        int k = nums.length - 1;
        for (int i = 0; i < nums.length; ) {  //i chạy trái sang, k chạy từ phải sang
            if (nums[i] % 2 != 0) {  // numsi lẻ thì swap numsi và numsk để cho lẻ xuống cuối,
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k--;                //giảm k, ko tăng i để duyệt lại phần tử vừa swap từ cuối về.
            } else {
                i++;                //nếu numsi chẵn thì giữ nguyên, tăng i để duyệt phần tử tiếp theo
            }

            if (i >= k) {           // i và k giao nhau thì break vì đã duyệt hết phần tử theo hai chiều trái và phải
                break;
            }

        }
        return nums;
    }
}
