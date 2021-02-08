package easy;

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
    }
}
