package practice.array.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 7, 4, 3, 1, -2};
        for(int i=1; i<array.length;i++ ){
            for(int j=i-1; j >=0;j--){
                if(array[j] > array[j+1]){
                    Utill.swap(array,j, j+1);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
