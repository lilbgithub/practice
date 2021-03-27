package practice.array.sort;

import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        int[] array = {12, 9, -48, 100, 43, 84, 74, 86, 34, -37, 60, -29, 44};
        int target = 160;

        Arrays.sort(array);

        int left = 0;
        int right = array.length -1;

        while (left <= right) {
            int sum = array[left] + array[right];

            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                int result = array[right] + array[left];
                System.out.println(array[left] + " is left and right at " + array[right] +" sum is "+ result );
                left++;
                right--;
            }
        }
    }
}
