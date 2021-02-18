package leetcode.recursion;

/**
 * https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/factorial-official/ojquestion
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static final int factorial(int n){

        if(n ==1){
            return 1;
        }
        int factNm1 = factorial(n -1);
        int fact = n * factNm1;
        return fact;
    }
}
