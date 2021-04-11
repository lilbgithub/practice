package leetcode.arrays;

public class Pattern4 {
    public static void main(String[] args) {
        int number = 5;
        int spaces = 0;
        int stars = number;
        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= stars; k++) {
                System.out.print("\t*");
            }
            System.out.println();
            spaces++;
            stars--;
        }

    }
}
