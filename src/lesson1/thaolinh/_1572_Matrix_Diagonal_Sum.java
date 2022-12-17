package lesson1.thaolinh;

public class _1572_Matrix_Diagonal_Sum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j || i == mat.length - 1 - j) {   //vị trí của đường chéo là i == j || i == mat.length - 1 - j
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
