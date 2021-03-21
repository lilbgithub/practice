/**
 * example utility
 */

import java.util.Arrays;

/**
 * Fizzbuzz:
 * For numbers 1-100, create a method that prints out the following.
 * 1. If the number is divisible by 3 output “Fuzz”
 * 2. If the number is divisible by 5 output “Buzz”
 * 3. If the number is divisible by 3&5 output “FuzzBuzz”
 * 4. If neither then output the number
 */
public class Util {
    public static final String INVALID_ARGUMENT = "Input string should not be null";

    public static void fuzBuz(Integer number) {
        if (number == null) {
            throw new IllegalArgumentException("Please enter valid input");
        }
        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) {
                System.out.println("FuzzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }

    }

    public static void main(String args[])
    {
        Util.fuzBuz(15);
    }

    /**
     *  function to return anagram
     * @param str1 input string1
     * @param str2 input string2
     * @return boolen result
     */
    public static boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException(INVALID_ARGUMENT);
        }

        if(str1.equals(str2)){
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            return true;
        }
        return false;
    }
}
