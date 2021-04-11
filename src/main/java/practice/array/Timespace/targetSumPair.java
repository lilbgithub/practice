package practice.array.Timespace;

import java.util.Arrays;

public class targetSumPair {
    public static void main(String[] args) {
        int[] arr = {12, 9, -48, 100, 43, 84, 74,86,34,-37,60,-29,44};
        int target = 160;
        int left = 0;
        int right = arr.length - 1;
        Arrays.sort(arr);

        while (left < right) {
            if (arr[left] + arr[right] > target) {
                right--;
            } else if (arr[left] + arr[right] < target) {
                left++;
            } else {
                System.out.println("Left " + arr[left] + " right:" +arr[right]);
                left++;
                right--;

            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
