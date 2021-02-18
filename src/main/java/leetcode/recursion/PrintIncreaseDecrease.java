package leetcode.recursion;

public class PrintIncreaseDecrease {
    public static void main(String[] args) {
        printDecreasingIncreasing(5);
    }

    public static void printDecreasingIncreasing(int n) {
        if(n == 0){
            return;
        }
        System.out.println(n);

        printDecreasingIncreasing(n -1);
        System.out.print("increasing");
        System.out.println(n);
    }
}
