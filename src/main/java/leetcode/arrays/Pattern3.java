package leetcode.arrays;

public class Pattern3 {

    public static void main(String[] args) {
        int number = 5;
        int space = number - 1;
        int stars = 1;
        for (int i = 1; i <= number; i++) {

          //  System.out.println(space + "  " + stars);
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= stars; k++) {
                System.out.print("\t*");
            }
            System.out.println();
            space--;
            stars++;
        }
    }
}
