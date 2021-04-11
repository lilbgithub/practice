package practice.array.Timespace;

import java.util.Arrays;

public class ZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 2, 1, 0};
        int i = 0; // i to k unknown, i-1 =1
        int k = arr.length - 1;//k+1 -> 2
        int j = 0; //0 to j-1 ->0, j to i-1 -> 1

        while (i <= k) {
            if (arr[i] == 0) {
                //swap j and i; increment j
                swap(arr, j, i);
                j++;
                i++;
            }else if(arr[i] == 1){
                swap(arr,i,j);
                i++;
            }else {
                swap(arr, i, k);
                k--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
