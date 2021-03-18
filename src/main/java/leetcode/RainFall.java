package leetcode;

public class RainFall {
    public static void main(String[] args) {
        int[] arr = {0, 2, 0, 3};
        int leftMax = 0;
        int rightMax = 0;
        int left = 0;
        int right = arr.length - 1;

        int water = 0;

        while (left <= right) {
            if (arr[left] < arr[right]) {
                //check left
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                    left++;
                } else {

                    water = water + leftMax - arr[left];
                    left++;
                }
            } else {
                //check right
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                    right--;
                } else {
                    water = water + rightMax - arr[right];
                    right--;
                }
            }

        }

        System.out.println("Water is : " + water);
    }
}
