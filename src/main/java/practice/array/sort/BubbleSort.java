package practice.array.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 7, 4, 3, 1, -2};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - (1 + i); j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
