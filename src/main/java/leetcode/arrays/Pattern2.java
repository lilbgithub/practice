package leetcode.arrays;

public class Pattern2 {
    public static void main(String[] args) {
        int number = 5;
        for (int i = number; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
