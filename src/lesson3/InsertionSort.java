package lesson3;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 7, 5, 6, 8, 10, 9, 4};
        insertionSort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] arr) {
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            int value = arr[i];

            int j = i;
            while ((j > 0) && (arr[j-1] > value)) {
                arr[j] = arr[j-1];
                j = j - 1;
            }
            arr[j] = value;
        }
    }
}
