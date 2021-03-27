package practice.array.sort;

import java.util.Arrays;

public class _012Sort {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 1, 2, 0, 2, 0, 1, 0,2,2};
        demo012(array);
    }

    public static void demo012(int[] array) {
        int i = 0;//i to k end unknown ,
        int j = 0;//0 to j-1 -> 0s, j to i ->1s
        int k = array.length - 1;// k to end ->2s

        while (i <= k) {
            if (array[i] == 0) {
                swap(array, j, i);
                j++;
                i++;
            } else if (array[i] == 2) {
                swap(array, k, i);
                k--;
            } else if(array[i] == 1) {
                i++;
            }
        }
        System.out.println(Arrays.toString(array));

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

