package BaiLuyenTap;

public class LeetCode1572 {

    class Solution {
        public int diagonalSum(int[][] mat) {
            int sum = 0;
            for(int i =0;i<mat.length;i++){
                sum += mat[i][i] + mat[i][mat.length-1-i];
            }
            if(mat.length % 2 != 0){
                sum -= mat[mat.length / 2] [mat.length / 2];
            }
            return sum;
        }
    }

}
