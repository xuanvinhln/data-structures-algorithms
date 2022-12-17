package lesson1.thaolinh;

public class _27_Remove_Element {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int k = nums.length - 1;

        // i chạy từ đầu đi, k chạy từ cuối về
        for (int i = 0; i < nums.length; ) {
            if (nums[i] == val) {    // bắt gặp nums[i] ==val thì tráo nums[k] ở cuối lên nums[i], giảm k--, ko đổi i để duyệt lại nums[k] vừa tráo về
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k--;
            } else {                //nếu nums[i]!=val thì bỏ qua, i++ duyệt sang i tiếp theo.
                i++;
            }

            if (i > k) {  //i tiến lên và k lùi về, giao nhau thì break vì đã duyệt đủ theo chiều đi và chiều về
                count = i;
                break;
            }
        }
        return count;
    }

}
