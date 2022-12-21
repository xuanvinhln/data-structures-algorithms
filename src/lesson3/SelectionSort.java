package lesson3;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 9, 8, 10, 8, 7, 10, 8, 4, 2, 1};
        selectionSort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] arr) {
        int length = arr.length;

        for (int i = length - 1; i > 0; i--) {

            int indexOfCurrentMax = i;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[indexOfCurrentMax]) {
                    indexOfCurrentMax = j;
                }
            }

            // swap arr[i] with arr[indexOfCurrentMax]
            int temp = arr[i];
            arr[i] = arr[indexOfCurrentMax];
            arr[indexOfCurrentMax] = temp;
        }
    }

    public static void selectionSort2(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[indexOfMin]) {
                    indexOfMin = j;
                }
            }

            // swap arr[i] with arr[indexOfMin]
            int temp = arr[i];
            arr[i] = arr[indexOfMin];
            arr[indexOfMin] = temp;
        }
    }
}
