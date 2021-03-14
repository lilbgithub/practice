package practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        //spanOfArray();
        // sumOfArray();
        // reverseDemo();
        // rotate();
       // subArray();
       // binarySearch();
        findLastIndex();
    }
    public static void findLastIndex() {
        int[] arr  = {1,2,3,4,4,5};
        int k=4;

        int li = -1;
        int left = 0;
        int right = arr.length-1;

        while (left<=right)
        {
            int mid = (left +right) / 2;
            if(k <arr[mid]){
                right = mid-1;
            }else if(k >arr[mid]){
                left = mid +1;
            }else {
                li =  mid;
                left = mid + 1;
            }
        }
        System.out.println("last index is : " +li);

    }
    public static void binarySearch() {
        int[] arr = {1,2,3,4,5};
        int k = 5;

        int left = 0;
        int right = arr.length;

        while (left < right){
            int mid = (left +right) /2;
            if( k < arr[mid]){
                right = mid -1;
            }else if(k > arr[mid]){
                left = mid +1;
            }else {

                System.out.println("k is at location: " + mid);
                break;
            }



        }


    }
    public static void subArray() {
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        List<Character[]> subArray = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                List<Character> list = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    list.add(arr[k]);
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
                System.out.println(Arrays.toString(list.toArray()));
            }
        }

    }

    public static void rotate() {
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        int k = 2;

        //part 1 reverse
        reveseCustom(arr, 0, arr.length - k - 1);
        //part 2 reverse
        reveseCustom(arr, arr.length - k, arr.length - 1);
        //all reverse
        reveseCustom(arr, 0, arr.length - 1);

        System.out.println("Rotated array: " + Arrays.toString(arr));


    }

    public static void reveseCustom(char[] arr, int left, int right) {

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void reverseDemo() {
        int[] arr = {1, 2, 3, 4, 5};
        int min = 0;
        int max = arr.length - 1;

        while (min < max) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
            min++;
            max--;
        }
        System.out.println("result : " + Arrays.toString(arr));

    }

    public static void spanOfArray() {
        int[] array = {3, 4, 6, 7, 9, 3, 5, 1};
        int min = array[0];
        int max = array[1];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        int diff = max - min;
        System.out.println("spanOfArray" + diff);
    }

    public static void sumOfArray() {
        int[] arr1 = {8, 9, 9};
        int[] arr2 = {0, 2, 1};
        int[] result = new int[Math.max(arr1.length, arr2.length)];

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = result.length - 1;
        int carry = 0;
        int digit;
        while (k >= 0) {
            digit = carry;
            if (arr1[i] >= 0) {
                digit = digit + arr1[i];
            }
            if (arr2[j] >= 0) {
                digit = digit + arr2[j];
            }
            carry = digit / 10;
            digit = digit % 10;

            result[k] = digit;
            i--;
            j--;
            k--;
        }
        if (carry > 0) {
            System.out.print(carry);
        }
        for (int value : result) {
            System.out.print(value);
        }
    }
}
