package lesson1.thaolinh;

public class _1979_Find_Greatest_Common_Divisor_of_Array {
    public int findGCD(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        // sắp xếp mảng theo chiều tăng dần, số bé nhất là index0, lớn nhất là index cuối.
        int small = nums[0];
        int big = nums[nums.length-1];

        // tìm ước chung là số mà cả 2 đều chia hết. Chạy i tăng dần đếnsố lớn, i cuối cùng là ước chung lớn nhất.
        int GCD = 1;
        for (int i = 1; i <= big; i++) {
            if (small % i == 0 && big % i == 0) {
                GCD = i;
            }
        }

        return GCD;
    }
}
