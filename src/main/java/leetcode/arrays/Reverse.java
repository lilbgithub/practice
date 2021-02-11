package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        for (int item : array) {
            System.out.print(item);
        }

        List<Integer> lst = new ArrayList(Arrays.asList(1,2,3,5));
        Collections.reverse(lst);
        System.out.print(lst);

//        lst.stream().forEach(System.out::println);
//
//        List colors = new ArrayList(
//                Arrays.asList("100", "200", "300"));
//        System.out.println("Before Reversing: " + colors);
//
//        for (int i = 0, j = colors.size() - 1; i < j; i++) {
//            colors.add(i, colors.remove(j));
//        }
//
//        System.out.println("After Reversing: " + colors);
    }


}
