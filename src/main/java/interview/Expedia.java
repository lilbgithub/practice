package interview;

import java.util.ArrayList;
import java.util.List;

/**
 * Given array [1,2,3] and k=4
 * Find the sub array and total number of sub arrays where product of numbers in subarray is <=offset
 */
public class Expedia {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int offset = 6;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                List<Integer> subList = new ArrayList<>();
                for (int k = i; k < j; k++) {
                    subList.add(array[k]);
                }
                if (isValidSubArray(subList, offset)) count++;
            }
        }

        System.out.println("count is "+ count);
    }

    public static boolean isValidSubArray(List<Integer> list, int offset) {
        int result = 1;
        for (Integer number : list) {
            result = result * number;
        }
        if (result <= offset) return true;
        return false;
    }
}
