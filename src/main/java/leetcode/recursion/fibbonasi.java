package leetcode.recursion;

public class fibbonasi {
    public static void main(String[] args) {
        System.out.println(fibbo(0));
        System.out.println(fibbo(0));
    }

    public static final int fibbo(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibbo(n - 1) + fibbo(n - 2);

    }

    public static int fibbo2(int n) {
        if (n < 2) {
            return n;
        }
        return fibbo2(n) + fibbo2(n - 1);
    }
}
