package leetcode.arrays.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {20, 5, 88, 30, 10, 50, 40};
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (isNextSmaller(array, j + 1, j)) {
                    swapCurrentWithNext(array, j + 1, j);

                }
            }
        }
        for (int item : array) {
            System.out.println(item);
        }

    }

    public static void swapCurrentWithNext(int[] array, int next, int current) {
        int temp = array[current];
        array[current] = array[next];
        array[next] = temp;
    }

    public static boolean isNextSmaller(int[] array, int next, int current) {
        if (array[next] < array[current]) {
            return true;
        }
        return false;
    }

}
