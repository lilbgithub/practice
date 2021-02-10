package leetcode.arrays;

public class Pattern5 {
    public static void main(String[] args) {
        int number = 5;
        int spaces = number / 2;
        int stars = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= stars; k++) {
                System.out.print("\t*");
            }
           // System.out.println(spaces + " " + stars);
            System.out.println();
            if (i <= 2) {

                spaces--;
                stars = stars + 2;

            } else {
                spaces++;
                stars =stars-2;
            }

        }
    }
}
/*
2 1
1 3
0 5
1 3
2 1
*/

