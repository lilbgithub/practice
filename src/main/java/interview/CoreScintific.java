package interview;

import java.util.Arrays;

public class CoreScintific {
    /**
     * Input: [0,1,0,5,2]
     * Output: [1,5,2,0,0]
     * Note:
     * You must do this in-place without making a copy of the array.
     * @param args
     */
    public static void main(String[] args) {
        int [] array =  {0,1,0,5,2};
        nonWorkingSolution(array);
    }
    private static void nonWorkingSolution(int[] array) {
        int length = array.length - 1;
        int i = length;
        int j = length;

        while (i>=0){
            if(array[i] != 0){
                i--;
            }else {
                swap(array, i, j);
                i--;
                j--;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int i, int j){
        int temp =  array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
