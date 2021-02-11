package leetcode.arrays.search;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int high = array.length - 1;
        int low = 0;
        int mid;
        int value = 71;

        while (low <= high) {
            mid = (high + low) / 2;

            if (value > array[mid]) {
                low = mid + 1;
            } else if (value < array[mid]) {
                high = mid - 1;
            }else{
                System.out.print(mid);
                return;
            }
        }
        System.out.print(-1);

    }
}
