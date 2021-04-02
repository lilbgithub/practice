package interview;

import java.util.ArrayList;
import java.util.List;

/**
 * {1,2.3} add 2 -> {1,2,3,4}
 * {1,2,3} add 5 -> {1,2,3,4}
 */
public class Figure {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int k = 2;

        List<Integer> newList = new ArrayList<>();
        boolean flag = false;
        int index = 0;
        while (index < array.length) {
            int number = array[index];
            if (number == k) {
                newList.add(k);
                newList.add(number +1);
                flag = true;
            } else {
                if (flag) {
                    newList.add(number + 1);
                } else {
                    newList.add(number);
                }
            }
            index++;
        }
        System.out.println(newList);
    }
}
