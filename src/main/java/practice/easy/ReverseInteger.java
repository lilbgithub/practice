package practice.easy;

/**
 * Reverse integer
 * https://www.youtube.com/watch?v=-ToGzpENG5k&list=PLqq-6Pq4lTTZgXnsBNQwCWdKR6O6Cgk1Z&index=5
 *
 * make sure integer is within min max value, as reverse may max out value
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int number = 12345;
        int reminder;
        long reverse =0;
        while (number != 0) {
            reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
            if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
                throw new RuntimeException("Exception");
            }
        }
        System.out.println(reverse);

        System.out.println("Check if palindrome: " + isPalindrome(1221));
        System.out.println("Check if palindrome: " + isPalindrome(1321));
    }
    public static boolean isPalindrome(int number){

        int orginalNumber =  number;
        int reverse = 0;
        int remainder = 0;

        while (number != 0){
            remainder =  number%10;
            reverse = reverse * 10 + remainder;
            number = number /10;
        }

        if(reverse == orginalNumber){
            return true;
        }

        return false;
    }
}
