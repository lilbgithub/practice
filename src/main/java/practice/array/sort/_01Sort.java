package practice.array.sort;

import java.util.Arrays;

public class _01Sort {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 1, 1, 0, 0, 0, 1, 0};
        demo01(array);
    }

    public static void demo01(int[] array) {
        int i = 0;//i to end unknown and j to i-1 -> 1
        int j = 0;//j-1 ->0

        while (i < array.length) {
            if (array[i] == 0) {
                Utill.swap(array, i, j);
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}
