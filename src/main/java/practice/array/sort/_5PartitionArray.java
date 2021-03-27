package practice.array.sort;

import java.util.Arrays;

public class _5PartitionArray {
    /**
     *
     *
     *  if a[i] > pivot
     *   i++;
     *
     *   ifa[i] <=pivot
     *   a[j] = a[i]
     *   j++
     *   i++
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {4, 9, 7, 8, 3, 6, 2, 1};

        int i =0;
        int j=0;
        int pivot = 5;

        while (i<array.length){
            if(array[i] <= pivot){
                Utill.swap(array, i, j);
                j++;
            }
            i++;

        }
        System.out.println(Arrays.toString(array));
    }
}
