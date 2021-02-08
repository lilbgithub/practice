package leetcode.arrays;

public class Pattern6 {
    public static void main(String[] args) {
        int number = 5;
        int stars = number / 2 + 1;
        int spaces = 1;

        for (int i = 1; i <= number; i++) {
            for (int k = 1; k <= stars; k++) {
                System.out.print("\t*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= stars; k++) {
                System.out.print("\t*");
            }

            // System.out.println(stars+" "+spaces + " " + stars);
            if (i <= number / 2) {
                stars--;
                spaces = spaces + 2;
            } else {
                stars++;
                spaces = spaces - 2;
            }
            System.out.println();
        }
    }
}
