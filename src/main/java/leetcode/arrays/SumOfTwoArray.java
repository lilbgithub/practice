package leetcode.arrays;

/**
 * https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/sum-of-two-arrays-official/ojquestion
 */
public class SumOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] sum = new int[Math.max(arr1.length, arr2.length)];
        int carry = 0;

        int i = arr1.length - 1,
                j = arr1.length - 1,
                k = sum.length - 1;
        while (k >= 0) {
            int digit = carry;

            if (arr1[i] >= 0) {
                digit += arr1[i];
            }
            if (arr2[j] >= 0) {
                digit += arr2[j];
            }

            carry = digit / 10;
            digit = digit % 10;

            sum[k] = digit;

            i--;
            j--;
            k--;
        }
        if (carry > 0) {
            System.out.print(carry);
        }

        for (int element : sum) {
            System.out.println(element);
        }
    }
}
