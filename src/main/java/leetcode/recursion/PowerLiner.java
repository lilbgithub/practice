package leetcode.recursion;

/**
 * https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/power-linear-official/ojquestion
 */
public class PowerLiner {
    public static void main(String[] args) {
        System.out.println(powerLiner(4, 2));
    }
    public static final int powerLiner(int n, int power){

        if(power == 1){
            return n;
        }
        int result = n * powerLiner(n,power-1);
        return result;
    }
}
