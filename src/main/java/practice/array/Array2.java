package practice.array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 5, 3, 1, 8 };
        fIndSubArrayWithGivenSum(arr, 9);
    }

    public static void fIndSubArrayWithGivenSum(int[] array, int k) {
        int start = 0;
        int end = 0;
        int sum = 0;

        while (end < array.length ) {
            sum = sum + array[end];
            if (sum == k) {
                System.out.println(sum + "is at i:" + start + " j:" + end);
                return;
            }
            while (sum > k && start <=end){
                sum = sum - array[start];
                start++;
                if (sum == k) {
                    System.out.println(sum + "is at i:" + start + " j:" + end);
                    return;
                }
            }
            end++;
        }
        System.out.println("NO such sub array");

    }
}
