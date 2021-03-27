package practice.recursion;

public class Recursion {
    public static void main(String[] args) {
        //printReverse(5);
        //printIncreasing(5);
        //printDecreasingIncreasing(5);
        powerLiner(9, 2);

    }

    public static int powerLiner(int n, int power) {
        if (n == 0) {
            return 1;
        }
        powerLiner(n, power - 1);
        n = n + n;
        System.out.println(n);
        return n;


    }

    public static void printDecreasingIncreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasingIncreasing(n - 1);
        System.out.println(n);
    }

    public static void printReverse(int n) {
        System.out.println(n);
        if (n == 1) {
            return;
        }
        printReverse(n - 1);
    }

    public static void printIncreasing(int n) {
        if (n == 0) {
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
    }


}
