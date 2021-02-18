package leetcode.recursion;

public class PrintDecreasing {
    public static void main(String[] args) {
        printDecrease(5);
    }

    public static final void printDecrease(int n) {

        if (n == 0) {
            return;
        }

        printDecrease(n - 1);

        System.out.println(n);
    }
}
