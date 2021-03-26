package practice.array.sort;


import java.util.Arrays;

public class SeelectionSort {
    public static void main(String[] args) {
        int[] array = {5, 7, 4, 3, 1, -2};
        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for(int j= i+1; j< array.length; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            Utill.swap(array, i, min);
        }
        System.out.println(Arrays.toString(array));
    }
}
