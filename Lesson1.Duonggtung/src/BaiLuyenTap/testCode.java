package BaiLuyenTap;

import java.util.Arrays;
import java.util.Scanner;

public class testCode {

    public static void main(String[] args) {
//            int m = new Scanner(System.in).nextInt();
//            int n = new Scanner(System.in).nextInt();
//            int[][] mat = new int[m][n];
//            for (int i =0;i<m;i++){
//                for(int j = 0;j<n;j++){
//                    mat[i][j] = new Scanner(System.in).nextInt();
//                }
//            }

        int n = new Scanner(System.in).nextInt();
        int[] nums = new int[n];
        int[] arr = new int[n];
        for (int  i = 0;i<n;i++){
            nums[i] = new Scanner(System.in).nextInt();
        }
        int j=0;
        int k = n-1;
        for(int i =0;i<n;i++) {
            if(nums[i] % 2 == 0){
                arr[j] = nums[i];
                j++;
            }else{
                arr[k] = nums[i];
                k--;
            }
        }
        for (int  i = 0;i<n;i++){
            System.out.println(arr[i]);
        }

    }

}
