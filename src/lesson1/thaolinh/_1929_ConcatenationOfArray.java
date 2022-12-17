package lesson1.thaolinh;

public class _1929_ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {

        int[] ans = new int[2 * nums.length];   // tạo một mảng mới kích thước gấp đôi mảng ban đầu

        for (int i = 0; i < nums.length; i++) {  //tại mảng mới, phần tử vị trí i bằng vị trí (độ dài mảng ban đầu+1)
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;
    }
}
