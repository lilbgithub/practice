package leetcode.recursion;

/**
 * https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/factorial-official/ojquestion
 */
public class Factorial {
    public static final String INVALID_INPUT = "Invalid input string";

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialIterative(5));
    }
    public static final int factorial(int n){
        if(n < 1){
            throw new IllegalArgumentException(INVALID_INPUT);
        }

        if(n ==1){
            return 1;
        }
        return n * factorial(n -1);
    }

    public static final int factorialIterative(int n){

        int fact = 1;
        for(int i= 1 ; i <= n ; i++){
            fact = fact * i;
        }
        return fact;
    }
}
